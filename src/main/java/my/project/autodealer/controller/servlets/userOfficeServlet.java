package my.project.autodealer.controller.servlets;

import my.project.autodealer.model.Advert;
import my.project.autodealer.model.User;
import my.project.autodealer.services.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Nikol on 2/15/2017.
 */
public class userOfficeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final int ADVERTS_ON_PAGE = 2;
        Service service = (Service) request.getServletContext().getAttribute("service");
        User user = (User) request.getSession().getAttribute("user");
        long advertsCount = service.receiveUserAdvertsCount(user);
        long pagesCount = advertsCount / ADVERTS_ON_PAGE; //todo make constant
        long currentPage = setCurrentPageNumber(request, pagesCount);
        List<Advert> adverts = service.getAdvertsByPageForUser((int) currentPage, ADVERTS_ON_PAGE, user);
        request.setAttribute("nextPage", setNextPageNumber(currentPage, pagesCount));
        request.setAttribute("previousPage", setPreviousPageNumber(currentPage));
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("adverts", adverts);
        request.setAttribute("advertsCount", advertsCount);
        request.setAttribute("pagesCount", pagesCount);
        request.getRequestDispatcher("view/secret/userOffice.jsp").forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
    }

    private long setCurrentPageNumber(HttpServletRequest request, long pagesCount) {
        long currentPage;
        if (request.getParameter("page") != null && (Long.parseLong(request.getParameter("page")) <= pagesCount )) {
            currentPage = Long.parseLong(request.getParameter("page"));
        } else {
            currentPage = 0;
        }
        return currentPage;
    }

    private long setNextPageNumber(long currentPage, long pagesCount) {
        if (currentPage >= pagesCount) {
            return pagesCount;
        } else {
            return currentPage + 1;
        }
    }

    private long setPreviousPageNumber(long currentPage) {
        if (currentPage <= 0) {
            return 0;
        } else {
            return currentPage - 1;
        }
    }
}
