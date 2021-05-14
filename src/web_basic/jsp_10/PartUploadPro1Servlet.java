package web_basic.jsp_10;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/jsp_10/partUploadPro1")
@MultipartConfig(fileSizeThreshold = 0, location = "D:/upload")
public class PartUploadPro1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PartUploadPro1Servlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset =utf-8");
		
		String writer = request.getParameter("writer");
		Part part = request.getPart("partFile1");
		
		PrintWriter out = response.getWriter();
		
		System.out.printf("writer= %s, part = %s%n", writer, part.getSubmittedFileName());
		String uploadFileName = part.getSubmittedFileName();
		part.write(uploadFileName);
		out.printf("작성자 : %s님이 %s 파일을 업로드 하였습니다.", writer, uploadFileName);

	}

}
