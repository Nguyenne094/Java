package nguyen;

   import javax.servlet.*;
   import javax.servlet.annotation.WebFilter;
   import javax.servlet.http.HttpServletRequest;
   import javax.servlet.http.HttpServletResponse;
   import java.io.IOException;

   @WebFilter("/convert")
   public class TempFilter implements Filter {
       public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
               throws IOException, ServletException {
           HttpServletRequest req = (HttpServletRequest) request;
           HttpServletResponse resp = (HttpServletResponse) response;
           String temp = req.getParameter("temperature");

           if (temp == null || temp.trim().isEmpty()) {
               req.setAttribute("error", "Vui lòng nhập giá trị nhiệt độ.");
               req.getRequestDispatcher("/temp.jsp").forward(req, resp);
               return;
           }

           try {
               Double.parseDouble(temp);
               chain.doFilter(request, response);
           } catch (NumberFormatException e) {
               req.setAttribute("error", "Giá trị nhiệt độ phải là một số hợp lệ.");
               req.getRequestDispatcher("/temp.jsp").forward(req, resp);
           }
       }
   }
