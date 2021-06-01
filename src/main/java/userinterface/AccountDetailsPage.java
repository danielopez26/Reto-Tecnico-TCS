package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountDetailsPage {

    public static final Target EMAIL = Target.the("").located(By.xpath("//input[@name='emailAccountDetails']"));

    public static final Target FIRST_NAME = Target.the("").located(By.xpath("//input[@name='first_nameAccountDetails']"));
    public static final Target LAST_NAME = Target.the("").located(By.xpath("//input[@name='last_nameAccountDetails']"));
    public static final Target PHONE_NUMBER = Target.the("").located(By.xpath("//input[@name='phone_numberAccountDetails']"));

    public static final Target COUNTRY = Target.the("").located(By.xpath("//select[@name='countryListboxAccountDetails']"));
    public static final Target CITY = Target.the("").located(By.xpath("//input[@name='cityAccountDetails']"));
    public static final Target ADDRESS = Target.the("").located(By.xpath("//input[@name='addressAccountDetails']"));
    public static final Target STATE = Target.the("").located(By.xpath("//input[@name='state_/_province_/_regionAccountDetails']"));
    public static final Target POSTAL_CODE = Target.the("").located(By.xpath("//input[@name='postal_codeAccountDetails']"));

    public static final Target SAVE = Target.the("").located(By.xpath("//button[@id='save_btnundefined']"));



}
