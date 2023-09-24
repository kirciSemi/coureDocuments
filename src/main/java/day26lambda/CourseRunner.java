package day26lambda;

import java.util.ArrayList;
import java.util.List;

public class CourseRunner {
    public static void main(String[] args) {
        Course courseTurkishDay = new Course("Summer","Turkish Day",97,128);
        Course courseTurkishNight = new Course("Winter","Turkish Night",98,154);
        Course courseEnglishDay = new Course("Spring","English Day",95,132);
        Course courseEnglishNight = new Course("Fall","English Night",93,144);

        List<Course> coursesList = new ArrayList<>();
        coursesList.add(courseTurkishDay);
        coursesList.add(courseTurkishNight);
        coursesList.add(courseEnglishDay);
        coursesList.add(courseEnglishNight);

        System.out.println(coursesList);

        //1)Tum "averageScore" larin 91 den buyuk olup olmadigini kontrol kodu yaziniz
        boolean result1 = coursesList.stream().allMatch(t-> t.getAvarageScore()>91);
        System.out.println(result1);

        //2)Tum kurslardaki ögrenci sayilarinin larin 100 den buyuk olup olmadigini kontrol kodu yaziniz
        boolean result2 = coursesList.stream().allMatch(t-> t.getNumberOfStudents()>100);
        System.out.println(result2);
        //3)Kurs isimlerinden en az birinin "Turkish" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        boolean result3 = coursesList.stream().anyMatch(t-> t.getCourseName().contains("Turkish"));
        System.out.println(result3);
        //4)dönem isimlerinden en az birinin "Summer" kelimesini icerip icermedigini kontrol eden kodu yaziniz.
        boolean result4 = coursesList.stream().anyMatch(t-> t.getSeason().contains("Summer"));
        System.out.println(result4);

        boolean result5 = coursesList.stream().noneMatch(t-> t.getSeason().contains("Fall"));
        System.out.println(result5);
        //6) Kurs isimleri icinde "German" isminin hic bulunmadigini kontrol eden kodu yaziniz.
        boolean result6 = coursesList.stream().noneMatch(t-> t.getCourseName().contains("German"));
        System.out.println(result6);
    }

}
