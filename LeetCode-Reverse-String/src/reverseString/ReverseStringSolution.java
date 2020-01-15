package reverseString;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ReverseStringSolution {
	// Fastest way to do it with O(1) space two pointers, it says it's O(n) time, but i feel like it o(log(n)) because it only visit half of it
    public void reverseString(char[] s) {
        int left = 0;
        int right = s.length - 1;
        
        // Swapping from start to end going towards middle
        while(left < right){
            char temp = s[left];
            
            s[left] = s[right];
            
            s[right] = temp;
            
            left++;
            right--;
        }
        
        System.out.println("output: " + Arrays.toString(s));
    }
    
    
    // Another solution but slower with queue
    public void reverseString2(char[] s) {
    	LinkedList<Character> queue = new LinkedList<>();
    	
    	for(int i = s.length - 1; i >= 0; i--){
    		queue.add(s[i]);
    	}
    	
    	for(int i = 0; i < s.length; i++){
    		s[i] = queue.removeFirst();
    	}
    	
    	System.out.println("output: " + Arrays.toString(s));
    }
    
    // Another solution but slower with stack
    public void reverseString3(char[] s) {
    	Stack<Character> stack = new Stack<>();
    	
    	for(int i = 0; i < s.length; i++){
    		stack.push(s[i]);
    	}
    	
    	for(int i = 0; i < s.length; i++){
    		s[i] = stack.pop();
    	}
    	
    	System.out.println("output: " + Arrays.toString(s));
    }
    
}
