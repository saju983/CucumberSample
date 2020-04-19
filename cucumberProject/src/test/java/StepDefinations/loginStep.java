package StepDefinations;


import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import Base.BaseUti;
import Pages.LoginPage;
import cucumber.api.DataTable;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import junit.framework.Assert;

public class loginStep extends BaseUti {

  private BaseUti base;


  public loginStep(BaseUti base) {
    this.base = base;
  }

  @Given("^I navigate to login page$")
  public void i_navigate_to_login_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("Hello");
    base.Driver.navigate().to("http://www.executeautomation.com/demosite/Login.html");
  }

  @And("^I enter the following details$")
  public void i_enter_the_following_details(DataTable table) throws Throwable {

    List<User> users = new ArrayList<>();
    users = table.asList(User.class);
    LoginPage page = new LoginPage(base.Driver);
    for (User user : users) {
      /*
       * // base.Driver.findElement(By.name("UserName")).click();
       * base.Driver.findElement(By.name("UserName")).sendKeys(user.username);
       * base.Driver.findElement(By.name("Password")).sendKeys(user.password);
       */
      page.login(user.username, user.password);
    }
  }


  @And("^I click login buton$")
  public void i_click_login_buton() throws Throwable {
    LoginPage page = new LoginPage(base.Driver);
    // Write code here that turns the phrase above into concrete actions
    // base.Driver.findElement(By.name("Login")).submit();
    page.ClickLogin();
  }

  @Then("^I should see userform page$")
  public void i_should_see_userform_page() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    System.out.println("inital page");
    Assert.assertEquals("its not displayed",
        base.Driver.findElement(By.name("Initial")).isDisplayed(), true);
  }

  @Then("I will click logout button$")
  public void I_will_click_logout_button() throws Throwable {
    // Write code here that turns the phrase above into concrete actions
    base.Driver.findElement(By.xpath("//*[contains(@href,'Login.html')]")).click();
  }


  public class User {

    public String username;
    public String password;

    public User(String userName, String passWord) {
      username = userName;
      password = passWord;
    }
  }

}
