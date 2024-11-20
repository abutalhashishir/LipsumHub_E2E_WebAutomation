package qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.SportsCategoryPage;

public class SportsCategoryTest extends Base{
	SportsCategoryPage sportsCategoryPage;

	public SportsCategoryTest() {
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
	public void TeamSportsCategoryTest() throws InterruptedException {
		sportsCategoryPage = new SportsCategoryPage(driver);
		sportsCategoryPage.TeamSportsCategory();
	}
	@Test(priority = 2)
	public void IndividualSportsCategoryTest() throws InterruptedException {
		sportsCategoryPage = new SportsCategoryPage(driver);
		sportsCategoryPage.IndividualSportsCategory();
	}
	@Test(priority = 3)
	public void CombatSportsCategoryTest() throws InterruptedException {
		sportsCategoryPage = new SportsCategoryPage(driver);
		sportsCategoryPage.CombatSportsCategory();
	}
	@Test(priority = 4)
	public void ExtremeSportsCategoryTest() throws InterruptedException {
		sportsCategoryPage = new SportsCategoryPage(driver);
		sportsCategoryPage.ExtremeSportsCategory();
	}

}
