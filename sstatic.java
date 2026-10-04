public class sstatic {
    public static void main (String[]args){
        student s1 = new student ("yash",20,165);
        student s2 = new student ("abhaay",45,100);

    }   
}
class student{
    String name ;
    int age;
    int rollno;
    static String college= "jnct bhopal";
    static double grade;
    

    student(String name , int age , int rollno){
        this.name =name ;
        this.age = age;
        this.rollno = rollno;
    }
        static {
            grade = 6.5;
        }
        
    }

