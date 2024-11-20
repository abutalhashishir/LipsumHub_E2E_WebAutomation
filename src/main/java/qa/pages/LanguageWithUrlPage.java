package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LanguageWithUrlPage {

    WebDriver driver;

    @FindBy(xpath = "//a[normalize-space()='Français']")
    private WebElement FrançaisBtn;
  
    @FindBy(xpath = "//a[normalize-space()='Español']")
    private WebElement EspañolBtn;
    
    @FindBy(xpath = "//a[normalize-space()='Italiano']")
    private WebElement italianoBtn;
    
    @FindBy(xpath = "//a[contains(text(),'Русский')]")
    private WebElement РусскийBtn;
    
    @FindBy(xpath = "//a[contains(text(),'हिंदी')]")
    private WebElement हिंदीBtn;
    
    @FindBy(xpath = "//a[normalize-space()='Indonesia']")
    private WebElement IndonesiaBtn;
    
    @FindBy(xpath = "//a[@href='https://ja.lipsumhub.com']")
    private WebElement jaBtn;
    
    @FindBy(xpath = "//a[normalize-space()='Filipino']")
    private WebElement FilipinoBtn;
    
    @FindBy(xpath = "//a[contains(text(),'中文（普通话）')]")
    private WebElement 普通话Btn;
    
    @FindBy(xpath = "//a[normalize-space()='English']")
    private WebElement EnglishBtn;

    public LanguageWithUrlPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void clickFrançaisBtn() throws InterruptedException {
        FrançaisBtn.click();
        Thread.sleep(2000);
    }

    public String getCurrentUrl() {
        return driver.getCurrentUrl();
    }
    public void clickEspañolBtn() throws InterruptedException {
    	EspañolBtn.click();
        Thread.sleep(2000);
    }
    public void clickitalianoBtn() throws InterruptedException {
    	italianoBtn.click();
    	Thread.sleep(2000);
    }
    public void clickРусскийBtn() throws InterruptedException {
    	РусскийBtn.click();
    	Thread.sleep(2000);
    }
    public void clickहिंदीBtn() throws InterruptedException {
    	हिंदीBtn.click();
    	Thread.sleep(2000);
    }
    public void clickIndonesiaBtn() throws InterruptedException {
    	IndonesiaBtn.click();
    	Thread.sleep(2000);
    }
    public void clickjaBtn() throws InterruptedException {
    	jaBtn.click();
    	Thread.sleep(2000);    
    }
    public void clickFilipinoBtn() throws InterruptedException {
    	FilipinoBtn.click();
    	Thread.sleep(2000);
    }
    public void click普通话Btn() throws InterruptedException {
    	普通话Btn.click();
    	Thread.sleep(2000);
    }
    public void clickEnglishBtn() throws InterruptedException {
		EnglishBtn.click();
		Thread.sleep(2000);
	}
    
}
