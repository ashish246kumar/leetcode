
import java.util.*;
class Solution {
    static class Node{
        int data;
        Node next;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
    }
public static class Stack{
    // /ArrayList<Integer>al=new ArrayList<>();
   Node  head=null;
    public void push(int data)
    {
        Node new1=new Node(data);
        if(head==null)
        {
            head=new1;
            return;
        }
        new1.next=head;
        head=new1;
    }
    public int peek()
    {
        if(head==null)
        {
            return 0;
        }
        return head.data;
    }
    public int pop()
    {
         if((head==null))
        {
            head=null;
            return 0;
        }
         int d=head.data;
       head=head.next;
         return  d;
    }
    public boolean isempty()
    {
        return head==null;
    }
}
    public static void main(String[] args) {
        // System.out.println("Hello, World!");
        Stack s=new Stack();
        
        s.push(1);
        s.push(2);
        s.push(4);
        s.push(6);
        while(!s.isempty())
        {
            System.out.println(s.peek());
            s.pop();
        }
        
    }
}