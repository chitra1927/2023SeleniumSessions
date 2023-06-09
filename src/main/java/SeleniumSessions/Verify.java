package SeleniumSessions;

public class Verify {
	
	public static boolean equalValues(String actualTitle, String expTitle)
	{
		if(actualTitle.equals(expTitle)) {
			
			System.out.println(actualTitle + "IS EQUALS TO" +expTitle);
			return true;
		}
		else
		{
			System.out.println(actualTitle + "IS NOT EQUALS TO" +expTitle);
			return false;
		}
	}
	
	public static boolean containValues(String actualurl, String expUrl)
	{
		if(actualurl.contains(expUrl)) {
			
			System.out.println(actualurl + "IS EQUALS TO" +expUrl);
			return true;
		}
		else {
			
			System.out.println(actualurl + "IS NOT EQUALS TO" +expUrl);
			return false;
			
		}
		
	}

}
