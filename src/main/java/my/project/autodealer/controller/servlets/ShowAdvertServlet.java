package my.project.autodealer.controller.servlets;

import my.project.autodealer.dao.repositories.Advert;
import my.project.autodealer.services.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * Created by Nikol on 2/12/2017.
 */
public class ShowAdvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        final int ADVERTS_ON_PAGE = 5;
        Service service = (Service) request.getServletContext().getAttribute("service");
        long advertsCount = service.recieveAdvertsCount();
        long pagesCount = advertsCount / ADVERTS_ON_PAGE; //todo make constant
        long currentPage = setCurrentPageNumber(request, pagesCount);
        List<Advert> adverts = (List<Advert>) service.getAdvertsByPage((int) currentPage, ADVERTS_ON_PAGE);
        request.setAttribute("nextPage", setNextPageNumber(currentPage, pagesCount));
        request.setAttribute("previousPage", setPreviousPageNumber(currentPage));
        request.setAttribute("currentPage", currentPage);
        request.setAttribute("adverts", adverts);
        request.setAttribute("advertsCount", advertsCount);
        request.setAttribute("pagesCount", pagesCount);
        request.getRequestDispatcher("main.jsp").forward(request, response);
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
