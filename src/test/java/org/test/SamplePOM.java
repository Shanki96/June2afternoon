package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SamplePOM {
private WebDriver w;

 
   private By signInButton = By.xpath("//a[@id='nav-link-accountList']')]");
   private By usernameInput = By.xpath("//input[@autocomplete='username']");
   private By passwordInput = By.xpath("//input[@autocomplete='current-password']");


    public SamplePOM(WebDriver driver) {
        this.w = driver;
    }


    public void clickSignIn() {
        w.findElement(signInButton).click();
    }

    public void enterUsername(String username) {
        WebElement usernameElement = w.findElement(usernameInput);
        usernameElement.sendKeys(username, Keys.ENTER);
    }

    public void enterPassword(String password) {
        WebElement passwordElement = w.findElement(passwordInput);
        passwordElement.sendKeys(password, Keys.ENTER);
    }

    private By addPostButton = By.xpath("//a[@aria-label='Post']");
    private By postTextInput = By.xpath("//div[@aria-label='Post text']");
    private By submitPostButton = By.xpath("//div[@data-testid='tweetButton']");
    private By profileButton = By.xpath("//a[@aria-label='Profile']");
    private By getPostText =By.xpath("//span[text()='Hello Ra']");
    private By accountMenuButton = By.xpath("//div[@aria-label='Account menu']");
    private By logoutButton = By.xpath("//a[@href='/logout']");
    private By confirmationButton = By.xpath("//div[@data-testid='confirmationSheetConfirm']");


    public void addPost(String postText) {
        w.findElement(addPostButton).click();
        WebElement postInputElement = w.findElement(postTextInput);
        postInputElement.sendKeys(postText);
        w.findElement(submitPostButton).click();
    }

    public void goToProfile() throws InterruptedException {
        w.findElement(profileButton).click();
        Thread.sleep(2000);
        
       w.findElement(getPostText);
       String text = getPostText.findElement(w).getText();
       System.out.println(text);
    }

    public void logout() throws InterruptedException {
    	
    
    	
    	Thread.sleep(5000);
        w.findElement(accountMenuButton).click();
        Thread.sleep(2000);
        w.findElement(logoutButton).click();
        Thread.sleep(2000);
        w.findElement(confirmationButton).click();
    }
}
  
