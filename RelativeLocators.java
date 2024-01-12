import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static  org.openqa.selenium.support.locators.RelativeLocator.*;
public class RelativeLocators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		WebElement nameEditBox=driver.findElement(By.cssSelector("[name='name']"));
		System.out.println(driver.findElement(with(By.tagName("label")).above(nameEditBox)).getText());
		
		WebElement dateofBirth=driver.findElement(By.cssSelector("[for='dateofBirth']"));
		driver.findElement(with(By.tagName("input")).below(dateofBirth)).click();
		
	   WebElement checkText=driver.findElement(By.cssSelector("label[for='exampleCheck1']"));
	    driver.findElement(with(By.tagName("input")).toLeftOf(checkText)).click();
	    
	    WebElement rdb=driver.findElement(By.id("inlineRadio1"));
	    		System.out.println(driver.findElement(with(By.tagName("label")).toRightOf(rdb)).getText());
		
		
		// TODO Auto-generated method stub

	}

}
