package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class AccountPage {
    public static final Target USER_ACCOUNT = Target.the("").located(By.xpath("//h3[text()='MY ACCOUNT']"));

    public static final Target EDIT = Target.the("").located(By.xpath("//h3[contains(text(),'Account details')]//a[text()='Edit']"));


}
