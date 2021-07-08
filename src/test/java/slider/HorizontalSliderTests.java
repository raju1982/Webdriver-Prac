package slider;

import base.BaseTests;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;
import pages.HorizontalSliderPage;
import pages.HoversPage;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testHoverUser1() {
        HorizontalSliderPage horizontalSliderPage = homePage.clickHorizontalSlider();
        System.out.println(horizontalSliderPage.getResult());
        horizontalSliderPage.moveSlider(Keys.ARROW_RIGHT);
        System.out.println(horizontalSliderPage.getResult());
    }

}
