package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EntertainmentCategoryPage {
	WebDriver driver;
	
	@FindBy(xpath = "//li[normalize-space()='Entertainment']")
	private WebElement EntertainmentBtn;
	@FindBy(xpath = "//li[normalize-space()='Movies']")
	private WebElement MoviesBtn;
	@FindBy(xpath = "//li[normalize-space()='Action Movie']")
	private WebElement ActionMovieBtn;
	@FindBy(xpath = "//li[normalize-space()='Comedy Movie']")
	private WebElement ComedyMovieBtn;
	@FindBy(xpath = "//li[normalize-space()='Science Fiction Movie']")
	private WebElement ScienceFictionMovieBtn;
	@FindBy(xpath = "//li[normalize-space()='Fantasy Movie']")
	private WebElement FantasyMovieBtn;
	@FindBy(xpath = "//li[normalize-space()='Horror Movie']")
	private WebElement HorrorMovie;
	
	@FindBy(xpath = "//span[@class='reset']")
	private WebElement resetBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Television']")
	private WebElement TelevisionBtn;
	@FindBy(xpath = "//li[normalize-space()='Drama series']")
	private WebElement DramaseriesBtn;
	@FindBy(xpath = "//li[normalize-space()='Comedy series']")
	private WebElement ComedyseriesBtn;
	@FindBy(xpath = "//li[normalize-space()='Animated series']")
	private WebElement AnimatedseriesBtn;
	@FindBy(xpath = "//li[normalize-space()='Reality shows']")
	private WebElement RealityshowsBtn;
	@FindBy(xpath = "//li[normalize-space()='Documentaries']")
	private WebElement DocumentariesBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Music']")
	private WebElement MusicBtn;
	@FindBy(xpath = "//li[normalize-space()='Pop Music']")
	private WebElement PopMusicBtn;
	@FindBy(xpath = "//li[normalize-space()='Rock Music']")
	private WebElement RockMusicBtn;
	@FindBy(xpath = "//li[normalize-space()='Hip-hop Music']")
	private WebElement HiphopMusicBtn;
	@FindBy(xpath = "//li[normalize-space()='Jazz Music']")
	private WebElement JazzMusicBtn;
	@FindBy(xpath = "//li[normalize-space()='Country Music']")
	private WebElement CountryMusicBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Gaming']")
	private WebElement GamingBtn;
	@FindBy(xpath = "//li[normalize-space()='Action Games']")
	private WebElement ActionGamesBtn;
	@FindBy(xpath = "//li[normalize-space()='Adventure Games']")
	private WebElement AdventureGameBtn;
	@FindBy(xpath = "//li[normalize-space()='Role-playing games (RPGs)']")
	private WebElement RoleplayinggamesBtn;
	@FindBy(xpath = "//li[normalize-space()='Simulation Games']")
	private WebElement SimulationGamesBtn;
	@FindBy(xpath = "//li[normalize-space()='Strategy Games']")
	private WebElement StrategyGamesBtn;

	
	public EntertainmentCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	
	public void MoviesCategory() throws InterruptedException {
		EntertainmentBtn.click();
		Thread.sleep(2000);
		MoviesBtn.click();
		Thread.sleep(2000);
		ActionMovieBtn.click();
		Thread.sleep(2000);
		MoviesBtn.click();
		Thread.sleep(2000);
		ComedyMovieBtn.click();
		Thread.sleep(2000);
		MoviesBtn.click();
		Thread.sleep(2000);
		ScienceFictionMovieBtn.click();
		Thread.sleep(2000);
		MoviesBtn.click();
		Thread.sleep(2000);
		FantasyMovieBtn.click();
		Thread.sleep(2000);
		MoviesBtn.click();
		Thread.sleep(2000);
		HorrorMovie.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void TelevisionCategory() throws InterruptedException {
		EntertainmentBtn.click();
		Thread.sleep(2000);
		TelevisionBtn.click();
		Thread.sleep(2000);
		DramaseriesBtn.click();
		Thread.sleep(2000);
		TelevisionBtn.click();
		Thread.sleep(2000);
		ComedyseriesBtn.click();
		Thread.sleep(2000);
		TelevisionBtn.click();
		Thread.sleep(2000);
		AnimatedseriesBtn.click();
		Thread.sleep(2000);
		TelevisionBtn.click();
		Thread.sleep(2000);
		RealityshowsBtn.click();
		Thread.sleep(2000);
		TelevisionBtn.click();
		Thread.sleep(2000);
		DocumentariesBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void MusicCategory() throws InterruptedException {
		EntertainmentBtn.click();
		Thread.sleep(2000);
		MusicBtn.click();
		Thread.sleep(2000);
		PopMusicBtn.click();
		Thread.sleep(2000);
		MusicBtn.click();
		Thread.sleep(2000);
		RockMusicBtn.click();
		Thread.sleep(2000);
		MusicBtn.click();
		Thread.sleep(2000);
		HiphopMusicBtn.click();
		Thread.sleep(2000);
		MusicBtn.click();
		Thread.sleep(2000);
		JazzMusicBtn.click();
		Thread.sleep(2000);
		MusicBtn.click();
		Thread.sleep(2000);
		CountryMusicBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void GamingCategory() throws InterruptedException {
		EntertainmentBtn.click();
		Thread.sleep(2000);
		GamingBtn.click();
		Thread.sleep(2000);
		ActionGamesBtn.click();
		Thread.sleep(2000);
		GamingBtn.click();
		Thread.sleep(2000);
		AdventureGameBtn.click();
		Thread.sleep(2000);
		GamingBtn.click();
		Thread.sleep(2000);
		RoleplayinggamesBtn.click();
		Thread.sleep(2000);
		GamingBtn.click();
		Thread.sleep(2000);
		SimulationGamesBtn.click();
		Thread.sleep(2000);		
		GamingBtn.click();
		Thread.sleep(2000);
		StrategyGamesBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(2000);
	}

}
