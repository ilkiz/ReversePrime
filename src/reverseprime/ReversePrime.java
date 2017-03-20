/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverseprime;

/**
 *
 * @author ilkiz
 */
public class ReversePrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int count=1;
        int number=2;
        
        do {
            if (isEmirp(number)) {                    
                    if (count%10==0)
                        System.out.println(number+", ");
                    else
                        System.out.print(number+", ");
                    
                    count++;
            }
            number++;
        } while (count<=100);
        
    }
    public static boolean isEmirp(int number){
        if (isPrime(number) && isPrime(reverse(number)) && number!=reverse(number)) {
            return true;
        }
        return false;
    }
    public static int reverse(int number){
        String sNumber=number+"";
        String reversed="";
        int n=sNumber.length();
        for (int i = 0; i < n; i++) {
            reversed=reversed+sNumber.charAt(n-i-1);
        }
        return Integer.parseInt(reversed);
    }
        public static boolean isPrime(int number){
        for (int j = 2; j < number; j++) {
            if (number%j==0) {
                return false;
            }
        }
        return true;
    }
    
}
