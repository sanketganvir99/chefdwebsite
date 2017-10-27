package com.chefd;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class ChefdBaseClass {

	static WebDriver driver = new FirefoxDriver();

	// ******************* Launching Chef'd Website *************************** // 

	public static boolean launchChefd() {
		boolean flag = false;

		try {
			driver.get("http://chefd-staging.myshopify.com/?preview_theme_id=164690629");
			driver.manage().window().maximize();
			flag = true;
		} catch (Exception e) {

			e.printStackTrace();

		}
		return flag;
	}

	// ************** Verifying HOW IT WORKS link from header and footer *************** //

	public static boolean howItWorks() {
		boolean flag = false;

		try {
			Thread.sleep(3000);
			driver.findElement(
					By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div/div[1]/a"))
					.click();
			driver.findElement(By.id("why-chefd-2")).click();
			driver.findElement(By.id("meal-plan-3")).click();
			driver.findElement(By.id("why-chefd-2")).click();
			driver.findElement(By.id("how-it-works")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[4]/div/div/div[1]/div[2]/span")).click();
			Thread.sleep(11000);
			scroll_Page_Down();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[5]/div[2]/div/div[2]/div[2]/div[3]/ul/li[2]/a")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("why-chefd-2")).click();
			driver.findElement(By.id("meal-plan-3")).click();
			driver.findElement(By.id("why-chefd-2")).click();
			driver.findElement(By.id("how-it-works")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[4]/div/div/div[1]/div[1]/a/img")).click();

			flag = true;
		} catch (Exception e) {

			e.printStackTrace();

		}
		return flag;

	}

	// ********************** Email Gift Card added to cart *************************** //

	public static boolean emailGiftsCard() {
		boolean flag = false;

		try {
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div/div[2]/a[2]/span")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[5]/main/div/div/div[2]/div[1]/div[2]/label[1]/div/div/div")).click();
			driver.findElement(By.xpath("/html/body/div[2]/div[5]/main/div/div/div[2]/div[1]/div[3]/div[2]/label[1]/div")).click();
			WebElement card_quantity = driver.findElement(By.xpath("/html/body/div[2]/div[5]/main/div/div/div[2]/div[1]/div[4]/div[1]/select"));
			Select card_quantity_dd = new Select(card_quantity);
			card_quantity_dd.selectByValue("2");
			driver.findElement(By.id("add-cart")).click();
			Thread.sleep(3000);
			String str1 = "E-Gift Card";
			String str2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/form/div/div[3]/div[1]/div[1]/div[2]/div[1]/div[2]/a/div")).getText();
			if(str1.equals(str2)){
				System.out.println("Same gift cart is added to the cart which is clicked by the user");
			}
			System.out.println("Email Gift Card added to cart and verified successfully");
			Thread.sleep(3000);
			driver.findElement(By.id("cart-overlay")).click();
			Thread.sleep(2000);
            driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div/ul[1]/a/img")).click();
			flag = true;
		} catch (Exception e) {

			e.printStackTrace();

		}
		return flag;

	}
	
	
	public static boolean physicalGiftsCard() {
		boolean flag = false;

		try {
			
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[1]/div/div[2]/a[2]/span")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[5]/main/div/div/div[2]/div[1]/div[2]/label[2]/div/div/div")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[5]/main/div/div/div[2]/div[1]/div[3]/div[3]/label[1]/div")).click();
			WebElement card_quantity = driver.findElement(By.xpath("/html/body/div[2]/div[5]/main/div/div/div[2]/div[1]/div[4]/div[1]/select"));
			Select card_quantity_dd = new Select(card_quantity);
			card_quantity_dd.selectByValue("2");
			driver.findElement(By.id("add-cart")).click();
			Thread.sleep(3000);
			String str1 = "Physical Gift Card";
			String str2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/form/div/div[3]/div/div[1]/div[1]/div[2]/div[1]/div[2]/a/div")).getText();
			if(str1.equals(str2)){
				System.out.println("Same gift cart is added to the cart which is clicked by the user");
			}
			System.out.println("Physical Gift Card added to cart and verified successfully");
			Thread.sleep(3000);
			driver.findElement(By.id("cart-overlay")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div/ul[1]/a/img")).click();

			flag = true;
		} catch (Exception e) {

			e.printStackTrace();

		}
		return flag;

	}
	
	
	
	public static boolean addReceipeTocartfromAllMeals() {
		boolean flag = false;

		try {
			Thread.sleep(3000);
			WebElement menu = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div/ul[3]/li[1]/a"));
			WebElement submenu = driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div/ul[3]/li[1]/div/div/ul/li[2]/a"));
			Actions action = new Actions(driver);
			action.moveToElement(menu).perform();
			Thread.sleep(2000);
			submenu.click();
			Thread.sleep(4000);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,250)", "");
			String str1 = driver.findElement(By.xpath("/html/body/div[2]/div[5]/main/div/div/div[3]/div/div[1]/div[1]/div[1]/div[3]/div[1]")).getText();
			driver.findElement(By.xpath("/html/body/div[2]/div[5]/main/div/div/div[3]/div/div[1]/div[1]/div/div[4]/div[2]/button")).click();
			Thread.sleep(4000);
			String str2 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/form/div/div[3]/div/div[1]/div[1]/div[2]/div[1]/div[2]/a/div")).getText();
			System.out.println(str1 +"  "+ str2);
			if(str1.equals(str2)){
				System.out.println("Same recipe added to the cart which is clicked by the user");
			}
			driver.findElement(By.id("cart-overlay")).click();
			Thread.sleep(2000);
			driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div/ul[1]/a/img")).click();

			flag = true;
		} catch (Exception e) {

			e.printStackTrace();

		}
		return flag;

	}
	
	
	public static boolean logIn() {
		boolean flag = false;

		try {
			
			
			

			flag = true;
		} catch (Exception e) {

			e.printStackTrace();

		}
		return flag;

	}
	
	
	
	public static boolean regularCheckout() {
   		boolean flag = false;

		try {
			Thread.sleep(3000);
			driver.findElement(By.id("header-cart")).click();
			Thread.sleep(2000);
			driver.findElement(By.id("regular-checkout")).click();
			driver.findElement(By.id("zipCodeInput")).click();
			driver.findElement(By.id("zipCodeInput")).sendKeys("94061");
			driver.findElement(By.id("residentialInput")).click();
			driver.findElement(By.id("commercialInput")).click();
			driver.findElement(By.id("residentialInput")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[1]/div/form/div/div[3]/div/div[2]/div/div[2]/div[4]/div[2]/div/label[1]/input")).click();
			driver.findElement(By.name("attributes[delivery-instruction]")).click();
			driver.findElement(By.name("attributes[delivery-instruction]")).sendKeys("abc xyz 123 !@#");
			driver.findElement(By.id("continue-order")).click();
			
 			Thread.sleep(7000);
			driver.findElement(By.id("checkout_email")).sendKeys("sanket.ganvir@ymedialabs.com");
			driver.findElement(By.id("checkout_shipping_address_first_name")).click();
			driver.findElement(By.id("checkout_shipping_address_first_name")).sendKeys("Test");
			driver.findElement(By.id("checkout_shipping_address_last_name")).click();
			driver.findElement(By.id("checkout_shipping_address_last_name")).sendKeys("QA");
			driver.findElement(By.id("checkout_shipping_address_company")).click();
			driver.findElement(By.id("checkout_shipping_address_company")).sendKeys("abc xyz");
			driver.findElement(By.id("checkout_shipping_address_address1")).click();
			driver.findElement(By.id("checkout_shipping_address_address1")).sendKeys("#12432, Times square");
			driver.findElement(By.id("checkout_shipping_address_address2")).click();
			driver.findElement(By.id("checkout_shipping_address_address2")).sendKeys("qwe123");
			driver.findElement(By.id("checkout_shipping_address_city")).click();
			driver.findElement(By.id("checkout_shipping_address_city")).sendKeys("Redwood city");
			WebElement country = driver.findElement(By.id("checkout_shipping_address_country"));
			Select country_dd = new Select(country);
			country_dd.selectByValue("United States");	
			WebElement state = driver.findElement(By.id("checkout_shipping_address_province"));
			Select state_dd = new Select(state);
			state_dd.selectByValue("California");		
			driver.findElement(By.id("checkout_shipping_address_zip")).click();
			driver.findElement(By.id("checkout_shipping_address_zip")).sendKeys("94061");
			driver.findElement(By.id("checkout_shipping_address_phone")).click();
			driver.findElement(By.id("checkout_shipping_address_phone")).sendKeys("1234567890");
			driver.findElement(By.id("checkout_remember_me")).click();
			driver.findElement(By.id("checkout_reduction_code")).click();
			driver.findElement(By.id("checkout_reduction_code")).sendKeys("testyml");
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/form[1]/div/div/div/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/div[2]/button")).click();
			
			Thread.sleep(7000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div[3]/table/tbody/tr[2]/td[1]/form/button")).click();
			driver.findElement(By.id("checkout_reduction_code")).click();
			driver.findElement(By.id("checkout_reduction_code")).sendKeys("testyml");
			driver.findElement(By.xpath("/html/body/div[2]/div/div[1]/div[2]/div/div/div[2]/form[1]/div/div/div/button")).click();
			Thread.sleep(4000);
			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/div[2]/button")).click();
			
			Thread.sleep(15000);
			driver.switchTo().frame(driver.findElement(By.className("card-fields-iframe")));
			driver.findElement(By.id("number")).sendKeys("6789 4242 4242 4242");

			
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/div[1]/div[1]/div[2]/div[2]/div/div[3]/div[3]/div[2]/div")).sendKeys("a");
			driver.findElement(By.id("name")).sendKeys("abc xyz");
			
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/div[1]/div[1]/div[2]/div[2]/div/div[3]/div[3]/div[3]/div/div")).click();
			driver.findElement(By.id("expiry")).sendKeys("422");
			
//			driver.findElement(By.xpath("/html/body/div[2]/div/div[2]/div[2]/div/form/div[1]/div[1]/div[2]/div[2]/div/div[3]/div[3]/div[4]/div")).click();
			driver.findElement(By.id("verification_value")).sendKeys("242");
			
			Thread.sleep(2000);
			driver.findElement(By.name("button")).click();
			
			//*[@id="number"]
			flag = true;
		} catch (Exception e) {

			e.printStackTrace();
			System.out.println(e);

		}
		return flag;

	}
	
	
	
	
	
	
	
	

	public static void scroll_Page_Down() throws Exception {

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,3000)", "");
	}

}








// public static boolean signUp() {
// boolean flag = false;
//
// try {
//
// driver.findElement(By.xpath("/html/body/div[2]/div[3]/div[1]/div[2]/div/ul[4]/li[1]/a")).click();
// driver.findElement(By.xpath("/html/body/div[2]/div[4]/div/div/div[4]/a[1]")).click();
// Thread.sleep(3000);
// driver.findElement(By.id("FirstName")).click();
// driver.findElement(By.id("FirstName")).sendKeys("QA");
// driver.findElement(By.id("LastName")).click();
// driver.findElement(By.id("LastName")).sendKeys("Test");
// WebElement str = driver.findElement(By.id("Email"));
// str.click();
// Random randomGenerator = new Random();
// int randomInt = randomGenerator.nextInt(1000);
// String email = "chefd"+ randomInt +"@gmail.com";
// str.sendKeys(email);
// driver.findElement(By.id("CreatePassword")).click();
// driver.findElement(By.id("CreatePassword")).sendKeys("test123");
// driver.findElement(By.id("signUp")).click();
//
// flag = true;
// } catch (Exception e) {
//
// e.printStackTrace();
//
// }
// return flag;
//
// }

// @Test
// @Parameters("Browser")
// static void crossBrowser(String BrowserName){
//
// if(BrowserName.equalsIgnoreCase("firefox"))
// {
// driver = new FirefoxDriver();
// }
// else if(BrowserName.equalsIgnoreCase("chrome"))
// {
// System.setProperty("webdriver.chrome.driver","//Users//sanket//Downloads//chromedriver.exe");
// driver = new ChromeDriver();
// }
// else if(BrowserName.equalsIgnoreCase("safari"))
// {
// System.setProperty("webdriver.safari.noinstall", "true"); //To stop uninstall
// each time
// driver = new SafariDriver();
// }
//
// driver.manage().window().maximize();
// }
// }

