// Online Java Compiler
// Use this editor to write, compile and run your Java code online

// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Solution {
    Node head;
    public class Node{
        Node next;
        int data;
        Node(int data)
        {
            this.data=data;
            this.next=null;
        }
        
    }
    public void addFirst(int data)
    {
        Node new1=new Node(data);
        new1.next=head;
    head=new1;
        
    }
    public void addLast(int data){
        Node temp=head;
         Node new1=new Node(data);
        if(head==null)
        {
            head=new1;
            return;
        }
        
         while(temp.next!=null)
         {
             temp=temp.next;
         }
         temp.next=new1;
         
    }
    public void printlist()
    {
        Node temp=head;
         if(head==null)
        {
            
            return;
        }
        while(temp!=null)
        {
            System.out.println(temp.data+" ");
            temp=temp.next;
        }
    }
    public void removefirst()
    {
        if(head==null)
        {
            return;
        }
        head=head.next;
    }
    public void removelast()
    {
         if(head==null)
        {
            return;
        }
         if(head.next==null)
        {
            head=null;
            return;
        }
        Node temp=head;
        while(temp.next.next!=null)
        {
            temp=temp.next;
        }
        temp.next=null;
    }
    public void insertmid(int idx,int data)
    {
        Node temp=head;
        Node prev=null;
        int count=1;
         Node new1=new Node(data);
        if(head==null)
        {
            head=new1;
            return;
        }
        while(count!=idx)
        {
            count++;
            prev=temp;
            temp=temp.next;
        }
        new1.next=temp;
        prev.next=new1;
    }
    public Node reverse(Node head)
    {
        Node temp=head;
        Node prev=null,after=null;
        if(head==null)
        {
            return null;
        }
        while(temp!=null)
        {
            after=temp.next;
            temp.next=prev;
            prev=temp;
            temp=after;
        }
      
        return prev;
    }
    public Node middle(Node head)
    {
        int count=1;
        if(head==null)
        {
            return null;
        }
        if(head.next==null)
        {
            // System.out.println(head.data+" ");
            return null;
        }
        Node fast=head.next.next,slow=head;
        while(fast!=null && fast.next!=null)
        {
           
            fast=fast.next.next;
            slow=slow.next;
            count++;
        }
        if(count%2==0)
        {
            // System.out.println(slow.data+" ");
            return slow;
        }
        else{
            // System.out.println(slow.next.data+" ");
            return slow.next;
        }
    }
    public boolean ispalindrome(Node head)
    {
        if(head==null || head.next==null)
        {
            return true;
        }
        Node s3=middle(head);
        Node s4=reverse(s3.next);
        Node s5=head;
        while(s4!=null)
        {
            if(s4.data!=s5.data)
            {
                return false;
            }
            s4=s4.next;
            s5=s5.next;
        }
        return true;
        
    }
     public boolean iscyclic(Node head)
    {
       
        if(head==null)
        {
            return false;
        }
        if(head.next==null)
        {
            // System.out.println(head.data+" ");
            return false;
        }
        Node fast=head.next.next,slow=head;
        while(fast!=null && fast.next!=null)
        {
           
          if(fast==slow)
          {
              return true;
          }
            fast=fast.next.next;
            slow=slow.next;
           
        }
        return false;
    }
    
     public void removemiddle(int idx) 
     {
         int count=1;
         if(head==null)
         {
             return;
         }
         if(count==idx)
         {
             head=null;
             return;
         }
         Node temp=head,prev=null;
         while(temp!=null && count!=idx)
         {
             count++;
             prev=temp;
             temp=temp.next;
         }
         prev.next=temp.next;
         
     }
        
    
    public static void main(String[] args) {
        Solution s=new Solution();
        s.addFirst(1);
        s.addFirst(2);
      
        s.insertmid(2,2);
        s.addFirst(1);
    //   Node s1= s.middle();
        // s.head= s.reverse(s.head);
        //  s.removefirst();
        //  s.removelast();
        s.printlist();
        s.removemiddle(2);
        s.printlist();
        // System.out.println(s.iscyclic(s.head));
        
    }
    
}