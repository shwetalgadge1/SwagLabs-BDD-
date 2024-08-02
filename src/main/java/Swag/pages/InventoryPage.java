package Swag.pages;



	import org.openqa.selenium.WebDriver;

	public class InventoryPage {
	    WebDriver driver;

	    public InventoryPage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public boolean isDisplayed() {
	        return driver.getCurrentUrl().contains("inventory.html");
	    }
	}



