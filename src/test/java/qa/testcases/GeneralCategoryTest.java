package qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.GeneralCategoryPage;

public class GeneralCategoryTest  extends Base{
	GeneralCategoryPage generalCategoryPage;

	public GeneralCategoryTest() {
		super();
	}

	public WebDriver driver;

	@BeforeClass
	public void setup() throws InterruptedException {
		driver = initializeBrowserAndOpenApplicationURL(prop.getProperty("browserName"));
	}

	@AfterClass
	public void tearDown() {
		driver.quit();
	}
	@Test(priority = 1)
	public void ParagraphCategoryTest() throws InterruptedException {
		generalCategoryPage = new GeneralCategoryPage(driver);
		generalCategoryPage.ParagraphCategory(dataProp.getProperty("textSize"));
	}
	@Test(priority = 2)
	public void WordCategoryTest() throws InterruptedException {
		generalCategoryPage = new GeneralCategoryPage(driver);
		generalCategoryPage.WordCategory(dataProp.getProperty("textSize2"));
	}
	@Test(priority = 3)
	public void ListCategoryTest() throws InterruptedException {
		generalCategoryPage = new GeneralCategoryPage(driver);
		generalCategoryPage.ListCategory(dataProp.getProperty("textSize3"));
	}
	
	
}
