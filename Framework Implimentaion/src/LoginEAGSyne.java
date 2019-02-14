import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginEAGSyne {

	WebDriver driver;
	
	@FindBy(xpath="username")
	public WebElement userName;
	
	@FindBy(xpath="username")
	public WebElement password;
	
	@FindBy(xpath="username")
	public WebElement loginButton;
	
	public LoginEAGSyne(WebDriver driver) {
		this.driver = driver; 
		PageFactory.initElements(driver, this);
		}
	public void performLogin(String username,String password1) {
		userName.sendKeys(username);
		password.sendKeys(password1);
		loginButton.click();
		
	}
	
}
