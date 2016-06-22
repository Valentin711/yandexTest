package yandex.com.web.tests;


import org.testng.annotations.*;

public class Test_1 extends BaseTest{
    @Test
    public void TestFunctions()throws Exception{
        siteManager.getHomePage().openMapsPage();
        siteManager.getMapsPage().getTitle();
        //siteManager.getHomePage().openMapsPage();
        //siteManager.getHomePage().openMapsPage();
    }
}
