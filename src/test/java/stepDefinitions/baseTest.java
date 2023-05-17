package stepDefinitions;


import org.apache.commons.lang3.RandomStringUtils;

import pageObjects.HomePagePF;
import pageObjects.linkedListPagePF;
import pageObjects.queuePagePF;
import pageObjects.registerPagePF;
import pageObjects.signInPagePF;
import pageObjects.stackPagePF;
import pageObjects.startPagePF;


public class baseTest {
	// Base class to maintain the page object classes
	//reusable methods that are applicable to all classes
	public HomePagePF hPage;
	public startPagePF sPage;
	public registerPagePF regPage;
	public signInPagePF signpage;
	public linkedListPagePF lListpage;
	public stackPagePF stackPage;
	public queuePagePF queuePage;
	
	
	
	public static String randomUtilUsername() {
		
		String userName = RandomStringUtils.randomAlphanumeric(5);
		String id="@ninja.com";
		String Userid=userName+id;
		System.out.println(Userid);
		return Userid;
	}
	
	
}

	




