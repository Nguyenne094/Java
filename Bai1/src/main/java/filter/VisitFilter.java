package filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.*;
import java.io.IOException;

@WebFilter("/*")
public class VisitFilter implements Filter {
	@Override
	public void doFilter(ServletRequest request, ServletResponse response,
            FilterChain chain) throws IOException, ServletException {
		HttpServletRequest req = (HttpServletRequest) request;
        HttpSession session = req.getSession();

        if (session.getAttribute("visited") == null) {
            ServletContext context = req.getServletContext();
            Integer count = (Integer) context.getAttribute("visitCount");
            if (count == null) count = 0;
            context.setAttribute("visitCount", count + 1);
            session.setAttribute("visited", true);
        }

        chain.doFilter(request, response);
		
	}
}
