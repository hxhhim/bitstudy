package sec03.ex01;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;

/**
 * Servlet Filter implementation class EncoderFilter
 */
@WebFilter("/*")
public class EncoderFilter implements Filter {

    ServletContext context;
    
	public void init(FilterConfig fConfig) throws ServletException {
		System.out.println("utf-8 인코딩............");
		context = fConfig.getServletContext();
	}
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("doFilter 호출");
		request.setCharacterEncoding("utf-8");	//한글인코딩설정작업
		String context = ((HttpServletRequest)request).getContextPath(); //웹애프리케이션의 컨텍스트 이름을 가져옵니다.
		String pathinfo = ((HttpServletRequest)request).getRequestURI();	//웹브라우저에서 요청한 요청 URI를 가져옵니다.
		String realPath = request.getRealPath(pathinfo); 	//요청 URI의 실제 경로를 가져옵니다.
		String mesg = "Context 정보: "+context+"\n URI 정보: "+pathinfo+"\n 물리적경로 : "+realPath;
		System.out.println(mesg);
		
		long begin = System.currentTimeMillis();
		chain.doFilter(request, response); //다음필터로 넘기는 작업을 수행
		long end = System.currentTimeMillis();
		System.out.println("작업시간: "+(end-begin)+"ms");
	}
	
	public EncoderFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		System.out.println("destroy 호출");
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	

	/**
	 * @see Filter#init(FilterConfig)
	 */
	

}
