package SeleniumSessions;

public class customXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    //XPATH : xpath is the address of the element in the html dom.
	
	//2 types of x path :
		
	//1.absolute xpath :absolute address of the element in the html dom.
		
	//	/html/body/div[2]/div/div/div/div[2]/div/form/div[1]/input
		
    //2.relative/custom x path :
		
	//it contains xpath functions , xpath axes , xpath properties.
		
	// double // : direct + indirect child elements.
		
	//single / : direct child elements.
		
		
    //htmltag[@attr="value"]
	
    // //input[@id='input-email']
		
	// //img[@title='naveenopencart']
		
		
	//htmltag[@attr="value" and @attr="value"]
		
	// //input[@type='text' and @name='firstname']	
		
		
	
    //*****text() - label,link,span,header ****
		
	//htmltag[text()='value']
		
	//a[text()='Login']
		
	//h1[text() = 'Register Account']
		
	////label[text() = 'First Name']
		
		
		
	//*****contains() with attributes.*****
		
	//htmltag[contains(@attr,'value')]
		
    //input[contains(@placeholder, 'E-Mail')]	
	
	//a[contains(@href, 'account/login') ]
		
	
	//htmltag[contains(@attr,'value') and contains(@attr,'value')]
		
	//input[contains(@placeholder, 'E-Mail') and  contains(@name, 'email')]
		
	//**** one contain and one no contain****
		
	//input[contains(@placeholder, 'E-Mail') and  @name='email']
		
	//input[@name='email' and contains(@placeholder, 'E-Mail') ]
		
		
		
	//*****contains with text()*******
	
	//htmltag[contains(text(),'value']
			
	//a[contains(text(),'Delivery')]
		
	//p[contains(text(),'By creating an account')]
		
	//div[contains(text(),' No match for E-Mail Address and/or Password.')]
		
		
		
		
	//*****contains with text and contains with attribute******
		
	//htmltag[contains((text(),'value') and contains(@attr,'val')]
		
	//a[contains(text(),'Terms') and contains(@href,informaation)]
		
		
	//****contains with text() and no contains with attribute.
	
	//htmltag[contins(text(),'value') and @attr = 'val']
	
	
	//a[contains(text(),'payments') and @class= 'list-group-item']
		
		
	//****start with() ******
	
	//htmltag[starts-with(@attr,'val')
	
	//input[starts-with(@placeholder,'E-Mail')]	
		
    //endswith () in xpath - no not present it is deprecated .
		
	//index() 
		
	//collect all the elements together and give indexing.
		
	//   (//input[@class='form-control'])[1]
	
	//position()
		
	//   (//input[@class='form-control'])[position()=6]
	
	//last()
	
	//  (//input[@class='form-control'])[last()]

	//	(//input[@class='form-control'])[last()-5]	- first element
	
	//  (//input[@class='form-control'])[last()-1]  - second last element.
	
	// (//input[@class='form-control'])[last()-(last()-1)]
		
	//	((//div[@class='navFooterLinkCol navAccessibility'])[last()]//a)[last()]
	
	//	(//table[@class='navFooterMoreOnAmazon']//td//a)[last()]
		
		
	}

}
