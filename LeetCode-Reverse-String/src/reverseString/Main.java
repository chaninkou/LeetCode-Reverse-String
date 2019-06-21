package reverseString;

import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		char[] input = {'h','e','l','l','o'};
		
		System.out.println("Input: " + Arrays.toString(input));
		
		ReverseStringSolution output = new ReverseStringSolution();
		
		output.reverseString(input);
		
	}
}
