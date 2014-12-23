package queens;


public class AmicableNumbers {
    public static void main(String[] args){
        int totAmicNum = 0;
        for(int i=1; i<10000;i++)                
            if(i == getSumDivisors(getSumDivisors(i)))
                totAmicNum += i;
        System.out.println(totAmicNum);
    }
    
    static int getSumDivisors(int n){
        int sum = 0;
        for(int i = 1; i<= n/2; i++)
            if(n%i == 0)
                sum += i; 
        return sum;
    }
}
