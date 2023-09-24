package day23exception;

public class ExceptionRunner {
    public static void main(String[] args){
        //getStudentGrade(77);
        //getStudentGrade(-77);
        //System.out.println("Main method");

            /*
    Exception lar disinda Error diye adlandirdigimiz ve handle edilemeyen bazi problemler vardir
     mesela application larda Memory nin dolmasi bir errordur
        iki tur memory error vardir:
        a) Stack memory dolarsa "StackOverFlow Error" alirsiniz
        b) Heap memory dolarsa "OutOfMemory Error" alirsiniz

        finalize:
        Garbage collector memory i temiz tutmak icin surekli memoryi tarar ve silinmesi gerekenleri siler
        Garbage collector silmeden once sileceği datalari "finalize" yapar sonra siler
        yani Garbage collector sadece finalized yapilmis objeleri toplar ve yok eder

        final - finally - finalize()

     */


        try {
            getTheNumberOfStudents(-15);
        } catch (InvalidNumberException e) {
            System.err.println(e.getMessage());
        }

    }
    public static void getStudentGrade(int grade){
        if (grade<0||grade>100) {
            try {
                throw new InvalidStudentGradeException("Öğrenci notları sıfırdan küçük yüzden büyük olamaz");
            } catch (InvalidStudentGradeException e) {
                e.printStackTrace();
                System.err.println(e.getMessage());
            }
        }else{
        System.out.println(grade);}
    }
    public static void getTheNumberOfStudents(int numOfStudents){
        if (numOfStudents<0) {
            throw new InvalidNumberException("Students' count never be smaller than zero");
        }else{System.out.println(numOfStudents);}

    }
}
