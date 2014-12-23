package queens;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;;


public class MaximumTotal {
    int max = 0;
    static int[][] array = new int[100][100];
    
    public static void main(String[] arg){
        insertData("C:/Users/KG021331/Documents/NetBeansProjects/Queens/src/"
                + "queens/maxtotal.txt");
        System.out.println(findMax());
        
    }
    
    static void insertData(String filename){
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String str;
            int i=0;
            while ((str = in.readLine()) != null) {
                String arr[] = str.split(" ");                
                for(int j = 0; j<arr.length; j++)
                    array[i][j] = Integer.valueOf(arr[j]);
                i++;
            }
        in.close();
        } catch (IOException e) {}
    }
    
    static void dispArr(){
        for(int i = 0; i<array.length; i++){
            for(int j=0;j<array.length; j++)
                System.out.print(array[i][j] + " ");
            System.out.println("");
        }
    }
    
    static int findMax(){
        for(int i=array.length - 2; i>=0 ;i--)
            for(int j = 0; j <= i; j++){
                int temp1 = array[i][j] + array[i+1][j];
                int temp2 = array[i][j] + array[i+1][j+1];
                if(temp1>temp2)
                    array[i][j] = temp1;
                else
                    array[i][j] = temp2;
            }
        return array[0][0];
    }
}
