package day14constructor;

public class Car {
    //Variable lar oluşturmalıyız
      /*
    Constructor nedir?
    Classtan object olusturmamizi saglayan code blacklaridir
    Class olusturdugumuzda java bize otomatik olarak bir constructor verir
    Ama bu constructor gozle gorulmez, gözle gorulmeyen otomatik olarak java tarafindan verilen
    bu constructor lara default constructor denir
    default constructor ===> Car () {}

    siz kendi constructor inizi olusturdugunuz zaman java default constructor i siler

    Constructor nasil olusturulur
    Access Modifier + Class ismi + () + {}

    Method ile Constructor arasindaki fark nedir?
    1)Methodlarda return type olur, constructorlarda olmaz
    2)Methodlar yaptiklari ise gore isimlendirilirler, constructorlar ise her zaman Class ismi ile isimlendirilirler
    3)Methodlar bir aksiyon yapmak icin olusturulur, Constructorlar ise object olusturmak icindir
    4)Method isimleri kucuk harfle baslar, constructor isimleri ise class ismi ile ayni oldugu icin buyuk harf le baslar

    Parametreli constructorlar olusturarak ayni classdan farkli özelliklere sahip objecteler olusturabiliriz

     */

    String make;
    String model;
    int year;
    boolean hybrid;

    public Car(){}
    public Car(String make, String model, int year, boolean hybrid){//default constructor
        this.make = make;
        this.model = model;
        this.year = year;
        this.hybrid = hybrid;
    }
    public Car(String make, String model){
        this.make = make;
        this.model = model;
    }

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public Car(String make) {
        this.make = make;
    }
    //Methodlar oluşturulmalı Classın aktif özellikleri

    public void hareket(){
        System.out.println("Honda hızlı hareket eder");
    }

    public void dur(){
        System.out.println("Honda güvenli bir şekilde durur");
    }

    @Override
    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", hybrid=" + hybrid +
                '}';
    }


}
