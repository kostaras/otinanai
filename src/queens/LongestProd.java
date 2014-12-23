

package queens;

import java.io.*;
import java.util.*;

public class LongestProd {
    int max = 0;
    static int[][] array = new int[20][20];
    
    public static void main(String[] arg){
        insertData("C:/Users/KG021331/Documents/NetBeansProjects/Queens/src/"
                + "queens/data.txt");
        System.out.println(getMaxHorizontally());
        System.out.println(getMaxVertically());
        System.out.println(getMaxDiag());
        System.out.println(getMaxAntiDiag());
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
    
    static int getMaxHorizontally(){
        int max = 0;
        int temp = 0;
        for(int i = 0; i < array.length; i++)
            for(int j = 0; j< array.length - 3; j++){
                temp = array[i][j]*array[i][j+1]*array[i][j+2]*array[i][j+3];
                if(temp > max)
                    max = temp;
            }
        return max;
    }
    
    static int getMaxVertically(){
        int max = 0;
        int temp = 0;
        for(int i = 0; i < array.length - 3; i++)
            for(int j = 0; j< array.length; j++){
                temp = array[i][j]*array[i+1][j]*array[i+2][j]*array[i+3][j];
                if(temp > max)
                    max = temp;
            }
        return max;
    }
    
    static int getMaxDiag(){
        int max = 0;
        int temp = 0;
        for(int i = 0; i < array.length - 3; i++)
            for(int j = 0; j< array.length -3; j++){
                temp = array[i][j]*array[i+1][j+1]*array[i+2][j+2]*array[i+3][j+3];
                if(temp > max)
                    max = temp;
            }
        return max;
    }
    
    static int getMaxAntiDiag(){
        int max = 0;
        int temp = 0;
        for(int i = 0; i < array.length - 3; i++)
            for(int j = 3; j< array.length; j++){
                temp = array[i][j]*array[i+1][j-1]*array[i+2][j-2]*array[i+3][j-3];
                if(temp > max)
                    max = temp;
            }
        return max;
    }
}
