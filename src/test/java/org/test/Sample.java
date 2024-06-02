package org.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Sample  {
	private WebDriver driver;
    private SamplePOM loginPage;
    private SamplePOM homePage;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
        driver.get("https://twitter.com/?lang=en");
        driver.manage().window().maximize();
        loginPage = new SamplePOM(driver);
        homePage = new SamplePOM(driver);
    }

    @Test
    public void loginTest() throws InterruptedException {
        loginPage.clickSignIn();
        Thread.sleep(5000);
        loginPage.enterUsername("@shankar_i96");
        Thread.sleep(5000);
        loginPage.enterPassword("Hd7080w71");
    }

    @Test(priority = 3,invocationCount = 5)
     public void  Test2() {
     System.out.println("Test2");

}

     @Test(priority = 1,invocationCount = 2)
     public void  Test3()  {
     System.out.println("Test3");

}
     @Test(priority = 2,invocationCount = 6)
     public void  Test4()  {
     System.out.println("Test4");

}
     @Test(priority = 4,invocationCount = 3)
     public void  Test5() {
     System.out.println("Test5");

}

    

    @AfterClass
    public void PostAndLogout() throws InterruptedException {
         Thread.sleep(5000);
         homePage.addPost("Hello Ra");
         Thread.sleep(5000);
         homePage.goToProfile();
         Thread.sleep(8000);
         homePage.logout();	
    }
	
	
}
	
//	public WebDriver w;
//	
//
//    @BeforeClass
//	    public void Login() {

//		 w = new ChromeDriver();
//		 w.get("https://twitter.com/?lang=en");
//		 w.manage().window().maximize();    
//	    }
//	    @Test
//	    public void  Test1() throws InterruptedException{
//		    
////		       WebElement signin = w.findElement(By.xpath("//span[contains(text(),'Sign in')]"));
////		       signin.click();
//		    s.clickSignInButton();
//		       Thread.sleep(9000);
//		       WebElement username = w.findElement(By.xpath("//input[@autocomplete='username']"));
//		       username.sendKeys("@shankar_i96",Keys.ENTER);
//		       Thread.sleep(9000);
//		       WebElement password = w.findElement(By.xpath("//input[@autocomplete='current-password']"));
//		       password.sendKeys("Hd7080w71",Keys.ENTER);
//		       
//		    }
//	    
////	    @Test(priority = 3,invocationCount = 5)
////	    public void  Test2() {
////	       System.out.println("Test2");
////	    
////	    }
////	    
////	    @Test(priority = 1,invocationCount = 2)
////	    public void  Test3()  {
////	       System.out.println("Test3");
////	    
////	    }
////	    @Test(priority = 2,invocationCount = 6)
////	    public void  Test4()  {
////	       System.out.println("Test4");
////	    
////	    }
////	    @Test(priority = 4,invocationCount = 3)
////	    public void  Test5() {
////	       System.out.println("Test5");
////	    
////	    }
////	    
//	    
//	    
//	    @AfterClass
//	    public void Logout() throws InterruptedException {
//	    	
//	    	Thread.sleep(8000);
//	    	WebElement addPost = w.findElement(By.xpath("//a[@aria-label='Post']"));
//		    addPost.click();
//		       
//		    WebElement typePost = w.findElement(By.xpath("//div[@aria-label='Post text']"));
//		    typePost.sendKeys("Hello Sivaram");
//		       
//		    WebElement submitPost = w.findElement(By.xpath("//div[@data-testid='tweetButton']"));
//		    submitPost.click();
//		    WebElement clkPro = w.findElement(By.xpath("//a[@aria-label='Profile']"));
//		    clkPro.click();
//		    Thread.sleep(5000);
//		    WebElement showPost = w.findElement(By.xpath("//span[text()='Hello Sivaram']"));
//		    String printPost = showPost.getText();
//			System.out.println(printPost);
//			
//	    	Thread.sleep(5000);
//	    	WebElement accMenu = w.findElement(By.xpath("//div[@aria-label='Account menu']"));
//	    	accMenu.click();
//	    	Thread.sleep(5000);
//	    	WebElement logOut = w.findElement(By.xpath("//a[@href='/logout']"));
//	    	logOut.click();
//	    	Thread.sleep(5000);
//	    	WebElement logoutenter = w.findElement(By.xpath("//div[@data-testid='confirmationSheetConfirm']"));
//	    	logoutenter.click();
//	    	  
//	   }
//
//}
