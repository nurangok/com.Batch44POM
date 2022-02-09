package tests.day20;

import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class C06_RigthExcel {
    @Test
    public void test01() throws IOException {
      //ulkeler exceline 5.sutun olarak nufus sutunu ekleyelim
      //3.satuirdaki ulkenin nufusunu 1000000 yapalim
        //dosyaa ulasalim
      String path="src/test/java/resources/ulkeler.xlsx";
        FileInputStream fis=new FileInputStream(path);
        //clasta calismak icin dosyanin bir kopyasi oaln bir workbook olusturalim
        Workbook workbook= WorkbookFactory.create(fis);
       //3-dosyada yapmak istedigimiz degisiklikleri
        //kopya workbook da yapalim
        //ilk satirihn besinci hucresine nufus basligi yazdiralim
        workbook.getSheet("sayfa1").getRow(0).createCell(4).setCellValue("NUFUS");
        //3.satuirdaki ulkenin nufusunu 1000000 yapalim
        workbook.getSheet("sayfa1").getRow(2).createCell(4).setCellValue("1000000");



      //4-kopyada yaptigimiz degisiklikleri ana dosyaya kaydedlim

        FileOutputStream fos = new FileOutputStream(path);
        //excel aciksa bu methodu uygulamak dosyayi bozar, excelin kaali oldugundan emin olu
        CellStyle sayfa1 = workbook.getSheet("Sayfa1").getRow(0).getCell(1).getCellStyle();
        workbook.getSheet("Sayfa1").getRow(0).getCell(4).setCellStyle(sayfa1);
        workbook.write(fos);

    }
}
