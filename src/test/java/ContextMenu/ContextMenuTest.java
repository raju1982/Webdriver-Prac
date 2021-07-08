package ContextMenu;

import base.BaseTests;
import org.testng.annotations.Test;
import pages.ContextMenuPage;
import static org.testng.Assert.assertEquals;

public class ContextMenuTest extends BaseTests {

    @Test
    public void rightCLickTest(){
        ContextMenuPage contextMenuPage = homePage.clickContextMenu();
        contextMenuPage.rightClick();
        assertEquals(contextMenuPage.alert_getText(), "You selected a context menu");
        contextMenuPage.alert_clickToAccept();
    }


}
