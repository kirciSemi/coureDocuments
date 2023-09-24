package day18oop;

public class Student {

    private String stdId = "AC2023121212121";
    public String stdName = "Ali CAN";
    public int age = 15;
    private double notOrt = 3.15;
    private boolean succesful = false;

    public Student(){}
    public Student(String stdId, String stdName, int age, double notOrt, boolean succesful) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.age = age;
        this.notOrt = notOrt;
        this.succesful = succesful;
    }

    public String getStdId(){
        String[] stdIDs =this.stdId.split("");
        String getStsId="";
        for (int i = 0; i < stdIDs.length; i++) {
            if(i< stdIDs.length-2 && i>3)
            {
                getStsId+="*";
            }else{
                getStsId+=stdIDs[i];
            }
        }
        return getStsId;

    }
    public void setStdId(String id){
        if(id.length() == 11){
            this.stdId =stdId;
        }else{
            System.out.println("Student Id must have 11 digit");
        }
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesful() {
        return succesful;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesful(boolean succesful) {
        this.succesful = succesful;
    }
}
