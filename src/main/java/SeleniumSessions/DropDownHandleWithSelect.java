package SeleniumSessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDownHandleWithSelect {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		WebElement day = driver.findElement(By.id("day"));
		WebElement month = driver.findElement(By.id("month"));
		WebElement year = driver.findElement(By.id("year"));
		
		JavaScriptUtil jsutil = new JavaScriptUtil(driver);
		jsutil.flash(day);
		jsutil.flash(month);
		jsutil.flash(year);

		
		System.out.println(getAllOptionsList(day));
		System.out.println(getAllOptionsList(month));
		System.out.println(getAllOptionsList(year));

		
		Select select1 = new Select(day);
//		System.out.println(select1.isMultiple());
		
//		Select select1 = new Select(day);
//		select1.selectByIndex(5);
//		select1.selectByVisibleText("20");
//		
//		Select select2 = new Select(month);
//		select2.selectByIndex(4);
//		select2.selectByVisibleText("Nov");
//		select2.selectByValue("7");
//		
//		Select select3 = new Select(year);
//		select3.selectByVisibleText("2005");
		
//		selectDropDownValueByText(day, "8");
//		selectDropDownValueByText(month, "Jun");
//		selectDropDownValueByText(year, "1995");
		

		//selectDropDownValueByIndex(month, 7);
		
		
	}
	
	
	public static void selectDropDownValueByText(WebElement element, String value){
		Select select = new Select(element);
		select.selectByVisibleText(value);		
	}
	
	public static void selectDropDownValueByIndex(WebElement element, int index){
		Select select = new Select(element);
		select.selectByIndex(index);		
	}
	
	public static ArrayList<String> getAllOptionsList(WebElement element){
		Select select = new Select(element);
		ArrayList<String> ar = new ArrayList<String>();
		
		List<WebElement> optionsList = select.getOptions();
		System.out.println("total options : " + optionsList.size());
		
		for(int i=0; i<optionsList.size(); i++){
			String optionVal = optionsList.get(i).getText();
			//System.out.println(optionVal);
			ar.add(optionVal);
		}
		return ar;
	}
	

}
