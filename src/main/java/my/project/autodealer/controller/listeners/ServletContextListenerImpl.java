package my.project.autodealer.controller.listeners; /**
 * Created by Nikol on 2/5/2017.
 */

import my.project.autodealer.services.Service;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class ServletContextListenerImpl implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        final WebApplicationContext springContext = WebApplicationContextUtils.getWebApplicationContext(event.getServletContext());
        Service service = springContext.getBean(Service.class);
        event.getServletContext().setAttribute("service", service);
        addReferenciesToServletContext(event.getServletContext(), service);
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
