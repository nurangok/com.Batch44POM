package tests.day20;

import org.testng.Assert;
import org.testng.annotations.Test;

public class C03_ReusableRunner {


    @Test
    public void test01(){
       //ulkeler excelindeki sayfa1 de
        //11.index deki satirin 2.indexteki hucresinin azerbaycan oldugunu test edin
     String path="src/test/java/resources/ulkeler.xlsx";
     String expectedData="Azerbaycan";

     String actualData= ReusableMethodsExcel.hucreGetir(path,"sayfa1",11,2).toString();
        Assert.assertEquals(actualData,expectedData);
    }
}
