package nguyen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/QuadraticServlet")
public class QuadraticServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		double c = Double.parseDouble(request.getParameter("c"));

		String result;

		double delta = b * b - 4 * a * c;
		if (a == 0) {
			result = "Không phải phương trình bậc hai.";
		} else if (delta > 0) {
			double x1 = (-b + Math.sqrt(delta)) / (2 * a);
			double x2 = (-b - Math.sqrt(delta)) / (2 * a);
			result = "Hai nghiệm phân biệt: x1 = " + x1 + ", x2 = " + x2;
		} else if (delta == 0) {
			double x = -b / (2 * a);
			result = "Nghiệm kép: x = " + x;
		} else {
			result = "Phương trình vô nghiệm.";
		}

		request.setAttribute("result", result);
		request.getRequestDispatcher("result.jsp").forward(request, response);
	}
}