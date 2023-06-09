package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomCssSelector {
    
	static WebDriver driver;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		driver = new ChromeDriver();
		
		driver.get("https://app.hubspot.com/login/");
		
		
		
		
		//page : css + html
		
		
		//css - cypress, pw , wdio
		
		//id :
		//#id : #username
		//tag#id : input#username
		
		//class
		//.class : .login-email
		//tag.class : input.login-email
		
		
		//#id.class    :  #username.login-email
		//.class#id    :  .login-email#username
		//tag#id.class :  input#username.login-email
		//tag.class#id :  input.login-email#username
		
		//c1 c2 c3
		//.c1.c2.c3    :  .form-control.private-form__control.login-email
		
		//tag.c1.c2.c3  :  input.form-control.private-form__control.login-email
		
		//tag.c1.c2.c3#id  : input.form-control.private-form__control.login-email#username
		
		//tag#id.c1.c2.c3  : input#username.form-control.private-form__control.login-email
		
		
		//By.xpath("//input[@class='form-control private-form__control login-email']");;
		
		//By.cssSelector("input.form-control.private-form__control.login-email");
		
		//By.className("login-email");
	
		//By.className("form-control private-form__control login-email"); //not valid
		
		//By.xpath("//input[@class='form-control']");//not valid
		
		//other attributes
		
		//     tag[attr='value']
		
		//    input[id='username']
		
		//    //input[@id='username'] - xpath
		
		//    tag[attr='value'][attr='value']
		
		//     input[id='username'][type='email']
		
		//      input[id][type='email']
		
		//   //input[@id='username'][@type='email'] - xpath
		
		//   //input[@id][@type='email'] - xpath
		
		//   //a[@href]
		
		//   input[type='email']#username
		
		// text() in css is not applicable
		
		// contains in css :  *
		
		// tag[attr*='value']
		
		// button[id*=login]
		
		// button[id*=sso]
		
		//starts with in css : ^
		
		// tag[attr^='value']
		
		// button[id^='login']
		
		// endswith in css : $
		
		//  tag[attr$='value']
		
		//  button[id$='Btn']
		
		//parent to child :
		
		//parent tag child tag : direct + indirect childs
		
		//select#Form_getForm_Country option
		
		//form#hs-login div
		
		//parent tag to child tag : direct childs
		
		// form#hs-login >  div
		
		//child to parent : not posssible in css.
		
		//following-sibling  :
		
		//  label[for='Form_getForm_FullName'] + div         + for immedite sibing.
		
		//  select#Form_getForm_Country > option[value='Afghanistan'] ~ option
		
		//preceding-sibling  : not possible in css.
		
		//indexing in css :
		
		//   select#Form_getForm_Country option:first-child
		
		//   select#Form_getForm_Country option:last-child
		
		//   select#Form_getForm_Country option:nth-child(2)
		
		//   select#Form_getForm_Country option:nth-child(n)
		
		//   select#Form_getForm_Country option:nth-child(n+4)
		
		//   select#Form_getForm_Country option:nth-child(4n)
		
		//   select#Form_getForm_Country option:nth-child(3n-1)
		
		//   select#Form_getForm_Country option:nth-child(odd)
		
		//   select#Form_getForm_Country option:nth-child(even)
		
		//   //option[contains(text() , 'Afghanistan')]  - XPATH
		
		// //option[normalize-space()='Albania']
		
		
		
		
		//comma in css:
		
		
		List<WebElement> ele = driver.findElements(By.cssSelector("input#username,input#password,input#remember,Button#loginBtn"));
		
		if(ele.size()==4) {
			
			System.out.println("PASS");
		}
		else
		{
			System.out.println("Fail");
		}
		
		// not in css.
		
		//input.form-control.private-form__control:not(#username)
		
		//                       xpath           vs               css
		//1.syntax                 hard                             easy
		
		//2.text                   yes                              no
		
		//3.AND                    yes                              yes
		
		//4.OR                     yes                              yes
		
		//5.forward                yes                              yes
		
		//6.backward               yes                              yes
		
		//7.forwardsibling         yes                              yes
		
		//8.backwardsibling        yes                              no
		
		//9.index                  yes                              yes
		
		//10.captcha group         yes                              no
		
		//11.contains              yes                              yes
		
		//12.starts with           yes                              yes
		
		//13.ends with             no                               yes
		
		//14.normalize-space       yes                              no
		
		//15.first/last            yes                              yes
		
		//16.parent to child       yes                              yes
		
		//17.child to parent      yes                               no
		
		//18.webtable             easy                              limited
		
		//19.performance          good                              slightly better than xpath
		
		//20.
		
		
		
		
		
		
		
		

	}

}
