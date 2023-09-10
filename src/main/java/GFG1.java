import java.util.Scanner;
import java.util.Stack;

public class GFG1 {

	public static void main(String[] args) {
		System.out.println(revString());
		
	}
	// https://www.geeksforgeeks.org/check-for-balanced-parentheses-in-an-expression/
	static void balancing() {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		s.close();
		Stack<String> stk = new Stack<String>();
		for(int i = 0; i < str.length(); i++) {
			if(str.substring(i, i+1).equals("["))
				stk.push("[");
			else if(str.substring(i, i+1).equals("]")) {
				if(!stk.isEmpty()) {
					String top = (String) stk.peek();
					if(top.equals("["))
						stk.pop();
				}
			}
			else if(str.substring(i, i+1).equals("{")) 
				stk.push("{");
			else if(str.substring(i, i+1).equals("}")) {
				if(!stk.isEmpty()) {
					String top = (String) stk.peek();
					if(top.equals("{"))
						stk.pop();
				}
			}
			else if(str.substring(i, i+1).equals("("))
				stk.push("(");
			else if(str.substring(i, i+1).equals(")")) {
				if(!stk.isEmpty()) {
					String top = (String) stk.peek();
					if(top.equals("("))
						stk.pop();
				}
			}
		}
		if(stk.isEmpty())
			System.out.println("Balanced");
		else
			System.out.println("Not Balanced");
		
	}
	
	// https://practice.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
	@SuppressWarnings("resource")
	static String revString() {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String revStr = "";
		if(str == null || str.length() == 0)
			return "";
		Stack<String> stack = new Stack<>();
		for(int i = 0; i < str.length(); i++) {
			stack.push(str.substring(i, i+1));
		}
		int length = stack.size();
		for(int i = 0; i < length; i++) {
			revStr = revStr + stack.pop();
		}
		s.close();
		return revStr;
	}
}