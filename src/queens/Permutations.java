

package queens;

import java.util.*;


public class Permutations {
    
    String str;
    Map<Character, Integer> occurencies = new HashMap<>();
    
    public Permutations(String str){
        this.str = str;
    }
    
    public void getPermutations(){
        permutation("", str);
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
    
    private void getCharOccurencies(){
        for(int i=0; i<str.length(); i++){
            if(occurencies.containsKey(str.charAt(i)))
                occurencies.put(str.charAt(i), occurencies.get(str.charAt(i)) + 1);
            else
                occurencies.put(str.charAt(i), 1);
        }  
    }
    
    private long factorial(Integer n){
        if(n.equals(0)) return 1;
        else{
            long factorial = 1;
            for(Integer i = 1; i < n + 1; i++)
                factorial *= i;
            return factorial;
        }      
    }
    
    public long getTotalNumberOfPermutations(){
        getCharOccurencies();
        long denominator = 1;
        for(Character key : occurencies.keySet())
            denominator *= factorial(occurencies.get(key));
        
        return factorial(str.length())/denominator;
        
    }
    
    public static void main(String[] args){
        new Permutations("eggw").getPermutations();
    }
    
}
