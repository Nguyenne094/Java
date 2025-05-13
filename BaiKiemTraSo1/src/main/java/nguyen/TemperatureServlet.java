package nguyen;

   import javax.servlet.ServletException;
   import javax.servlet.annotation.WebServlet;
   import javax.servlet.http.HttpServlet;
   import javax.servlet.http.HttpServletRequest;
   import javax.servlet.http.HttpServletResponse;
   import java.io.IOException;

   @WebServlet("/convert")
   public class TemperatureServlet extends HttpServlet {
       /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
               throws ServletException, IOException {
           String tempStr = request.getParameter("temperature");
       String type = request.getParameter("type");
       double result = 0;
       boolean valid = true;

       try {
           double temp = Double.parseDouble(tempStr);
           if ("c2f".equals(type)) {
               result = temp * 9 / 5 + 32;
               request.setAttribute("result", temp + "°C = " + String.format("%.2f", result) + "°F");
           } else {
               result = (temp - 32) * 5 / 9;
               request.setAttribute("result", temp + "°F = " + String.format("%.2f", result) + "°C");
           }
       } catch (NumberFormatException e) {
           valid = false;
           request.setAttribute("error", "Vui lòng nhập một số hợp lệ.");
       }

       request.setAttribute("valid", valid);
       request.getRequestDispatcher("/temp.jsp").forward(request, response);
       }
   }