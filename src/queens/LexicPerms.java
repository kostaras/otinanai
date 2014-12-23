package queens;

public class LexicPerms {
    
    static int[] perms = {1,2,3,4};
    
    public static void main(String[] arg){
        long max = 1;
        while(nextPermutation(perms)){
            long temp = toNumber(perms);
            if(isPrime(temp))
                System.out.println(temp);       
        }
        System.out.println(max);
    }
    
    
    static boolean nextPermutation(int[] array) {
    // Find longest non-increasing suffix
    int i = array.length - 1;
    while (i > 0 && array[i - 1] >= array[i])
        i--;
    // Now i is the head index of the suffix
    
    // Are we at the last permutation already?
    if (i == 0)
        return false;
    
    // Let array[i - 1] be the pivot
    // Find rightmost element that exceeds the pivot
    int j = array.length - 1;
    while (array[j] <= array[i - 1])
        j--;
    // Now the value array[j] will become the new pivot
    // Assertion: j >= i
    
    // Swap the pivot with j
    int temp = array[i - 1];
    array[i - 1] = array[j];
    array[j] = temp;
    
    // Reverse the suffix
    j = array.length - 1;
    while (i < j) {
        temp = array[i];
        array[i] = array[j];
        array[j] = temp;
        i++;
        j--;
    }
    
    // Successfully computed the next permutation
    return true;
    }
    
    static void dispArr(){
        for(int i = 0; i<perms.length;i++)
            System.out.print(perms[i]);
        System.out.println("");
    }
    
    static boolean isPrime(long n){
        for(long i =2; i<= Math.sqrt(n); i++)
            if(n%i == 0)
                return false;
        return true;             
    }
    
    static long toNumber(int array[]){
        String temp = "";
        for (int i=0; i<array.length; i++)
            temp += array[i];
        return Long.parseLong(temp);
    }
}
