package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class CreateAccountPage {
    public static final Target USER_NAME = Target.the("").located(By.xpath("//input[@name='usernameRegisterPage']"));
    public static final Target EMAIL = Target.the("").located(By.xpath("//input[@name='emailRegisterPage']"));
    public static final Target PASSWORD = Target.the("").located(By.xpath("//input[@name='passwordRegisterPage']"));
    public static final Target PASSWORD_CONFIRM = Target.the("").located(By.xpath("//input[@name='confirm_passwordRegisterPage']"));


    public static final Target FIRST_NAME = Target.the("").located(By.xpath("//input[@name='first_nameRegisterPage']"));
    public static final Target LAST_NAME = Target.the("").located(By.xpath("//input[@name='last_nameRegisterPage']"));
    public static final Target PHONE_NUMBER = Target.the("").located(By.xpath("//input[@name='phone_numberRegisterPage']"));

    public static final Target COUNTRY = Target.the("").located(By.xpath("//select[@name='countryListboxRegisterPage']"));
    public static final Target CITY = Target.the("").located(By.xpath("//input[@name='cityRegisterPage']"));
    public static final Target ADDRESS = Target.the("").located(By.xpath("//input[@name='addressRegisterPage']"));
    public static final Target STATE = Target.the("").located(By.xpath("//input[@name='state_/_province_/_regionRegisterPage']"));
    public static final Target POSTAL_CODE = Target.the("").located(By.xpath("//input[@name='postal_codeRegisterPage']"));

    public static final Target AGREE = Target.the("").located(By.xpath("//input[@name='i_agree']"));
    public static final Target REGISTER = Target.the("").located(By.xpath("//button[@id='register_btnundefined']"));
}
