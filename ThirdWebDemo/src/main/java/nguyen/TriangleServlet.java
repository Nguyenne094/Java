package nguyen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Bai2
 */
@WebServlet("/TriangleServlet")
public class TriangleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		double c = Double.parseDouble(request.getParameter("c"));

		String result;

		if (a + b > c && a + c > b && b + c > a) {
			result = "Đây là một tam giác.";
		} else {
			result = "Không phải là tam giác.";
		}

		request.setAttribute("result", result);
		request.getRequestDispatcher("triangleResult.jsp").forward(request, response);
	}
}
