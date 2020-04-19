package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

  public LoginPage(WebDriver driver) {
    PageFactory.initElements(driver, this);

  }

  @FindBy(how = How.NAME, using = "UserName")
  public WebElement txtUserName;

  @FindBy(how = How.NAME, using = "Password")
  public WebElement txtPassWord;

  @FindBy(how = How.NAME, using = "Login")
  public WebElement btnlogin;



  public void login(String userName, String password) {
    txtUserName.sendKeys(userName);
    txtPassWord.sendKeys(password);
  }

  public void ClickLogin() {
    btnlogin.submit();
  }
}

