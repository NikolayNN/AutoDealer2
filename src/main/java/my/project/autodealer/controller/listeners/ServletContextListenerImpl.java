package my.project.autodealer.controller.listeners; /**
 * Created by Nikol on 2/5/2017.
 */

import my.project.autodealer.dao.DatabaseManagerHibernate;
import my.project.autodealer.services.Service;
import my.project.autodealer.services.ServiceImpl;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImpl implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Service service = new ServiceImpl(new DatabaseManagerHibernate());
        servletContextEvent.getServletContext().setAttribute("service", service);
        addReferenciesToServletContext(servletContextEvent.getServletContext(), service);
    }

    private void addReferenciesToServletContext(ServletContext servletContext, Service service){
        servletContext.setAttribute("makers", service.getAutoMakers());
        servletContext.setAttribute("models", service.getAutoModels());
        servletContext.setAttribute("bodies", service.getCarBodies());
        servletContext.setAttribute("transmissions", service.getTransmissions());
        servletContext.setAttribute("fuelTypes", service.getFuelTypes());
        servletContext.setAttribute("conditions", service.getConditions());
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
