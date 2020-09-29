package sec02.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/first/test")
public class TestServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		String context = request.getContextPath();//���ؽ�Ʈ �̸��� �����ɴϴ�.
		String url = request.getRequestURL().toString();//��ü URL�� �����ɴϴ�.
		String mapping = request.getServletPath();//���������� �̸��� �����ɴϴ�.
		String uri = request.getRequestURI();//URI�� �����ɴϴ�.
		out.println("<html>");
		out.println("<head>");
		out.println("<title>Test Servlet1</title>");
		out.println("</head>");
		out.println("<body bgcolor='green'>");
		out.println("<b>TestServlet1�Դϴ�.</b><br>");
		out.println("<b>���ؽ�Ʈ �̸�: "+context+"</b><br>");
		out.println("<b>��ü ��� : "+url +"</b><br>");
		out.println("<b>���� �̸� : "+mapping+"</b><br>");
		out.println("<b>URI : "+uri+"</b>");
		out.println("</body></html>");
		out.close();
	}

}