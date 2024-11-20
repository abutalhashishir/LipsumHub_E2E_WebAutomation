package qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.EntertainmentCategoryPage;

public class EntertainmentCategoryTest extends Base{
	EntertainmentCategoryPage entertainmentCategoryPage;

	public EntertainmentCategoryTest() {
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
	public void MoviesCategoryTest() throws InterruptedException {
		entertainmentCategoryPage = new EntertainmentCategoryPage(driver);
		entertainmentCategoryPage.MoviesCategory();
	}
	@Test(priority = 2)
	public void TelevisionCategoryTest() throws InterruptedException {
		entertainmentCategoryPage = new EntertainmentCategoryPage(driver);
		entertainmentCategoryPage.TelevisionCategory();
	}
	@Test(priority = 3)
	public void MusicCategoryTest() throws InterruptedException {
		entertainmentCategoryPage = new EntertainmentCategoryPage(driver);
		entertainmentCategoryPage.MusicCategory();
	}
	@Test(priority = 4)
	public void GamingCategoryTest() throws InterruptedException {
		entertainmentCategoryPage = new EntertainmentCategoryPage(driver);
		entertainmentCategoryPage.GamingCategory();
	}
}
