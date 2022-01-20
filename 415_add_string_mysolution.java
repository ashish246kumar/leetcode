class Solution {
    public String addStrings(String num1, String num2) {
        int l1=num1.length(),l2=num2.length();
       int i=l1-1,j=l2-1,numm1=0,numm2=0,carry=0,sum=0,val=0;
        String s="";
        while(i>=0||j>=0||carry==1)
        {
          if(i==0) 
          {
              numm1=0;
          }
            else{
                numm1=num1.charAt(i)-'0';
                i--;
            }
            if(j==0)
            {
                numm2=0;
            }
            else{
                
                numm2=num2.charAt(j)-'0';
                j--;
            }
            sum=numm1+numm2+carry;
            val=sum%10;
            carry=sum/10;
            s=Integer.toString(val)+s;
        }
        return s;
    }
}