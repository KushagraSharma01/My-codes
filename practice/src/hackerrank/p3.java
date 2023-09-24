package hackerrank;
import java.util.*;
public class p3 {

	    public static String reverseEqn(String S) {
	        Stack<Character> stack = new Stack<>();
	        StringBuilder result = new StringBuilder();

	        for (char c : S.toCharArray()) {
	            if (Character.isDigit(c)) {
	                result.append(c);
	            } else {
	                while (!stack.isEmpty() && precedence(c) <= precedence(stack.peek())) {
	                    result.append(stack.pop());
	                }
	                stack.push(c);
	            }
	        }

	        while (!stack.isEmpty()) {
	            result.append(stack.pop());
	        }

	        return result.reverse().toString();
	    }

	    private static int precedence(char operator) {
	        switch (operator) {
	            case '+':
	            case '-':
	                return 1;
	            case '*':
	            case '/':
	                return 2;
	            default:
	                return 0;
	        }
	    }

	    public static void main(String[] args) {
	        String equation1 = "20-3+5*2";
	        String equation2 = "5+2*56-2/4";

	        String reversed1 = reverseEqn(equation1);
	        String reversed2 = reverseEqn(equation2);

	        System.out.println(reversed1);  // Output: 2*5+3-20
	        System.out.println(reversed2);  // Output: 4/2-56*2+5
	    }
	}



