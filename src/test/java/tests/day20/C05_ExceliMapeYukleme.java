package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Map;

public class C05_ExceliMapeYukleme {

    @Test
    public void test01()
    {
        //dosya yolu ve sayfa ismi verilen excel sheet i map olarak kaydede
        //reusable bir method olusturalim

        String path="src/test/java/resources/ulkeler.xlsx";
        String sayfaAdi="Sayfa1";

        Map<String,String> ulkelerMap= ReusableMethodsExcel.mapOlustur(path,sayfaAdi);

        //olusturduguuz map i kullnarak ulke ismi turkey bilgilerii yazdirin

        System.out.println("ulkelerMap = " + ulkelerMap.get("Turkey"));
        //Listede Netherlands oldugunu testedin
        Assert.assertTrue(ulkelerMap.containsKey("Netherlands"));

    }

}
