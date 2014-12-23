package queens;


public class DigitFact {
    
    
    static int getPartFactorial(int n){
        int sum = 0;
        String str = String.valueOf(n);
        for(int i = 0; i<str.length(); i++){
            sum += getFact(Integer.parseInt("" + str.charAt(i)));
        }
        return sum;
    }
    
    static int getFact(int n){
        int fact = 1;
        if(n > 1)
            for(int i =1 ; i<=n; i++)
                fact *= i;
        return fact;
    }
    
    public static void main(String[] args){
        int i = 2;
        while(true){
            if(i == getPartFactorial(i))
                System.out.println(i);
            i++;
        }
    }
}
