package web_basic.jsp_10;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

@WebServlet("/jsp_10/fileUpload2")
public class fileUpload2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		doGet(request, response);
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset = utf-8");
		RequestDispatcher dispatcher = request.getRequestDispatcher("fileCheck.jsp");
		
		String uploadPath = request.getRealPath("/upload");
		DefaultFileRenamePolicy policy = new DefaultFileRenamePolicy();
		
		int size = 10 * 1024 * 1024; 
		String name = "";
		String subject = "";
		String fileName1 ="";
		String fileName2 = "";
		String origfileName1 = "";
		String origfileName2 = "";
		
		
		
		try {
			MultipartRequest multi = new MultipartRequest(request, uploadPath, size, "utf-8", policy);
			
			name = multi.getParameter("name");
		

			subject = multi.getParameter("subject");
			subject = request.getParameter("subject");
			Enumeration<?> files = multi.getFileNames();
			
			String file1 = (String)files.nextElement();
			System.out.println("file1 > " + file1);
			fileName1 = multi.getFilesystemName(file1);
			origfileName1 = multi.getOriginalFileName(file1);
			
			String file2 = (String)files.nextElement();
			System.out.println("file2 > " + file2);
			fileName2 = multi.getFilesystemName(file2);
			origfileName2 = multi.getOriginalFileName(file2);
			
			request.setAttribute("name", name);
			request.setAttribute("subject", subject);
			request.setAttribute("file1", file1);
			request.setAttribute("file2", file2);
			request.setAttribute("fileName1", fileName1);
			request.setAttribute("fileName2", fileName2);
			request.setAttribute("origfileName1", origfileName1);
			request.setAttribute("origfileName2", origfileName2);
			dispatcher.forward(request, response);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
















