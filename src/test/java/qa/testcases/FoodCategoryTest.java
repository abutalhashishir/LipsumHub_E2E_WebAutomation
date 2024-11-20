package qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.FoodCategoryPage;

public class FoodCategoryTest extends Base{
	FoodCategoryPage foodCategoryPage;

	public FoodCategoryTest() {
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
	public void CuisinesFoodCategoryTest() throws InterruptedException {
		foodCategoryPage = new FoodCategoryPage(driver);
		foodCategoryPage.CuisinesFoodCategory();
	}
	@Test(priority = 2)
	public void DietFoodCategoryTest() throws InterruptedException {
		foodCategoryPage = new FoodCategoryPage(driver);
		foodCategoryPage.DietFoodFoodCategory();
	}
	@Test(priority = 3)
	public void CookingMethodsFoodCategoryTest() throws InterruptedException {
		foodCategoryPage = new FoodCategoryPage(driver);
		foodCategoryPage.CookingMethodsFoodCategory();
	}
	@Test(priority = 4)
	public void MealsFoodCategoryTest() throws InterruptedException {
		foodCategoryPage = new FoodCategoryPage(driver);
		foodCategoryPage.MealsFoodCategory();
	}
	@Test(priority = 5)
	public void IngredientFocusFoodCategoryTest() throws InterruptedException {
		foodCategoryPage = new FoodCategoryPage(driver);
		foodCategoryPage.IngredientFocusFoodCategory();
	}
}
