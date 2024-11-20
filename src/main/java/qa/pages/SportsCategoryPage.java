package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SportsCategoryPage {
	WebDriver driver;

	@FindBy(xpath = "//li[normalize-space()='Sports']")
	private WebElement SportsBtn;
	@FindBy(xpath = "//li[normalize-space()='Team Sports']")
	private WebElement TeamSportsBtn;
	@FindBy(xpath = "//li[normalize-space()='Soccer']")
	private WebElement SoccerBtn;
	@FindBy(xpath = "//li[normalize-space()='Basketball']")
	private WebElement BasketballBtn;
	@FindBy(xpath = "//li[normalize-space()='Football']")
	private WebElement FootballBtn;
	@FindBy(xpath = "//li[normalize-space()='Baseball']")
	private WebElement BaseballBtn;
	@FindBy(xpath = "//li[normalize-space()='Hockey']")
	private WebElement Hockey;
	@FindBy(xpath = "//li[normalize-space()='Rugby']")
	private WebElement RugbyBtn;
	@FindBy(xpath = "//li[normalize-space()='Volleyball']")
	private WebElement VolleyballBtn;
	
	@FindBy(xpath = "//span[@class='reset']")
	private WebElement resetBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Individual Sports']")
	private WebElement IndividualSportsBtn;
	@FindBy(xpath = "//li[normalize-space()='Tennis']")
	private WebElement TennisBtn;
	@FindBy(xpath = "//li[normalize-space()='Golf']")
	private WebElement GolfBtn;
	@FindBy(xpath = "//li[normalize-space()='Boxing']")
	private WebElement BoxingBtn;
	@FindBy(xpath = "//li[normalize-space()='Cycling']")
	private WebElement CyclingBtn;
	@FindBy(xpath = "//li[normalize-space()='Swimming']")
	private WebElement swimmingBtn;
	@FindBy(xpath = "//li[normalize-space()='Track and Field']")
	private WebElement TrackandFieldBtn;
	@FindBy(xpath = "//li[normalize-space()='Gymnastics']")
	private WebElement GymnasticsBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Combat Sports']")
	private WebElement CombatSportsBtn;
	@FindBy(xpath = "//li[normalize-space()='Mixed Martial Arts (MMA)']")
	private WebElement MixedMartialArtsBtn;
	@FindBy(xpath = "//li[normalize-space()='Judo']")
	private WebElement JudoBtn;
	@FindBy(xpath = "//li[normalize-space()='Karate']")
	private WebElement KarateBtn;
	@FindBy(xpath = "//li[normalize-space()='Taekwondo']")
	private WebElement taekwondoBtn;
	@FindBy(xpath = "//li[normalize-space()='Wrestling']")
	private WebElement WrestlingBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Extreme Sports']")
	private WebElement ExtremeSportsBtn;
	@FindBy(xpath = "//li[normalize-space()='Surfing']")
	private WebElement SurfingBtn;
	@FindBy(xpath = "//li[normalize-space()='Skateboarding']")
	private WebElement SkateboardingBtn;
	@FindBy(xpath = "//li[normalize-space()='Snowboarding']")
	private WebElement SnowboardingBtn;
	@FindBy(xpath = "//li[normalize-space()='Skydiving']")
	private WebElement SkydivingBtn;
	@FindBy(xpath = "//li[normalize-space()='Rock Climbing']")
	private WebElement RockClimbingBtn;
	@FindBy(xpath = "//li[normalize-space()='BMX']")
	private WebElement BMXBtn;
	
	
	
	public SportsCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void TeamSportsCategory() throws InterruptedException {
		SportsBtn.click();
		Thread.sleep(2000);
		TeamSportsBtn.click();
		Thread.sleep(2000);
		SoccerBtn.click();
		Thread.sleep(2000);
		TeamSportsBtn.click();
		Thread.sleep(2000);
		BasketballBtn.click();
		Thread.sleep(2000);
		TeamSportsBtn.click();
		Thread.sleep(2000);
		FootballBtn.click();
		Thread.sleep(2000);
		TeamSportsBtn.click();
		Thread.sleep(2000);
		BaseballBtn.click();
		Thread.sleep(2000);
		TeamSportsBtn.click();
		Thread.sleep(2000);
		Hockey.click();
		Thread.sleep(2000);
		TeamSportsBtn.click();
		Thread.sleep(2000);
		RugbyBtn.click();
		Thread.sleep(2000);
		TeamSportsBtn.click();
		Thread.sleep(2000);
		VolleyballBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void IndividualSportsCategory() throws InterruptedException {
		SportsBtn.click();
		Thread.sleep(2000);
		IndividualSportsBtn.click();
		Thread.sleep(2000);
		TennisBtn.click();
		Thread.sleep(2000);
		IndividualSportsBtn.click();
		Thread.sleep(2000);
		GolfBtn.click();
		Thread.sleep(2000);
		IndividualSportsBtn.click();
		Thread.sleep(2000);
		BoxingBtn.click();
		Thread.sleep(2000);
		IndividualSportsBtn.click();
		Thread.sleep(2000);
		CyclingBtn.click();
		Thread.sleep(2000);
		IndividualSportsBtn.click();
		Thread.sleep(2000);
		swimmingBtn.click();
		Thread.sleep(2000);
		IndividualSportsBtn.click();
		Thread.sleep(2000);
		TrackandFieldBtn.click();
		Thread.sleep(2000);
		IndividualSportsBtn.click();
		Thread.sleep(2000);
		GymnasticsBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void CombatSportsCategory() throws InterruptedException {
		SportsBtn.click();
		Thread.sleep(2000);
		CombatSportsBtn.click();
		Thread.sleep(2000);
		MixedMartialArtsBtn.click();
		Thread.sleep(2000);
		CombatSportsBtn.click();
		Thread.sleep(2000);
		JudoBtn.click();
		Thread.sleep(2000);
		CombatSportsBtn.click();
		Thread.sleep(2000);
		KarateBtn.click();
		Thread.sleep(2000);
		CombatSportsBtn.click();
		Thread.sleep(2000);
		taekwondoBtn.click();
		Thread.sleep(2000);
		CombatSportsBtn.click();
		Thread.sleep(2000);
		WrestlingBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void ExtremeSportsCategory() throws InterruptedException {
		SportsBtn.click();
		Thread.sleep(2000);
		ExtremeSportsBtn.click();
		Thread.sleep(2000);
		SurfingBtn.click();
		Thread.sleep(2000);;
		ExtremeSportsBtn.click();
		Thread.sleep(2000);
		SkateboardingBtn.click();
		Thread.sleep(2000);
		ExtremeSportsBtn.click();
		Thread.sleep(2000);
		SnowboardingBtn.click();
		Thread.sleep(2000);
		ExtremeSportsBtn.click();
		Thread.sleep(2000);
		SkydivingBtn.click();
		Thread.sleep(2000);
		ExtremeSportsBtn.click();
		Thread.sleep(2000);
		RockClimbingBtn.click();
		Thread.sleep(2000);
		ExtremeSportsBtn.click();
		Thread.sleep(2000);
		RockClimbingBtn.click();
		Thread.sleep(2000);
		ExtremeSportsBtn.click();
		Thread.sleep(2000);
		BMXBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}

}
