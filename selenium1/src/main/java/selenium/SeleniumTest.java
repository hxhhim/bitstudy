package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

	public static void main(String[] args) {
		SeleniumTest selTest = new SeleniumTest();
		selTest.crawl();
	}
	private WebDriver driver;
	
	public static final String WEB_DRIVER_ID = "webdriver.chrome.driver";
	public static final String WEB_DRIVER_PATH = "C:\\chromedriver\\chromedriver.exe";
	
	private String base_url;
	
	public SeleniumTest() {
		super();
		
		System.setProperty(WEB_DRIVER_ID, WEB_DRIVER_PATH);
		
		driver = new ChromeDriver();
		//플러스행사 페이지주소
		base_url = "http://cu.bgfretail.com/event/plus.do?category=event&depth2=1&sf=N";
		
		
	}
	
	public void crawl() {
		try {
			driver.get(base_url);
			
			String text = driver.getPageSource();
			
			System.out.println(driver.getPageSource());
		}catch (Exception e) {
			e.printStackTrace();
		}finally {
			driver.close();
		}
	}
}
