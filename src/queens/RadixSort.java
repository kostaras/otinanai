package queens;

public class RadixSort {

    private void sort(int a[]){
        //find max element
        int max=0;
        
        for (int i = 0; i<a.length; i++) {

            if(a[i]>max)
                max=a[i];
        }
        
        //calculate digits of max number
        int digitsMax=0;
        while (max!=0) {
            digitsMax++;
            max/=10;
        }
        
        
        int buckets = 10;
        int lists[][]=new int[a.length][10];
        

        for(int i = 0; i < digitsMax; i++){

            int c = 0;
            // set all elements in lists array to 0
            for (int j = 0; j < a.length; j++)
                for(int k = 0; k < buckets; k++)
                    lists[j][k]=0;
 
            // place the number into the correct bucket
            for(int j = 0; j < a.length; j++){
                int d = (int)((a[j] / Math.pow(10,i)) % 10);
                lists[j][d]=a[j];
            }
            // put the numbers back in the initial array
            // sorted by i significant digit
            for (int j = 0; j < buckets; j++)
                for(int k = 0; k < a.length; k++)
                    if(lists[k][j] != 0)
                        a[c++]=lists[k][j];
        }
        System.out.println("\nDisplay array after sorting: ");
        display(a);
    }

    public void input()throws Exception{

        int n = 13;
        int array[] = new int[n];
        
        array[0]  = 4252;
        array[1]  = 3;
        array[2]  = 543;
        array[3]  = 88;
        array[4]  = 875;
        array[5]  = 45;
        array[6]  = 573;
        array[7]  = 5;
        array[8]  = 35;
        array[9]  = 333;
        array[10] = 42;
        array[11] = 41;
        array[12] = 53;

        System.out.println("\nDisplay array before sorting: ");
        display(array);
        sort(array);
     }


    public void display(int a[]){
        for (int i = 0; i < a.length; i++)
            System.out.print(a[i]+"  ");
        System.out.println("");
    }

    public static void main(String[] args) throws Exception{
        new RadixSort().input();
    }
}