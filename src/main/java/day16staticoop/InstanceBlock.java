package day16staticoop;

public class InstanceBlock {

    public int year;

    public InstanceBlock() {
    }

    public InstanceBlock(int year) {

        this.year = year;
    }

    //Instance Block tüm Constractor metodlar içinde bulunmasını istediğimiz kodları yazdığımız bloktur. Bu alanda yazdığımız kodlar tüm constractorların içinde varmış gibi çalışır.
    //Instance Block kod tekrarının önüne geçmemizi sağlar
    {
        System.out.println("Hello World");
    }
}
