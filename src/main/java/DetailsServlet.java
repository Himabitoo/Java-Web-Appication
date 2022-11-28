import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.DetailsDao;
import model.DetailsEntity;

@WebServlet("/DetailsServlet")
public class DetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public DetailsServlet() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext con = request.getServletContext();
		RequestDispatcher rd = con.getRequestDispatcher("/index.jsp");
		rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		
		DetailsDao dao = new DetailsDao();
		
		try {
			
			DetailsEntity de = dao.getDetailsData();
			
			if(de != null) {
				request.setAttribute("UEobj", de);
			}
			
			ServletContext con = request.getServletContext();
			RequestDispatcher rd = con.getRequestDispatcher("/ShowDetails.jsp");
			rd.forward(request, response);
			
		}
		catch(ArithmeticException e){
			System.out.print("存在しません。");
		}
		
		doGet(request, response);
	}

}
