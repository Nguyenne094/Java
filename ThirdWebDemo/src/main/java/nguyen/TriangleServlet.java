package nguyen;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/TriangleServlet")
public class TriangleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		double a = Double.parseDouble(request.getParameter("a"));
		double b = Double.parseDouble(request.getParameter("b"));
		double c = Double.parseDouble(request.getParameter("c"));

		String result;
		String gifUrl;

		// Kiểm tra có phải tam giác không
		if (a + b > c && a + c > b && b + c > a) {
			// Phân loại tam giác
			if (a == b && b == c) {
				result = "Tam giác đều.";
				gifUrl = "https://media.giphy.com/media/1rNW1iG5cyP68/giphy.gif"; // Đều
			} else if (a == b || a == c || b == c) {
				result = "Tam giác cân.";
				gifUrl = "https://media.giphy.com/media/xT5LMn9cb7zBPRfL7W/giphy.gif"; // Cân
			} else if (isRightTriangle(a, b, c)) {
				result = "Tam giác vuông.";
				gifUrl = "https://media.giphy.com/media/l3q2K5jinAlChoCLS/giphy.gif"; // Vuông
			} else {
				result = "Tam giác thường.";
				gifUrl = "https://media.giphy.com/media/3oz8xEewW0e6kYVVXi/giphy.gif"; // Thường
			}
		} else {
			result = "Không phải tam giác.";
			gifUrl = "https://media.giphy.com/media/3o6ZsY8VSP9B5u2GZO/giphy.gif"; // Không phải tam giác
		}

		request.setAttribute("result", result);
		request.setAttribute("gifUrl", gifUrl);
		request.getRequestDispatcher("triangleResult.jsp").forward(request, response);
	}

	private boolean isRightTriangle(double a, double b, double c) {
		a = Math.pow(a, 2);
		b = Math.pow(b, 2);
		c = Math.pow(c, 2);
		return (Math.abs(a + b - c) < 1e-6 ||
		        Math.abs(a + c - b) < 1e-6 ||
		        Math.abs(b + c - a) < 1e-6);
	}
}
