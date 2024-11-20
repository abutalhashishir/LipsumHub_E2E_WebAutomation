package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TechnologyCategoryPage {
	
	WebDriver driver;
	
	@FindBy(xpath = "//li[normalize-space()='Technology']")
	private WebElement TechnologyBtn;
	@FindBy(xpath = "//li[normalize-space()='Hardware']")
	private WebElement HardwareBtn;
	@FindBy(xpath = "//li[normalize-space()='Computers']")
	private WebElement ComputersBtn;
	@FindBy(xpath = "//li[normalize-space()='Smartphones']")
	private WebElement SmartphonesBtn;
	@FindBy(xpath = "//li[normalize-space()='Tablets']")
	private WebElement TabletsBtn;
	@FindBy(xpath = "//li[normalize-space()='Wearable Devices']")
	private WebElement WearableDevicesBtn;
	
	@FindBy(xpath = "//span[@class='reset']")
	private WebElement resetBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Software']")
	private WebElement SoftwareBtn;
	@FindBy(xpath = "//li[normalize-space()='Operating Systems']")
	private WebElement OperatingSystemsBtn;
	@FindBy(xpath = "//li[contains(text(),'Applications (Productivity, Entertainment, Utility')]")
	private WebElement ProductivityEntertainmentUtilityBtn;
	@FindBy(xpath = "//li[normalize-space()='Antivirus and Security Software']")
	private WebElement AntivirusandSecuritySoftwareBtn;
	@FindBy(xpath = "//li[normalize-space()='Development Tools']")
	private WebElement DevelopmentToolsBtn;

	@FindBy(xpath = "//li[normalize-space()='Internet and Networking']")
	private WebElement InternetandNetworkingBtn;
	@FindBy(xpath = "//li[normalize-space()='Networking Protocols']")
	private WebElement NetworkingProtocolsBtn;
	@FindBy(xpath = "//li[normalize-space()='Wireless Technologies']")
	private WebElement WirelessTechnologiesBtn;
	@FindBy(xpath = "//li[normalize-space()='Cybersecurity']")
	private WebElement CybersecurityBtn;
	@FindBy(xpath = "//li[normalize-space()='Cloud Computing']")
	private WebElement CloudComputingBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Emerging Technologies']")
	private WebElement EmergingTechnologiesBtn;
	@FindBy(xpath = "//li[normalize-space()='Artificial Intelligence (AI)']")
	private WebElement ArtificialIntelligenceBtn;
	@FindBy(xpath = "//li[normalize-space()='Internet of Things (IoT)']")
	private WebElement InternetofThingsBtn;
	@FindBy(xpath = "//li[normalize-space()='Augmented Reality (AR) and Virtual Reality (VR)']")
	private WebElement AugmentedRealityandVirtualRealityBtn;
	@FindBy(xpath = "//li[normalize-space()='Blockchain']")
	private WebElement BlockchainBtn;
	
	
	public TechnologyCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void HardwareCategory() throws InterruptedException {
		TechnologyBtn.click();
		Thread.sleep(2000);
		HardwareBtn.click();
		Thread.sleep(2000);
		ComputersBtn.click();
		Thread.sleep(2000);
		HardwareBtn.click();
		Thread.sleep(2000);
		SmartphonesBtn.click();
		Thread.sleep(2000);
		HardwareBtn.click();
		Thread.sleep(2000);
		TabletsBtn.click();
		Thread.sleep(2000);
		HardwareBtn.click();
		Thread.sleep(2000);
		WearableDevicesBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void SoftwareCategory() throws InterruptedException {
		TechnologyBtn.click();
		Thread.sleep(2000);
		SoftwareBtn.click();
		Thread.sleep(2000);
		OperatingSystemsBtn.click();
		Thread.sleep(2000);
		SoftwareBtn.click();
		Thread.sleep(2000);
		ProductivityEntertainmentUtilityBtn.click();
		Thread.sleep(2000);
		SoftwareBtn.click();
		Thread.sleep(2000);
		AntivirusandSecuritySoftwareBtn.click();
		Thread.sleep(2000);
		SoftwareBtn.click();
		Thread.sleep(2000);
		DevelopmentToolsBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void InternetandNetworkingCategory() throws InterruptedException {
		TechnologyBtn.click();
		Thread.sleep(2000);
		InternetandNetworkingBtn.click();
		Thread.sleep(2000);
		NetworkingProtocolsBtn.click();
		Thread.sleep(2000);
		InternetandNetworkingBtn.click();
		Thread.sleep(2000);
		WirelessTechnologiesBtn.click();
		Thread.sleep(2000);
		InternetandNetworkingBtn.click();
		Thread.sleep(2000);
		CybersecurityBtn.click();
		Thread.sleep(2000);
		InternetandNetworkingBtn.click();
		Thread.sleep(2000);
		CloudComputingBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void EmergingTechnologiesCategory() throws InterruptedException {
		TechnologyBtn.click();
		Thread.sleep(2000);
		EmergingTechnologiesBtn.click();
		Thread.sleep(2000);
		ArtificialIntelligenceBtn.click();
		Thread.sleep(2000);
		EmergingTechnologiesBtn.click();
		Thread.sleep(2000);
		InternetofThingsBtn.click();
		Thread.sleep(2000);
		EmergingTechnologiesBtn.click();
		Thread.sleep(2000);
		AugmentedRealityandVirtualRealityBtn.click();
		Thread.sleep(2000);
		EmergingTechnologiesBtn.click();
		Thread.sleep(2000);
		BlockchainBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}

}
