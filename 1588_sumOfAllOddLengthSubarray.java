class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int i=0,j=2,k=0,sum=0,sum1=0;
        for(int r=0;r<arr.length;r++)
        {
            sum1=sum1+arr[r];
            
        }
        System.out.println(sum1);
        while(j<arr.length)
        {
            
            for(int m=0;m<=j-1;m++)
            {
                sum=sum+arr[m];
            }
            // System.out.println(sum);
            k=j;
            while(k<arr.length)
            {
                // System.out.println(sum);
                sum=sum+arr[k];
                 System.out.println(sum);
                sum1+=sum;
                sum=sum-arr[i];
                i++;
                k++;
            }
            i=0;
            sum=0;
            j+=2;
            
            
        }
        return sum1;
    }
}