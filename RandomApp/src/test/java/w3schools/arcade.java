package w3schools;

import CommonApi.Base;
import org.openqa.selenium.*;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Pratik on 1/2/2016.
 */
public class arcade extends Base {


    @Test
    public void login() throws InterruptedException {


        clickByCss(".user_buttons .login_btn.link_button.cursor-pointer");
        WebElement element1 = getWebElementByCss("#surf-xdm iframe:nth-child(1)");
        iframeHandle(element1);
        WebElement element2 = getWebElementByCss("#display-frame");
        iframeHandle(element2);


        typeByCss("#input_username", "Pratik");
        typeByCss(" #input_password", "password");

        clickByCss("#button_submit");

        goBackToHomeWindow();




    }
}
