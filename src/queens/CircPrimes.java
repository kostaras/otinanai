package queens;

import java.util.*;

public class CircPrimes {
    
    
    public CircPrimes(int limit){
        initialize(limit);
    }
    
    public void initialize(int limit){
        int total = 0;
        for(int i = 2; i < limit; i++){
            if(areAllPrimes(circulateNumber(String.valueOf(i))))
                total++;
        }
        System.out.println("total: "+total);
    }    
    
    public List<String> circulateNumber(String number){
        List<String> nums = new ArrayList<String>();
        int counter = 0;
        String temp = null;
        while(counter < number.length()){
            temp = number.substring(counter, number.length()) +
                    number.substring(0, counter);
            nums.add(temp);
            
            counter++;
        }
        return nums;
    }
    
    public boolean areAllPrimes(List<String> numbers){
        for(int i = 0; i<numbers.size(); i++)
            if(!isPrime(Integer.parseInt(numbers.get(i))))
                return false;
        System.out.println(numbers);
        return true;
    }
    
    public boolean isPrime(int n){
        for(int i=2; i<=Math.sqrt((double)n); i++){
            if(n%i == 0)
                return false;
        }
        return true;
    }
    
    public static void main(String[] args){
        CircPrimes c = new CircPrimes(1000000);
    }
    
}
