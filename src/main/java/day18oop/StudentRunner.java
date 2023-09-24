package day18oop;

public class StudentRunner {
    public static void main(String[] args) {

        Student s1 = new Student();
        s1.setSuccesful(true);
        printStudent(s1);
        Student s2 = new Student("3214314512","Semi KIRCI",43,3.28,true);
        printStudent(s2);
    }
    public static void printStudent(Student s1)
    {
        System.out.println("-".repeat(40));
        System.out.println("s1.getStdId() = " + s1.getStdId());
        System.out.println("s1.stdName = " + s1.stdName);
        System.out.println("s1.getNotOrt() = " + s1.getNotOrt());
        System.out.println("s1.isSuccesful() = " + (s1.isSuccesful()==true?"Başarılı":"Başarısız"));
        System.out.println("-".repeat(40));
    }
}
