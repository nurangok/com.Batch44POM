package tests.day16;

import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;

public class C01_DriverIlkTest {
     //Driver class sayesinde eski driver est mort
    //artik driver a ihtiyac olursa Driver.gerDriver()yazariz

     @Test
    public void test01(){

      //amazona gidelim
         Driver.getDriver().get("https://www.amazon.com");
      //amazona gittgmzi test edelim
         String actualTitle=Driver.getDriver().getTitle();
         Assert.assertTrue(actualTitle.contains("Amazon"));
         //Driver.getDriver methopdu her calistiginda
         //driver=new ChromeDriver();komutundan oturu yeni bir driver olusturuyor
         //biz driver classdan getdriveri ilk calistrdgimzda new atamasi olsun
         //sonraki calismalarda atama olmasin istiyoruz
         //Bunun icin driver=new ChromeDriver() satiri bir if blogu icine aliyoruz
         Driver.closeDriver();
     }
    @Test
    public void test02(){
      //bestbuy anasayfaya gidelim
        Driver.getDriver().get("https://www.bestbuy.com");

      //bestbuya gittigimizi test edelim
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.contains("bestbuy"));
        Driver.closeDriver();
    }



}
