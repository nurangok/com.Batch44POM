package tests.day16;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.AmazonPage;
import utilities.Driver;

public class C02_PageIlkClass {
   //POM de farkli classlara farkli sekilde ulasilmasi benimsenmistir
    //driver class icin static yontemi kullaniyoruz
    //Page classlari icn ise obje uzerinden kullanilmasi tertcih edilmistir
    @Test
    public void test01(){
        //Amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
        //arama kutusuna Nutella yazip aratalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("nutella"+ Keys.ENTER);
        //arama sonuclarini nutella icerdigini test edelim
        String actualSonucStr=amazonPage.sonucYazisiElementi.getText();
        Assert.assertTrue(actualSonucStr.contains("nutella"));
        Driver.closeDriver();

    }
    @Test(groups = {"miniRegression","smoke"})
    public void test02(){
      //amazona gidelim
        Driver.getDriver().get("https://www.amazon.com");
      //java icin arama yapalim
        AmazonPage amazonPage=new AmazonPage();
        amazonPage.amazonAramaKutusu.sendKeys("java"+Keys.ENTER);
        //arama sonuclarinin Nutella cerdigini test et.
        String actualSonucStr= amazonPage.sonucYazisiElementi.getText();

        Driver.closeDriver();

    }

}