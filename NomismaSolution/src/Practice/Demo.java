package Practice;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Demo {
	public static void main(String args[])
	{
	//System.setProperty("webdriver.firefox.marionette", "F:\\Automation\\Setups\\geckodriver-v0.16.0-win64.zip\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("http://sandbox.nomismasolution.co.uk:8080/ssoui/Signin.aspx?token=6c1bab4c-a5d8-4b3d-b315-c16314766142");
	driver.manage().window().maximize();
	driver.findElement(By.id("ctl00_cPH_login")).sendKeys("admin");
	driver.findElement(By.id("ctl00_cPH_pass")).sendKeys("admin1");
	driver.findElement(By.id("ctl00_cPH_btnLogin")).click();
	System.out.println("Log out success");
	
	//driver.findElement(By.id("ctl00_cPHFilter_txtAgentName")).sendKeys("Nomisma");
	//driver.findElement(By.id("ctl00_cPHFilter_btnSearch")).click();
	//driver.findElement(By.xpath("//tbody//td[contains(text(),'Nomisma')]/../td[5]/a")).click();
	
	/*	{
	 String admin= driver.getWindowHandle();
	 
     System.out.println(admin);

     // Click on the Button "New Message Window"

     driver.findElement(By.xpath("//tbody//td[contains(text(),'Nomisma')]")).click();
    
     //driver.findElement(By.name("New Message Window")).click();

     // Store and Print the name of all the windows open	              

     Set<String> handles = driver.getWindowHandles();

     System.out.println(handles);

     // Pass a window handle to the other window

     for (String Agents : driver.getWindowHandles()) {

     	System.out.println(Agents);

     	driver.switchTo().window(Agents);

     }*/
     
   // Businesses
    /* driver.findElement(By.xpath("//span[contains(text(),'Businesses')]")).click();
     driver.findElement(By.id("ctl00_cPHFilter_txtSearchCompany")).sendKeys("Agent company check");
     driver.findElement(By.id("ctl00_cPHFilter_btnSearch")).click();
     driver.findElement(By.xpath("//tbody//td[contains(text(), 'Agent Company Check')]")).click(); */
     
    // SA
   //  driver.findElement(By.xpath("//span[contains(text(), 'Self Assessments')]")).click();
     //driver.findElement(By.xpath("//a[contains(text(), 'Dashboard')]")).click();
       
	//Roles
    driver.findElement(By.xpath("//span[contains(text(),'Roles')]")).click();	
    driver.findElement(By.id("ctl00_cpHeaderRight_btnAddShowRole")).click();
	driver.findElement(By.id("ctl00_cpHFooter_btnCancel")).click();	
	
	driver.findElement(By.xpath("//span[contains(text(),'VAT Config')]")).click();
	//Add Flat Rate
	driver.findElement(By.xpath("//a[contains(text(),'Flat Rate')]")).click();
	driver.findElement(By.id("ctl00_cpHeaderRight_btnVATType")).click();
	/*WebElement element=driver.findElement(By.id("ctl00_cPH_ddlVAT"));
	Select dropdown=new Select(element);
	dropdown.selectByVisibleText("Brand3");*/
	driver.findElement(By.id("ctl00_cPH_txtEffectiveDate")).sendKeys("01/02/2017");
	driver.findElement(By.id("ctl00_cPH_txtFlatRate")).sendKeys("30");
	driver.findElement(By.id("ctl00_cPH_btnSave")).click();

	//Add Flat Rate Type
	/*driver.findElement(By.xpath("//a[contains(text(),'Flat Rate Type')]")).click();
	driver.findElement(By.id("ctl00_cpHeaderRight_btnVATType")).click();
	driver.findElement(By.id("ctl00_cPH_txtVATName")).sendKeys("Test123");
	driver.findElement(By.id("ctl00_cPH_txtDescription")).sendKeys("Test flat rate");
	driver.findElement(By.id("ctl00_cPH_txtDefaultFlatRate")).sendKeys("15");
	driver.findElement(By.xpath("//tbody//td[contains(text(),'Test123')]/../td[4]/a")).click();
	driver.findElement(By.id("ctl00_cPH_txtDefaultFlatRate")).clear();
	driver.findElement(By.id("ctl00_cPH_txtDefaultFlatRate")).sendKeys("25");
	driver.findElement(By.id("ctl00_cPH_btnSave")).click();*/
	
	
	
	//driver.findElement(By.xpath("//div[@class='header_drop_down_text']")).click();
	//driver.findElement(By.xpath("//a[@id='ctl00_hrefLogout']")).click();
	//driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
	//driver.close();
}
	}
//}
