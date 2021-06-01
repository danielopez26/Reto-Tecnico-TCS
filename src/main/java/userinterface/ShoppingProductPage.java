package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingProductPage {

    public static final Target SPEAKERS = Target.the("").located(By.xpath("//div[@id='speakersImg']"));
    public static final Target BOSE = Target.the("").located(By.xpath("//a[text()='Bose Soundlink Bluetooth Speaker III']"));
    public static final Target ADDCART = Target.the("").located(By.xpath("//button[@name='save_to_cart']"));
    public static final Target SHOPPINGCART = Target.the("").located(By.xpath("//a[@id='shoppingCartLink']"));

    public static final Target PRODUCT = Target.the("").located(By.xpath("//tbody//tr[@class='ng-scope'][1]//td[2]//label[contains(@class,'product')]"));
}
