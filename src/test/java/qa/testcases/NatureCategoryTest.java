package qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.NatureCategoryPage;

public class NatureCategoryTest extends Base{
	NatureCategoryPage natureCategoryPage;

	public NatureCategoryTest() {
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
	public void EcosystemsCategoryTest() throws InterruptedException {
		natureCategoryPage = new NatureCategoryPage(driver);
		natureCategoryPage.EcosystemsCategory();
	}
	@Test(priority = 2)
	public void FloraandFaunaCategoryTest() throws InterruptedException {
		natureCategoryPage = new NatureCategoryPage(driver);
		natureCategoryPage.FloraandFaunaCategory();
	}
	@Test(priority = 3)
	public void LandscapesCategoryTest() throws InterruptedException {
		natureCategoryPage = new NatureCategoryPage(driver);
		natureCategoryPage.LandscapesCategory();
	}
	@Test(priority = 4)
	public void BiodiversityCategoryTest() throws InterruptedException {
		natureCategoryPage = new NatureCategoryPage(driver);
		natureCategoryPage.BiodiversityCategory();
	}
	@Test(priority = 5)
	public void NaturalWondersCategoryTest() throws InterruptedException {
		natureCategoryPage = new NatureCategoryPage(driver);
		natureCategoryPage.NaturalWondersCategory();
	}
	@Test(priority = 6)
	public void WildlifePhotographyCategoryTest() throws InterruptedException {
		natureCategoryPage = new NatureCategoryPage(driver);
		natureCategoryPage.WildlifePhotographyCategory();
	}
}
