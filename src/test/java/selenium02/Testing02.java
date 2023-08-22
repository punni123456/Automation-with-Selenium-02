package selenium02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Testing02 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		//intitializing chrome driver
				WebDriverManager.chromedriver().setup();
				WebDriver driver =new ChromeDriver();
				
				driver.get("https://trytestingthis.netlify.app/");
				driver.manage().window().maximize();
				driver.navigate().refresh();
				
				//Task 1-->
				driver.findElement(By.id("fname")).sendKeys("Sadia");
				Thread.sleep(1000);
				driver.findElement(By.id("lname")).sendKeys("Mohiuddin");
				Thread.sleep(1000);
				
				//Task 2-->
				WebElement radiobutton = driver.findElement(By.id("female"));
				radiobutton.click();
				assert radiobutton.isSelected();
				System.out.println(radiobutton.isSelected());
				Thread.sleep(2000);
				
				//Task 3-->
				WebElement dropdown = driver.findElement(By.id("option"));
				Select dropdownset =new Select(dropdown);
				
				//dropdownset.selectByIndex(2);
				dropdownset.selectByValue("option 2");
				//dropdownset.selectByVisibleText("Option 2");
				Thread.sleep(2000);
				
				//Task 4-->
				WebElement checklist =driver.findElement(By.name("option3"));
				checklist.click();
				assert checklist.isSelected();
				System.out.println(checklist.isSelected());

	}

}
