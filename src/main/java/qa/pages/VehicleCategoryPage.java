package qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleCategoryPage {
	
	WebDriver driver;

	@FindBy(xpath = "//li[normalize-space()='Vehicle']")
	private WebElement VehicleBtn;
	@FindBy(xpath = "//li[normalize-space()='Motorcycles']")
	private WebElement MotorcyclesBtn;
	@FindBy(xpath = "//li[normalize-space()='Sport Bikes']")
	private WebElement portBikesBtn;
	@FindBy(xpath = "//li[normalize-space()='Cruisers']")
	private WebElement CruisersBtn;
	@FindBy(xpath = "//li[normalize-space()='Touring Bikes']")
	private WebElement TouringBikesBtn;
	@FindBy(xpath = "//li[normalize-space()='Dirt Bikes']")
	private WebElement DirtBikesBtn;
	@FindBy(xpath = "//li[normalize-space()='Scooters']")
	private WebElement ScootersBtn;
	
	@FindBy(xpath = "//span[@class='reset']")
	private WebElement resetBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Trucks']")
	private WebElement TrucksBtn;
	@FindBy(xpath = "//li[normalize-space()='Pickup Trucks']")
	private WebElement PickupTrucksBtn;
	@FindBy(xpath = "//li[normalize-space()='Semi-trucks (Big Rigs)']")
	private WebElement SemitrucksBtn;
	@FindBy(xpath = "//li[normalize-space()='Delivery Trucks']")
	private WebElement DeliveryTrucksBtn;
	@FindBy(xpath = "//li[normalize-space()='Tow Trucks']")
	private WebElement TowTrucksBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Bicycles']")
	private WebElement BicyclesBtn;
	@FindBy(xpath = "//li[normalize-space()='Road Bikes']")
	private WebElement RoadBikesBtn;
	@FindBy(xpath = "//li[normalize-space()='Mountain Bikes']")
	private WebElement MountainBikesBtn;
	@FindBy(xpath = "//li[normalize-space()='Hybrid Bikes']")
	private WebElement HybridBikesBtn;
	@FindBy(xpath = "//li[normalize-space()='Electric Bikes']")
	private WebElement ElectricBikesBtn;
	
	@FindBy(xpath = "//li[normalize-space()='Public Transportation']")
	private WebElement PublicTransportationBtn;
	@FindBy(xpath = "//li[normalize-space()='Buses']")
	private WebElement BusesBtn;
	
	public VehicleCategoryPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	public void MotorcyclesCategory() throws InterruptedException {
		VehicleBtn.click();
		Thread.sleep(2000);
		MotorcyclesBtn.click();
		Thread.sleep(2000);
		portBikesBtn.click();
		Thread.sleep(2000);
		MotorcyclesBtn.click();
		Thread.sleep(2000);
		CruisersBtn.click();
		Thread.sleep(2000);
		MotorcyclesBtn.click();
		Thread.sleep(2000);
		TouringBikesBtn.click();
		Thread.sleep(2000);
		MotorcyclesBtn.click();
		Thread.sleep(2000);
		DirtBikesBtn.click();
		Thread.sleep(2000);
		MotorcyclesBtn.click();
		Thread.sleep(2000);
		ScootersBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void TrucksCategory() throws InterruptedException {
		VehicleBtn.click();
		Thread.sleep(2000);
		TrucksBtn.click();
		Thread.sleep(2000);
		PickupTrucksBtn.click();
		Thread.sleep(2000);
		TrucksBtn.click();
		Thread.sleep(2000);
		SemitrucksBtn.click();
		Thread.sleep(2000);
		TrucksBtn.click();
		Thread.sleep(2000);
		DeliveryTrucksBtn.click();
		Thread.sleep(2000);
		TrucksBtn.click();
		Thread.sleep(2000);
		TowTrucksBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
	public void BicyclesCategory() throws InterruptedException {
		VehicleBtn.click();
		Thread.sleep(2000);
		BicyclesBtn.click();
		Thread.sleep(2000);
		RoadBikesBtn.click();
		Thread.sleep(2000);
		BicyclesBtn.click();
		Thread.sleep(2000);
		MountainBikesBtn.click();
		Thread.sleep(2000);
		BicyclesBtn.click();
		Thread.sleep(2000);
		HybridBikesBtn.click();
		Thread.sleep(2000);
		BicyclesBtn.click();
		Thread.sleep(2000);
		ElectricBikesBtn.click();
		Thread.sleep(2000);
		resetBtn.click();		
	}
	public void PublicTransportationCategory() throws InterruptedException {
		VehicleBtn.click();
		Thread.sleep(2000);
		PublicTransportationBtn.click();
		Thread.sleep(2000);
		BusesBtn.click();
		Thread.sleep(2000);
		resetBtn.click();
		Thread.sleep(3000);
	}
}
