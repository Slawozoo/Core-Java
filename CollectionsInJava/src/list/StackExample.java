package list;

import java.util.Stack;

public class StackExample {
	
	//performing push operation  
	static void pushelmnt(Stack stk, int x)   
	{  
	//invoking push() method      
	stk.push(new Integer(x));  
	System.out.println("push -> " + x);  
	//prints modified stack  
	System.out.println("stack: " + stk);  
	}  
	
	static void pushelmnt(Stack stk, String x)   
	{  
	//invoking push() method      
	stk.push(x);  
	System.out.println("push -> " + x);  
	//prints modified stack  
	System.out.println("stack: " + stk);  
	}  
	
	static void popelmnt(Stack stk)   
	{  
	System.out.print("pop -> ");  
	//invoking pop() method   
	Integer x = (Integer) stk.pop();  
	System.out.println(x);  
	//prints modified stack  
	System.out.println("stack: " + stk);  
	}
	
	
	public static void main(String[] args)   
	{  
	//creating an instance of Stack class  
	Stack<String> stk1 = new Stack<>();
	Stack<Integer> stk= new Stack<Integer>();  
	
	// checking stack is empty or not  
	boolean result = stk.empty();
	boolean str = stk1.empty();
	System.out.println("Is the stack1 empty? " + result);  
	System.out.println("Ist stack with String variable empty? :"+str);
	
	// pushing elements into stack  
	stk.push(78);  
	stk.push(113);  
	stk.push(90);  
	stk.push(120);
	pushelmnt(stk, 7);
	
	stk1.push("This is first element");
	stk1.push("Second element in a stack");
	stk1.push("Third element");
	stk1.push("Stack push 4");
	pushelmnt(stk1, "5");
	
	System.out.println(stk1);
	System.out.println(stk);
	
	//poping elements from stack
	popelmnt(stk);
	stk.pop();
	
	stk1.pop();
	
	//prints elements of the stack  
	System.out.println("Elements in Stack: " + stk);
	System.out.println("Elements in Stack with string variable: "+stk1);
	result = stk.empty();  
	System.out.println("Is the stack empty? " + result);
	}
}
