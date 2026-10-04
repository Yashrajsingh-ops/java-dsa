public class constructor {
    public static void main(String[] args) {
        student s1=new student("yash",20,165,"JNCT");
        System.out.println(s1.name + " ");
        System.out.println(s1.age + " ");
        System.out.println(s1.rollno + " ");
        System.out.println(s1.college);

        student s2 = new student();
        s2.markAttendance();
    }
    
}
 class student {
    String name;
    int age;
    int rollno;
    String college;
    
   student(){
    }
    student(String n , int a , int r , String c){
        name = n;
        age = a;
        rollno=r;
        college = c;
    }

     
        void markAttendance(){
            System.out.println("Attendance marked for " + name);
        }
    }
    
        
    
