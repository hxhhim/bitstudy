package sec01.ex01;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class InputServlet
 */
@WebServlet("/input")
public class InputServlet extends HttpServlet {
	

	
	public void init() throws ServletException {
		System.out.println("init 메서드 호출");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String user_id = request.getParameter("user_id");
		String user_pw = request.getParameter("user_pw");
		System.out.println("아이디: "+ user_id);
		System.out.println("비밀번호: "+user_pw);
		String[] subject = request.getParameterValues("subject");
		//하나의 name으로 여러값을 전송하는 경우 getParameterValue()를 이용해 배열 형태로 반환됩니다.
		for(String str:subject) {
			System.out.println("선택한 과목: "+str);
		}
	}
	public void destroy() {
		

	}
}
