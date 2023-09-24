package day15stringbuilderaccessmodifier;

import java.security.SecureRandom;

public class Student {

    /*
    public > protected > default > private
    public      ==> her classdan kullanilabilir
    protected   ==> baska package lardan kullanilamaz
                    ancak baska package larda child class icinden kullanilabilir
    default     ==> baska package lardan kullanilamaz
    private     ==> sadece olusturulduklari class icinden kullanilabilirler

     */

    //public her clastan kullanılabilir
    public String stdName = "Ali Can";

    //protected olanlar başka packagelardan sadece childlarda görülebilir
    protected String adress ="İstanbul";

    //default access modifierlar da default keyword yazılmaz
    //defaultlar başka packageden kullanılamazlar
    String email = "ali.can@gmail.com";

    //private olan nesneler sadece olulşturuldukları class içinden ulaşılabilir
    private String ssnId = "123412413";


}
