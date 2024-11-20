package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class NatureCategoryPage {
	WebDriver driver;

	@FindBy(xpath = "//li[normalize-space()='Nature']")
	private WebElement NatureBtn;
	@FindBy(xpath = "//li[normalize-space()='Ecosystems']")
	private WebElement EcosystemsBtn;
	@FindBy(xpath = "//li[contains(text(),'Terrestrial Ecosystems (Forests, Grasslands, Deser')]")
	private WebElement TerrestrialEcosystemsBtn;
	@FindBy(xpath = "//li[normalize-space()='Aquatic Ecosystems (Freshwater, Marine, Wetlands)']")
	private WebElement AquaticEcosystemsBtn;
	
	@FindBy(xpath = "//span[@class='reset']")
	private WebElement resetBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Flora and Fauna']")
	private WebElement FloraandFaunaBtn;
	@FindBy(xpath = "//li[normalize-space()='Plants (Trees, Flowers, Mosses)']")
	private WebElement TreesFlowersMossesBtn;
	@FindBy(xpath = "//li[normalize-space()='Animals (Mammals, Birds, Reptiles, Insects)']")
	private WebElement MammalsBirdsReptilesInsectBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Landscapes']")
	private WebElement LandscapesBtn;
	@FindBy(xpath = "//li[normalize-space()='Mountains and Plateaus']")
	private WebElement MountainsandPlateausBtn;
	@FindBy(xpath = "//li[normalize-space()='Valleys and Canyons']")
	private WebElement ValleysandCanyonsBtn;
	@FindBy(xpath = "//li[normalize-space()='Coastal and Oceanic Landscapes']")
	private WebElement CoastalandOceanicLandscapesBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Biodiversity']")
	private WebElement BiodiversityBtn;
	@FindBy(xpath = "//li[normalize-space()='Species Diversity']")
	private WebElement SpeciesDiversityBtn;
	@FindBy(xpath = "//li[normalize-space()='Genetic Diversity']")
	private WebElement GeneticDiversityBtn;
	@FindBy(xpath = "//li[normalize-space()='Ecosystem Diversity']")
	private WebElement EcosystemDiversityBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Natural Wonders']")
	private WebElement aturalWondersBtn;
	@FindBy(xpath = "//li[normalize-space()='Waterfalls']")
	private WebElement WaterfallsBtn;
	@FindBy(xpath = "//li[normalize-space()='Caves and Caverns']")
	private WebElement CavesandCavernsBtn;
	@FindBy(xpath = "//li[normalize-space()='Geological Formations']")
	private WebElement GeologicalFormationsBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Wildlife Photography']")
	private WebElement WildlifePhotographyBtn;
	@FindBy(xpath = "//li[normalize-space()='Birds Photography']")
	private WebElement BirdsPhotographyBtn;
	@FindBy(xpath = "//li[normalize-space()='Macro Photography (Insects, Plants)']")
	private WebElement MacroPhotographyBtn;
	@FindBy(xpath = "//li[normalize-space()='Wildlife Action Photography']")
	private WebElement WildlifeActionPhotographyBtn;
	
	public NatureCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void EcosystemsCategory() throws InterruptedException {
		NatureBtn.click();
		Thread.sleep(2000);
		EcosystemsBtn.click();
		Thread.sleep(2000);
		TerrestrialEcosystemsBtn.click();
		Thread.sleep(2000);
		EcosystemsBtn.click();
		Thread.sleep(2000);
		AquaticEcosystemsBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void FloraandFaunaCategory() throws InterruptedException {
		NatureBtn.click();
		Thread.sleep(2000);
		FloraandFaunaBtn.click();
		Thread.sleep(2000);
		TreesFlowersMossesBtn.click();
		Thread.sleep(2000);
		FloraandFaunaBtn.click();
		Thread.sleep(2000);
		MammalsBirdsReptilesInsectBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void LandscapesCategory() throws InterruptedException {
		NatureBtn.click();
		Thread.sleep(2000);
		LandscapesBtn.click();
		Thread.sleep(20000);
		MountainsandPlateausBtn.click();
		Thread.sleep(2000);
		LandscapesBtn.click();
		Thread.sleep(2000);
		ValleysandCanyonsBtn.click();
		Thread.sleep(2000);
		LandscapesBtn.click();
		Thread.sleep(2000);
		CoastalandOceanicLandscapesBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void BiodiversityCategory() throws InterruptedException {
		NatureBtn.click();
		Thread.sleep(2000);
		BiodiversityBtn.click();
		Thread.sleep(2000);
		SpeciesDiversityBtn.click();
		Thread.sleep(2000);
		BiodiversityBtn.click();
		Thread.sleep(2000);
		GeneticDiversityBtn.click();
		Thread.sleep(2000);
		BiodiversityBtn.click();
		Thread.sleep(2000);
		EcosystemDiversityBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void NaturalWondersCategory() throws InterruptedException {
		NatureBtn.click();
		Thread.sleep(2000);
		aturalWondersBtn.click();
		Thread.sleep(2000);
		WaterfallsBtn.click();
		Thread.sleep(2000);
		aturalWondersBtn.click();
		Thread.sleep(2000);
		CavesandCavernsBtn.click();
		Thread.sleep(2000);
		aturalWondersBtn.click();
		Thread.sleep(2000);
		GeologicalFormationsBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void WildlifePhotographyCategory() throws InterruptedException {
		NatureBtn.click();
		Thread.sleep(2000);
		WildlifePhotographyBtn.click();
		Thread.sleep(2000);
		BirdsPhotographyBtn.click();
		Thread.sleep(2000);
		WildlifePhotographyBtn.click();
		Thread.sleep(2000);
		MacroPhotographyBtn.click();
		Thread.sleep(2000);
		WildlifePhotographyBtn.click();
		Thread.sleep(2000);
		WildlifeActionPhotographyBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}

}
