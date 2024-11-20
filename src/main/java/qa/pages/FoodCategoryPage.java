package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FoodCategoryPage {
	WebDriver driver;

	@FindBy(xpath = "//li[normalize-space()='Food']")
	private WebElement foodBtn;

	@FindBy(xpath = "//li[normalize-space()='Cuisines']")
	private WebElement cuisinesBtn;

	@FindBy(xpath = "//span[@class='reset']")
	private WebElement resetBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Mediterranean']")
	private WebElement Mediterranean;
	@FindBy(xpath = "//li[normalize-space()='Asian']")
	private WebElement AsianBtn;
	@FindBy(xpath = "//li[normalize-space()='Latin American']")
	private WebElement LatinAmericanBtn;
	@FindBy(xpath = "//li[normalize-space()='Middle Eastern']")
	private WebElement MiddleEasternBtn;
	@FindBy(xpath = "//li[normalize-space()='Comfort Food']")
	private WebElement ComfortFoodBtn;

	@FindBy(xpath = "//li[normalize-space()='Diet Food']")
	private WebElement DietFoodBtn;
	@FindBy(xpath = "//li[normalize-space()='Vegetarian']")
	private WebElement VegetarianBtn;
	@FindBy(xpath = "//li[normalize-space()='Vegan']")
	private WebElement VeganBtn;
	@FindBy(xpath = "//li[normalize-space()='Gluten-Free']")
	private WebElement GlutenFreeBtn;
	@FindBy(xpath = "//li[normalize-space()='Keto']")
	private WebElement KetoBtn;
	@FindBy(xpath = "//li[normalize-space()='Paleo']")
	private WebElement PaleoBtn;

	@FindBy(xpath = "//li[normalize-space()='Cooking Methods']")
	private WebElement CookingMethodsBtn;
	@FindBy(xpath = "//li[normalize-space()='Grilled']")
	private WebElement GrilledBtn;
	@FindBy(xpath = "//li[normalize-space()='Baked']")
	private WebElement BakedBtn;
	@FindBy(xpath = "//li[normalize-space()='Stovetop']")
	private WebElement StovetopBtn;
	@FindBy(xpath = "//li[normalize-space()='Steamed']")
	private WebElement SteamedBtn;
	@FindBy(xpath = "//li[normalize-space()='Slow Cooker']")
	private WebElement SlowCookerBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Meals']")
	private WebElement MealsBtn;
	@FindBy(xpath = "//li[normalize-space()='Breakfast']")
	private WebElement BreakfastBtn;
	@FindBy(xpath = "//li[normalize-space()='Lunchtime']")
	private WebElement LunchtimeBtn;
	@FindBy(xpath = "//li[normalize-space()='Dinner']")
	private WebElement DinnerBtn;
	@FindBy(xpath = "//li[normalize-space()='Snacks']")
	private WebElement SnacksBtn;
	@FindBy(xpath = "//li[normalize-space()='Special Occasions']")
	private WebElement SpecialOccasionsBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Ingredient Focus']")
	private WebElement IngredientFocusBtn;
	@FindBy(xpath = "//li[normalize-space()='Seafood']")
	private WebElement SeafoodBtn;
	@FindBy(xpath = "//li[normalize-space()='Poultry']")
	private WebElement PoultryBtn;
	@FindBy(xpath = "//li[normalize-space()='Grains']")
	private WebElement GrainsBtn;
	@FindBy(xpath = "//li[normalize-space()='Fresh Produce']")
	private WebElement FreshProduceBtn;
	@FindBy(xpath = "//li[normalize-space()='Cheese']")
	private WebElement CheeseBtn;
	

	public FoodCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void CuisinesFoodCategory() throws InterruptedException {
		Thread.sleep(5000);
		foodBtn.click();
		Thread.sleep(2000);
		cuisinesBtn.click();
		Thread.sleep(2000);
		Mediterranean.click();
		Thread.sleep(2000);
		cuisinesBtn.click();
		Thread.sleep(2000);
		AsianBtn.click();
		Thread.sleep(2000);
		cuisinesBtn.click();
		Thread.sleep(2000);
		LatinAmericanBtn.click();
		Thread.sleep(2000);
		cuisinesBtn.click();
		Thread.sleep(2000);
		MiddleEasternBtn.click();
		Thread.sleep(2000);
		cuisinesBtn.click();
		Thread.sleep(2000);
		ComfortFoodBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}

	public void DietFoodFoodCategory() throws InterruptedException {
		foodBtn.click();
		Thread.sleep(2000);
		DietFoodBtn.click();
		Thread.sleep(2000);
		VegetarianBtn.click();
		Thread.sleep(2000);
		DietFoodBtn.click();
		Thread.sleep(2000);
		VeganBtn.click();
		Thread.sleep(2000);
		DietFoodBtn.click();
		Thread.sleep(2000);
		GlutenFreeBtn.click();
		Thread.sleep(2000);
		DietFoodBtn.click();
		Thread.sleep(2000);
		KetoBtn.click();
		Thread.sleep(2000);
		DietFoodBtn.click();
		Thread.sleep(2000);
		PaleoBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	
	public void CookingMethodsFoodCategory() throws InterruptedException {
		foodBtn.click();
		Thread.sleep(2000);
		CookingMethodsBtn.click();
		Thread.sleep(2000);
		GrilledBtn.click();
		Thread.sleep(2000);
		CookingMethodsBtn.click();
		Thread.sleep(2000);
		BakedBtn.click();
		Thread.sleep(2000);
		CookingMethodsBtn.click();
		Thread.sleep(2000);
		StovetopBtn.click();
		Thread.sleep(2000);
		CookingMethodsBtn.click();
		Thread.sleep(2000);
		SteamedBtn.click();
		Thread.sleep(2000);
		CookingMethodsBtn.click();
		Thread.sleep(2000);
		SlowCookerBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	
	public void MealsFoodCategory() throws InterruptedException {
		foodBtn.click();
		Thread.sleep(2000);
		MealsBtn.click();
		Thread.sleep(2000);
		BreakfastBtn.click();
		Thread.sleep(2000);
		MealsBtn.click();
		Thread.sleep(2000);
		LunchtimeBtn.click();
		Thread.sleep(2000);
		MealsBtn.click();
		Thread.sleep(2000);
		DinnerBtn.click();
		Thread.sleep(2000);
		MealsBtn.click();
		Thread.sleep(2000);
		SnacksBtn.click();
		Thread.sleep(2000);
		MealsBtn.click();
		Thread.sleep(2000);
		SpecialOccasionsBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(2000);
	}
	
	public void IngredientFocusFoodCategory() throws InterruptedException {
		foodBtn.click();
		Thread.sleep(2000);
		IngredientFocusBtn.click();
		Thread.sleep(2000);
		SeafoodBtn.click();
		Thread.sleep(2000);
		IngredientFocusBtn.click();
		Thread.sleep(2000);
		PoultryBtn.click();
		Thread.sleep(2000);
		IngredientFocusBtn.click();
		Thread.sleep(2000);
		GrainsBtn.click();
		Thread.sleep(2000);
		IngredientFocusBtn.click();
		Thread.sleep(2000);
		FreshProduceBtn.click();
		Thread.sleep(2000);
		IngredientFocusBtn.click();
		Thread.sleep(2000);
		CheeseBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}

}
