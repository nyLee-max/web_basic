package web_basic.chap04;

import java.io.IOException;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/chap04/RegisterServlet3")
public class RegisterServlet3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest request, HttpServletResponse response) throws IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		String id = request.getParameter("id");
		String pw1 = request.getParameter("pw1");
		String file = request.getParameter("file");
		String select = request.getParameter("select");
		String intro = request.getParameter("intro");
		
		PrintWriter out = response.getWriter();
		
		out.printf("아이디%s<br> 비밀번호%s<br>", id, pw1);
		
		if(file == null) {
			out.println("선택한 파일이 없음");
		}else {
			out.printf("파일%s<br>", file);
		}
		String t = null;
		if (select.equals("archi")) {
			t = "건축공학과";
		}
		if (select.equals("mechanic")) {
			t="기계공학과";
		}
		if (select.equals("indust")) {
			t="산업공학과";
		}
		if (select.equals("elec")) {
			t="전기전자공학과";
		}
		if (select.equals("computer")) {
			t = "컴퓨터 공학과";
		}
		if (select.equals("chemical")) {
			t = "화학 공학과";
		}
		if (select.equals("history")){
			t = "사학과";
		}
		if (select.equals("lang")) {
			t = "어문학부";
		}
		if (select.equals("philo")) {
			t = "철학과";
		}
		
		out.printf("학과%s<br>",t);
		
		out.printf("메모%s<br>", intro);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

}
