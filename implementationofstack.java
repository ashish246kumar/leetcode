package test;
import java.util.*;
public class ImplementationofStack {
	
static class Stack{
	ArrayList<Integer> l=new ArrayList<>();
	public  boolean isEmpty()
	{
		return l.size()==0;
	}
	public  void push(int data)
	{
		l.add(data);
	}
	public  int pop()
	{
		if(l.isEmpty())
		{
			return -1;
		}
		int top=l.get(l.size()-1);
		l.remove(l.size()-1);
		return top;
	}
	public int peek()
	{
		return l.get(l.size()-1);
	}
}
public static void main(String args[])
{
	Stack s=new Stack();
	s.push(2);
	s.push(3);
	while(!s.isEmpty())
	{
		System.out.println(s.peek());
		s.pop();
	}

}