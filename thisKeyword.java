public class thisKeyword {
    public static void main(String[]args){

    }
    class student{
        String name;
        int age;
        String college;

        student(){
            System.out.println("Default connstructor");
        }
        student(String name , int age ){
            this.name = name;
            this.age = age;
        }
        student(String name , int age , String college){
            this.name =name;
            this.age=age;
            this.college=college;

        }
    }
}
