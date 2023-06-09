package SeleniumSessions;

public class WaitConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		//1.static wait : Thread.sleep(10000) - wait for 10 secs.
		
		//2.dynamic wait : total time out= 10 secs.
		//if element is found after 2 secs the remaining 8 secs i ignored/cancelled.
		//  2.a implicit wait :
		
		// 2.b explicit wait 
		       //   i.WebDriverWait:
		          
		       //   ii.fluent wait:
		//      c  	                    c                                   i
		// WebDriverWait() ---extends -- fluent wait------implement--------wait(i) _________ until()
		//+no public methods                 //until()
		//+inherit fluentwait class methods  //+other methods()
		

	}

}
