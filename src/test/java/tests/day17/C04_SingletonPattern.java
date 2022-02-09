package tests.day17;

import org.testng.annotations.Test;
import utilities.Driver;

public class C04_SingletonPattern {

    @Test
    public void test01(){

          //singleton pattern:bir classtan birden fazla obje uretilmesine
         //izin vermeyen bir pattern olarak kabul gormustur
        //biz driver classni driver uretmek uzere kullaniyoruz
        //ancak driver classnda driver isminde bir instance variable da var
        //ve biz obje ureterek bu instance variable ulasabiliriz


        /*Driver driver1=new Driver();
        Driver driver2=new Driver();
        Driver driver3=new Driver();*/


        //singleton pattern kabul gormus bir patterndir
        //amac bir classtan obje uretilmemesi saglamaktir
        //bunun icin singleton patternde koruyacagimiz classta
        //parametresiz bir constructor olusturur ve bu constructor i private yaparz








    }

}
