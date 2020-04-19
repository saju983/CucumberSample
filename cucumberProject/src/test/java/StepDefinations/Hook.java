package StepDefinations;

import org.openqa.selenium.chrome.ChromeDriver;
import Base.BaseUti;
import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hook extends BaseUti {


  private BaseUti base;

  public Hook(BaseUti base) {
    this.base = base;
  }


  @Before

  public void intializeTest() {
    System.out.println("OPENING BROWSER CHROME");
    System.setProperty("webdriver.chrome.driver", "E:\\eclipse\\workspace\\chromedriver.exe");
    base.Driver = new ChromeDriver();

  }

  @After

  public void tearDownTest() {
    System.out.println("CLOSING BROWSER");
    // base.Driver.close();
  }

}
