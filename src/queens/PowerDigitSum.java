

package queens;



public class PowerDigitSum {
    
    public static void main(String[] args){
        int max_index = 0;
        int max_chain = 0;
        int curr_chain = 0;
        for(int i = 1; i<=1000000; i++){
            curr_chain = getCollatzNumber(i);
            if( curr_chain >= max_chain){
                max_index = i;
                max_chain = curr_chain;
            }
        }
        System.out.println("Max Index: " + max_index);
        System.out.println("Max Chain: " + max_chain);    
    }
    
    static int getCollatzNumber(long number){
        int counter = 1;
        
        while(number > 1){
            if (number%2 == 0)
                number = number/2;
            else
                number = 3*number + 1;
            counter++;   
        }
        
        return counter;
    }
}
