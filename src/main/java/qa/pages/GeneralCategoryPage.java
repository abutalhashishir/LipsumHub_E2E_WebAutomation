package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GeneralCategoryPage {
	WebDriver driver;
	
	@FindBy(xpath = "//input[@value='4']")
	private WebElement ClearText;
	
	@FindBy(xpath = "//input[@type='number']")
	private WebElement inputTextSize;
	
	@FindBy(xpath = "//li[normalize-space()='paragraph']")
	private WebElement paragraphBtn;
	
	@FindBy(xpath = "//button[@class='btn btn-info text-white']")
	private WebElement generateTextBtn;
	
	@FindBy(xpath = "//button[@type='button']")
	private WebElement HomeBtn;
	
	@FindBy(xpath = "//li[normalize-space()='word']")
	private WebElement wordBtn;
	
	@FindBy(xpath = "//li[normalize-space()='list']")
	private WebElement listBtn;

	public GeneralCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void ParagraphCategory(String textSizeText) throws InterruptedException {
		Thread.sleep(2000);
		ClearText.clear();
		Thread.sleep(2000);
		inputTextSize.sendKeys(textSizeText);
		Thread.sleep(2000);
		paragraphBtn.click();
		Thread.sleep(2000);
		generateTextBtn.click();
		Thread.sleep(3000);
	}
	
	public void WordCategory(String textSizeText) throws InterruptedException {
		HomeBtn.click();
		Thread.sleep(2000);
		ClearText.clear();
		Thread.sleep(2000);
		inputTextSize.sendKeys(textSizeText);
		Thread.sleep(2000);
		wordBtn.click();
		Thread.sleep(2000);
		generateTextBtn.click();
		Thread.sleep(3000);
	}
	public void ListCategory(String textSizeText) throws InterruptedException {
		HomeBtn.click();
		Thread.sleep(2000);
		ClearText.clear();
		Thread.sleep(2000);
		inputTextSize.sendKeys(textSizeText);
		Thread.sleep(2000);
		listBtn.click();
		Thread.sleep(2000);
		generateTextBtn.click();
		Thread.sleep(3000);
	}

}
