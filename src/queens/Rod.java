package queens;

import java.util.Stack;

public class Rod {
    static Stack<Integer> stack = new Stack<>();
    
    public static void main(String[] args){
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        
        //System.out.println(stack);
        reverseStack(stack);
        //System.out.println(stack);        
        
    }
    
    static Stack reverseStack(Stack stack){
        if(stack.isEmpty())
            return null;
        System.out.println(stack);
        int temp = (Integer)stack.pop();
        
                
        reverseStack(reverseStack(stack));
        stack.push(temp);
        System.out.println(stack);
        
        return stack;
    }
}
