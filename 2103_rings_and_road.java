class Solution {
    public int countPoints(String rings) {
        int a[]=new int[10];
        int b[]=new int[10];
        int c[]=new int[10];
        int count=0;
        for(int i=0;i<rings.length();i=i+2)
        {
            int d=rings.charAt(i+1)-'0';
            if(rings.charAt(i)=='B')
            {
                a[d]++;
            }
            else if(rings.charAt(i)=='R')
            {
                b[d]++;
            }
           else if(rings.charAt(i)=='G')
            {
                c[d]++;
            }
            
        }
        for(int j=0;j<10;j++)
        {
            if(a[j]>0 && b[j]>0 && c[j]>0)
            {
                count++;
            }
        }
        return count;
    }
}