

package queens;

import java.util.*;


class KeylessEntry {
 
   int i = 0;
   public void test(int i){
       this.i++;
   }
 
   public static void main(String[] args) {
      KeylessEntry k = new KeylessEntry();
      
      k.test(k.i);
      System.out.println(k.i);
   }
}
