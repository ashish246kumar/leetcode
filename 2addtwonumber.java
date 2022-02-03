class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        
     if(l1==null||l2==null)
         {
           return  l1==null ?l2 : l1;
         }
        
        ListNode temp,temp2,prev,prev2,after,after2;
        
       ListNode h1=l1;
       ListNode h2=l2;
        ListNode itr=new ListNode(-1);
        ListNode temp1=itr;
        int carry=0,sum=0,s1=0;
while(h1!=null||h2!=null||carry!=0)
{
    sum=carry+(h1!=null?h1.val:0)+(h2!=null?h2.val:0);
    s1=sum%10;
    carry=sum/10;
    temp1.next=new ListNode(s1);
    temp1=temp1.next;
    if(h1!=null){
        h1=h1.next;
    }
    if(h2!=null)
    {
        h2=h2.next;
    }
}
        return (itr.next);
       
        
    }
    
    
}