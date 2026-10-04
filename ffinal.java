public class ffinal {
    public static void main(String[]args){

        random r1=new random();
        System.out.println(random.PI);

        final int x;
        x=4;
        System.out.println(x);
        

    }
    
}
class random{
    static final double PI;

    static{
        PI=3.14159;
    }

}
