package Listener;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class MyServletContextListenerImpl implements ServletContextListener {
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.out.println("servletcontext对象被创建了");
    }

    public void contextDestroyed(ServletContextEvent servletContextEvent) {
        System.out.println("servletcontext对象被销毁了");
    }
}
