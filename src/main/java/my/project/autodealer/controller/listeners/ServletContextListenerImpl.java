package my.project.autodealer.controller.listeners; /**
 * Created by Nikol on 2/5/2017.
 */

import my.project.autodealer.dao.DatabaseManagerHibernate;
import my.project.autodealer.services.Service;
import my.project.autodealer.services.ServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImpl implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Service service = new ServiceImpl(new DatabaseManagerHibernate());
        servletContextEvent.getServletContext().setAttribute("service", service);
        servletContextEvent.getServletContext().setAttribute("makers", service.getAutoMakers());
        servletContextEvent.getServletContext().setAttribute("models", service.getAutoModels());
        servletContextEvent.getServletContext().setAttribute("bodies", service.getCarBodies());
        servletContextEvent.getServletContext().setAttribute("transmissions", service.getTransmissions());
        servletContextEvent.getServletContext().setAttribute("fuelTypes", service.getFuelTypes());
        servletContextEvent.getServletContext().setAttribute("conditions", service.getConditions());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
