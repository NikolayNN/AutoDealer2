package my.project.autodealer.controller.servlets;

import my.project.autodealer.model.*;
import my.project.autodealer.services.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Nikol on 2/7/2017.
 */
public class AddNewAdvertServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Service service = (Service) request.getServletContext().getAttribute("service");
        service.saveAdvert(createAdvert(request));
    }

    private Advert createAdvert(HttpServletRequest request){
        return new Advert(
                createCar(request),
                new Date().getTime(),
                getSessionUser(request),
                request.getParameter("status"));
    }

    private Car createCar(HttpServletRequest request){
        return new Car(createMakerInfo(request), createOwnerInfo(request));
    }

    private User getSessionUser(HttpServletRequest request){
        return (User) request.getSession().getAttribute("user");
    }

    private MakerInfo createMakerInfo(HttpServletRequest request){
        return new MakerInfo(
                request.getParameter("maker"),
                request.getParameter("model"),
                request.getParameter("body"),
                request.getParameter("transmission"),
                request.getParameter("fuelType"),
                Integer.parseInt(request.getParameter("capacity")),
                Integer.parseInt(request.getParameter("year")));
    }

    private OwnerInfo createOwnerInfo(HttpServletRequest request){
        return new OwnerInfo(
                Integer.parseInt(request.getParameter("mileage")),
                request.getParameter("condition"),
                request.getParameter("description"),
                Integer.parseInt(request.getParameter("price")));
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("secret/addNewAdvert.jsp").forward(request, response);
    }
}
