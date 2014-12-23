package queens;

import java.util.Arrays;


public class HeapPermutations {
    static int[] array = {1,2,3};
    
    
    static void getHeapPerm(int n){
        if (n == 1){
            System.out.println(Arrays.toString(array));
        }
        else{
            for(int i = 0; i<n; i++){
                getHeapPerm(n-1);
                if(n%2 == 1){
                    int temp = array[0];
                    array[0] = array[n-1];
                    array[n-1] = temp;  
                }else{
                    int temp = array[i] ;
                    array[i] = array[n-1];
                    array[n-1] = temp; 
                }
            }
        }
    }
    
    public static void main(String[] arg){
        getHeapPerm(array.length);
    }
}
