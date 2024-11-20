package qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.TechnologyCategoryPage;

public class TechnologyCategoryTest extends Base{
	
	TechnologyCategoryPage technologyCategoryPage;

	public TechnologyCategoryTest() {
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
	public void HardwareCategoryTest() throws InterruptedException {
		technologyCategoryPage = new TechnologyCategoryPage(driver);
		technologyCategoryPage.HardwareCategory();
	}
	@Test(priority = 2)
	public void SoftwareCategoryTest() throws InterruptedException {
		technologyCategoryPage = new TechnologyCategoryPage(driver);
		technologyCategoryPage.SoftwareCategory();
	}
	@Test(priority = 3)
	public void InternetandNetworkingCategoryTest() throws InterruptedException {
		technologyCategoryPage = new TechnologyCategoryPage(driver);
		technologyCategoryPage.InternetandNetworkingCategory();
	}
	@Test(priority = 4)
	public void EmergingTechnologiesCategoryTest() throws InterruptedException {
		technologyCategoryPage = new TechnologyCategoryPage(driver);
		technologyCategoryPage.EmergingTechnologiesCategory();
	}
	
}
