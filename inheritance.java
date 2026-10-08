public class inheritance {
    public static void main(String[]args){

    }
}
class Student{
    String name;
    int age;

    public void markAttendance(){
        System.out.println("Attendance marked");
    }
}
class EngineeringStudent extends Student{
    void attendLab(){
        System.out.println("lab attended");
    }
}
class MedicalStudent extends Student{
    void attendHealthClass(){
        System.out.println("Health class attended");
    }
}


