class Solution {
    public int reverse(int x) {
        int reversed = 0 ;  

        while (x!=0){
            int x1 = x %10;
            if(reversed >Integer.MAX_VALUE/10||reversed==Integer.MAX_VALUE/10&& x1>7){
                return 0 ;
            }
            if(reversed <Integer.MIN_VALUE/10||reversed==Integer.MIN_VALUE/10&& x1<-8){
                return 0 ;
            }
            reversed= reversed*10 + x1;
            x/=10 ; 
        }
        return reversed ; 
        
    }
}