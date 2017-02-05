package my.project.autodealer.controller.listeners; /**
 * Created by Nikol on 2/5/2017.
 */

import my.project.autodealer.dao.DatabaseManagerHibernate;
import my.project.autodealer.services.Service;
import my.project.autodealer.services.ServiceImpl;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;
import javax.servlet.http.HttpSessionBindingEvent;

public class ServletContextListenerImpl implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Service service = new ServiceImpl(new DatabaseManagerHibernate());
        servletContextEvent.getServletContext().setAttribute("service", service);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
