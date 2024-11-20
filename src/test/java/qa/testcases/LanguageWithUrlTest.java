package qa.testcases;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import qa.base.Base;
import qa.pages.LanguageWithUrlPage;

public class LanguageWithUrlTest extends Base {
	LanguageWithUrlPage languageWithUrlPage;

	public LanguageWithUrlTest() {
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
	public void FrançaisLang_Test() throws InterruptedException {
		languageWithUrlPage = new LanguageWithUrlPage(driver);
		languageWithUrlPage.clickFrançaisBtn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://fr.lipsumhub.com/", "The URL did not find to the expected version.");
		Thread.sleep(2000);
	}

	@Test(priority = 2)
	public void EspañolLang_Test() throws InterruptedException {
		languageWithUrlPage = new LanguageWithUrlPage(driver);
		languageWithUrlPage.clickEspañolBtn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://es.lipsumhub.com/", "The URL did not find to the expected version.");
		Thread.sleep(2000);
	}

	@Test(priority = 3)
	public void italianoLang_Test() throws InterruptedException {
		languageWithUrlPage = new LanguageWithUrlPage(driver);
		languageWithUrlPage.clickitalianoBtn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://it.lipsumhub.com/", "The URL did not find to the expected version.");
		Thread.sleep(2000);

	}

	@Test(priority = 4)
	public void kРусскийLang_Test() throws InterruptedException {
		languageWithUrlPage = new LanguageWithUrlPage(driver);
		languageWithUrlPage.clickРусскийBtn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://ru.lipsumhub.com/", "The URL did not find to the expected version.");
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void हिंदीLang_Test() throws InterruptedException {
		languageWithUrlPage = new LanguageWithUrlPage(driver);
		languageWithUrlPage.clickहिंदीBtn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://hi.lipsumhub.com/", "The URL did not find to the expected version.");
		Thread.sleep(2000);
	}

	@Test(priority = 6)
	public void IndonesiaLang_Test() throws InterruptedException {
		languageWithUrlPage = new LanguageWithUrlPage(driver);
		languageWithUrlPage.clickIndonesiaBtn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://id.lipsumhub.com/", "The URL did not find to the expected version.");
		Thread.sleep(2000);
	}

	@Test(priority = 7)
	public void jaLang_Test() throws InterruptedException {
		languageWithUrlPage = new LanguageWithUrlPage(driver);
		languageWithUrlPage.clickjaBtn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://ja.lipsumhub.com/","The URL did not find to the expected version.");
		Thread.sleep(2000);
	}
	@Test(priority = 8)
	public void FilipinoLang_Test() throws InterruptedException {
		languageWithUrlPage = new LanguageWithUrlPage(driver);
		languageWithUrlPage.clickFilipinoBtn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://ph.lipsumhub.com/","The URL did not find to the expected version.");
		Thread.sleep(2000);
	}
	@Test(priority = 9)
	public void 普通话Lang_Test() throws InterruptedException {
		languageWithUrlPage = new LanguageWithUrlPage(driver);
		languageWithUrlPage.click普通话Btn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://zh.lipsumhub.com/","The URL did not find to the expected version.");
		Thread.sleep(2000);
	}
	@Test(priority = 10)
	public void EnglishLang_Test() throws InterruptedException {
		languageWithUrlPage =new LanguageWithUrlPage(driver);
		languageWithUrlPage.clickEnglishBtn();
		String currentUrl = languageWithUrlPage.getCurrentUrl();
		Assert.assertEquals(currentUrl, "https://lipsumhub.com/", "The URL did not find to the expected version.");
		Thread.sleep(2000);
	}
}
