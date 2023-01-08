package be.nadira;

public class Prime2 {
    public static void main(String[] args) {
        int n=0;
        for(n=1; n<501; n++){
            boolean checkPrime = isPrime(n);
            System.out.println(n);
            System.out.println(checkPrime);

        }
    }
    private static boolean isPrime(int n){
        int  i;
        int m = 0;
        int p = 0;
        m = n / 2;
        if(n==0 || n==1){
            return false;

        } else {
            for(i=2;i<=m; i++){
                if(n % i ==0){
                    return false;
                }
            }
        }
        if(p == 0){
            return true;
        }
        return false ;
    }
}
