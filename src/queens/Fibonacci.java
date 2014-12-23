/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package queens;

public class Fibonacci {
    static long ItFib(int n){
        long fib1 = 1;
        long fib2 = 1;
        long fib = 0 ;
        
        for(int i = 3; i <= n; i++){
            fib = fib1 + fib2;
            fib2 = fib1;
            fib1= fib;
        }
        return fib;
    }
    
    static long RecFib(int n){
        if(n == 1 || n == 2)
            return 1;
        else
            return (RecFib(n-1)+RecFib(n-2));
    }
    
    public static void main(String[] args){
        int i = 2;
        System.out.println(RecFib(7));
        System.out.println(++i);
    }
}
