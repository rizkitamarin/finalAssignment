package com.browserstack.run_first_test;



import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidElement;



public class SauceLabDemoMenu extends BrowserStackTestNGTest {
	
		@Test
        public void endToEnd() throws Exception {
    	      
	      AndroidElement userName = (AndroidElement) new WebDriverWait(driver, 30).until(
	             ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-Username")));
	         userName.sendKeys("standard_user");
	      
	      AndroidElement passWord = (AndroidElement) new WebDriverWait(driver, 30).until(
    	          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-Password")));
    	     passWord.sendKeys("secret_sauce");
    	      
    	  AndroidElement loginBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
    	          ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-LOGIN\"]/android.widget.TextView")));
    	      loginBtn.click();
    	  System.out.println("login passed");   
    

    // checkout
  	      
		  AndroidElement ATCBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
		          ExpectedConditions.elementToBeClickable(MobileBy.xpath("(//android.view.ViewGroup[@content-desc=\"test-ADD TO CART\"])[1]/android.widget.TextView")));
		      ATCBtn.click();
	      AndroidElement goToCartBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
		          ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.view.ViewGroup[@content-desc=\"test-Cart\"]/android.view.ViewGroup/android.widget.ImageView")));
		      goToCartBtn.click();
	      AndroidElement checkOutBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
		          ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-CHECKOUT")));
		      checkOutBtn.click();    
		    
		  System.out.println("checkout passed");
    
       //payment
    	
    	AndroidElement fname = (AndroidElement) new WebDriverWait(driver, 30).until(
	            ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-First Name")));
	        fname.sendKeys("lala");
	      
	    AndroidElement lname = (AndroidElement) new WebDriverWait(driver, 30).until(
   	          	ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-Last Name")));
   	     	lname.sendKeys("lili");
   	     
	   	AndroidElement postCode = (AndroidElement) new WebDriverWait(driver, 30).until(
	   	        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-Zip/Postal Code")));
	   	    postCode.sendKeys("14045");
	   	    
	   	AndroidElement continueBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
		        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-CONTINUE")));
		    continueBtn.click();
		    
		    driver.findElement(MobileBy.AndroidUIAutomator(
		            "new UiScrollable(new UiSelector().scrollable(true))" +
		             ".scrollIntoView(new UiSelector().text(\"FINISH\"))"));
		    
	    AndroidElement finishBtn = (AndroidElement) new WebDriverWait(driver, 30).until(
		        ExpectedConditions.elementToBeClickable(MobileBy.AccessibilityId("test-FINISH")));
		    finishBtn.click(); 

		System.out.println("payment passed");  
		
  // ConfirmPayment
    	
    	AndroidElement completeText = (AndroidElement) new WebDriverWait(driver, 30).until(
		        ExpectedConditions.elementToBeClickable(MobileBy.xpath("//android.widget.ScrollView[@content-desc=\"test-CHECKOUT: COMPLETE!\"]/android.view.ViewGroup/android.widget.TextView[1]")));
		    String text = completeText.getAttribute("text"); 
		    System.out.println(text);
		    
	    System.out.println("checkout new item successfully");
    
        }
}