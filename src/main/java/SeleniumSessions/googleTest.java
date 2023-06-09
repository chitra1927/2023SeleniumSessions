package SeleniumSessions;

public class googleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtil bu = new BrowserUtil();
		bu.initDriver("chrome");
		bu.lauchUrl("https://google.com");
		bu.getPageTitle();
		String actlTitle = bu.getPageTitle();
		System.out.println("page title :" +actlTitle);
		Verify.equalValues(actlTitle,"Google");
		
		String actlurl = bu.getPageUrl();
		System.out.println("page url:" +actlurl);

		Verify.containValues(actlurl,"google");
		bu.quitBrowser();

	}

}
