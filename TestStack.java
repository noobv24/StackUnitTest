package stack;
import junit.framework.TestCase;
public class TestStack extends TestCase{
	public void testNotEmptyStack() throws StackEmptyException {
		 System.out.println("------------testNotEmptyStack------------");
		 IntegerStack stack = new IntegerStack(10);
		  
		 stack.Push("3");
		 stack.Push("2");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");
		  
		 if (stack.IsEmpty()) 
			  System.out.println("Stack is empty");
		 else 
			  System.out.println("Stack is not empty");
		  
		 
		 System.out.println("Top of stack is " + stack.Peek());
	
		  
		 if (stack.Contains("5")) 
			  System.out.println("Stack contains 5");
		 else 
			  System.out.println("Stack does not contain 5");
		  
		 System.out.println("Pop value = " + stack.Pop());	
	}
	
	public void testPushOverMax() throws StackEmptyException {
		 System.out.println("------------testPushOverMax------------");
		 IntegerStack stack = new IntegerStack(5);
		  
		 stack.Push("3");
		 stack.Push("2");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");	 
	}
	
	public void testPopFunction() throws StackEmptyException {
		 System.out.println("------------testPopFunction------------");
		 IntegerStack stack = new IntegerStack(10);
		  
		 stack.Push("3");
		 stack.Push("2");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");
		 
		 System.out.println("Pop value = " + stack.Pop());
		 System.out.println("Pop value = " + stack.Pop());
		 System.out.println("Pop value = " + stack.Pop());
		 System.out.println("Pop value = " + stack.Pop());
		 System.out.println("Pop value = " + stack.Pop());
		 System.out.println("Pop value = " + stack.Pop());
		 System.out.println("Pop value = " + stack.Pop());	 
	}
	
	public void testEmptyStack() throws StackEmptyException {
		 System.out.println("------------testEmptyStack------------");
		 IntegerStack stack = new IntegerStack(10);
		  
		  if (stack.IsEmpty()) 
			  System.out.println("Stack is empty");
		  else 
			  System.out.println("Stack is not empty");
		  
		  System.out.println("Top of stack is " + stack.Peek());
		
		  
		  if (stack.Contains("5")) 
			  System.out.println("Stack contains 5");
		  else 
			  System.out.println("Stack does not contain 5");
		  
		  System.out.println("Pop value = " + stack.Pop());
	}
	
	public void testClearFunction() throws StackEmptyException {
		 System.out.println("------------testClearFunction------------");
		 IntegerStack stack = new IntegerStack(10);
		  
		 stack.Push("3");
		 stack.Push("2");
		 stack.Push("4");
		 stack.Push("5");
		 stack.Push("1");
		  
		 stack.Clear();
		 
		 if (stack.IsEmpty()) 
			  System.out.println("Stack is empty");
		  else 
			  System.out.println("Stack is not empty");
	}
}
