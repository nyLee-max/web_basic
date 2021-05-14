package web_basic.jsp_13.erp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/jsp_13/titleInsert")
public class InsertServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     private TitleService service;
 
    public InsertServlet() {
        service= new TitleService();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		
		int tNo = Integer.parseInt(request.getParameter("tno").trim());
		String tName = request.getParameter("tname").trim();
		
		Title title = new Title(tNo, tName);
		service.addTitle(title);
		
		response.sendRedirect("/web_basic/TitleServlet");
	}

}
