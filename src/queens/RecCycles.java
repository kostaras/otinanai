

package queens;

import java.math.BigInteger;


public class RecCycles {
    public static void main(String[] arg){
        System.out.println(isPrime(71));
    }
    
    static boolean isPrime(int n){
        for(int i = 2; i<=Math.sqrt(n); i++) 
        if(n%i == 0)
            return false;           
        return true;
    }
    
    public void getPermutations(int n){
        permutation("", String.valueOf(n));
    }
    
    private void permutation(String prefix, String str) {
        if (str.length() == 0)
            System.out.println(prefix);
        else 
            for (int i = 0; i < str.length(); i++){
                boolean isDuplicate = false;
                for(int j = 0; j < i; j++)
                    if(str.charAt(j) == str.charAt(i))
                        isDuplicate = true;
                if(!isDuplicate){
                    permutation(prefix + str.charAt(i), 
                       str.substring(0, i) + str.substring(i+1, str.length()));
                    System.out.println(str.substring(0, i) + str.substring(i+1, str.length()));
                }
            } 
    }
}
