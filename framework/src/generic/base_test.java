package generic;

import javax.management.MXBean;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class base_test
{
	public static WebDriver driver;
	@BeforeMethod
	public void open_app()
	{
		System.setProperty(key, value);
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlywait(7,Timeunits.SECONDS);
		driver.get(url);
	}
	
	@AfterMethod
	public void close_app(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			Takescreen.shot(driver);
		}
		Thread.sleep(2000);
		driver.close();
	}
}
