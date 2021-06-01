package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MainPage {
    public static final Target USER_ICON = Target.the("").located(By.xpath("//a[@id='menuUserLink']"));
    public static final Target NAME = Target.the("").located(By.xpath("//input[@name='username']"));
    public static final Target PASSWORD_USER = Target.the("").located(By.xpath("//input[@name='password']"));
    public static final Target SIGNIN = Target.the("").located(By.xpath("//button[@id='sign_in_btnundefined']"));


    public static final Target CREATE_ACCOUNT = Target.the("").located(By.xpath("    //a[@class='create-new-account ng-scope']"));

    public static final Target ACCOUNT = Target.the("").located(By.xpath("//a[@id='menuUserLink']//label[text()='My account']"));

}
