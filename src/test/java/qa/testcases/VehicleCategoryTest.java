package qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.VehicleCategoryPage;

public class VehicleCategoryTest extends Base{
	VehicleCategoryPage vehicleCategoryPage;

	public VehicleCategoryTest() {
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
	public void MotorcyclesCategoryTest() throws InterruptedException {
		vehicleCategoryPage = new VehicleCategoryPage(driver);
		vehicleCategoryPage.MotorcyclesCategory();
	}
	@Test(priority = 2)
	public void TrucksCategoryTest() throws InterruptedException {
		vehicleCategoryPage = new VehicleCategoryPage(driver);
		vehicleCategoryPage.TrucksCategory();
	}
	@Test(priority = 3)
	public void BicyclesCategoryTest() throws InterruptedException {
		vehicleCategoryPage = new VehicleCategoryPage(driver);
		vehicleCategoryPage.BicyclesCategory();
	}
	@Test(priority = 4)
	public void PublicTransportationCategoryTest() throws InterruptedException {
		vehicleCategoryPage = new VehicleCategoryPage(driver);
		vehicleCategoryPage.PublicTransportationCategory();
	}
}
