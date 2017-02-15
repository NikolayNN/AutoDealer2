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
    Service service;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        try {
            service = (Service) request.getServletContext().getAttribute("service");
            service.saveAdvert(createAdvert(request));
        } catch (Exception ex) {
            ex.printStackTrace();
            request.setAttribute("message", ex.getMessage());
            request.getRequestDispatcher("error.jsp").forward(request, response);
        }
    }

    private Advert createAdvert(HttpServletRequest request) {
        return new Advert(
                createCar(request),
                getSessionUser(request),
                service.loadStatus(request.getParameter("status")),
                new Date().getTime() / 1000);
    }

    private Car createCar(HttpServletRequest request) {
        return new Car(createMakerInfo(request), createOwnerInfo(request));
    }

    private User getSessionUser(HttpServletRequest request) {
        return (User) request.getSession().getAttribute("user");
    }

    private MakerInfo createMakerInfo(HttpServletRequest request) {
        return new MakerInfo(
                service.loadMaker(request.getParameter("maker")),
                service.loadModel(request.getParameter("model")),
                service.loadCarBody(request.getParameter("body")),
                service.loadTransmission(request.getParameter("transmission")),
                service.loadFuelType(request.getParameter("fuelType")),
                Short.parseShort(request.getParameter("capacity")),
                Short.parseShort(request.getParameter("year")));
    }

    private OwnerInfo createOwnerInfo(HttpServletRequest request) {
        return new OwnerInfo(
                Integer.parseInt(request.getParameter("mileage")),
                request.getParameter("description"),
                Integer.parseInt(request.getParameter("price")),
                service.loadCondition(request.getParameter("condition")));
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("secret/addNewAdvert.jsp").forward(request, response);
    }
}
