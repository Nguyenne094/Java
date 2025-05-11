package filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;

@WebListener
public class AppContextListener implements ServletContextListener {
	@Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("Ứng dụng được khởi động.");
        sce.getServletContext().setAttribute("visitCount", 0);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Ứng dụng đã bị dừng.");
    }
}
