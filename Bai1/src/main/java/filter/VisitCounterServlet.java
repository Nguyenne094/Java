package filter;

import java.io.IOException;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;


@WebServlet("/home")
public class VisitCounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public VisitCounterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        ServletContext context = getServletContext();
        Integer visitCount = (Integer) context.getAttribute("visitCount");
        if (visitCount == null) {
            visitCount = 0;
        }

        context.setAttribute("visitCount", visitCount);

        RequestDispatcher rd = req.getRequestDispatcher("/index.jsp");
        rd.forward(req, resp);
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
