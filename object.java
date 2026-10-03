public class object {
    public static void main(String[] args) {
       
        student s1 = new student();
        student s2= new student();
        
        s1.name = "yash";
        s1.age = 21;
        s1.college = "jnct";
        s1.rollno = 165;

        s2.name = "abhay";
        s2.age = 45;
        s2.college = "BHU";
        s2.rollno = 101;


        s1.markAttendance();
        s2.markAttendance();
        s1.print();
        s2.print();
    }

   static class student {
            String name;
            int age;
            int rollno;
            String college;

            void markAttendance (){
                System.out.println("Attendance is marked");
            }
            void print (){
                System.out.println( name +" " + age + " " + college+ " " + rollno);
            }
        }


    
}

