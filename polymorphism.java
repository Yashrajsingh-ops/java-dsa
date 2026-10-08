public class polymorphism {
    public static void main(String[] args){
        A a = new A();
        a.fun();
    }
}
    class A{
        static void fun(){
            System.out.println("hello");
        }
        private void fun2(){
            System.out.println("hello");
        }
        private void fun3(){
            System.out.println("hello");
        }
    }
    class B extends A{
        static void fun(){
            System.out.println("bye");
        }
        void fun3(){
            System.out.println("bye");
        }
    }

   