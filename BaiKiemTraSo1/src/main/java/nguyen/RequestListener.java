package nguyen;

import javax.servlet.ServletContext;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class RequestListener implements ServletRequestListener {
    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        ServletContext context = sre.getServletContext();
        Integer count = (Integer) context.getAttribute("requestCount");
        if (count == null) {
            count = 0;
        }
        count++;
        context.setAttribute("requestCount", count);
    }
}