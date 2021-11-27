class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int mid=0;
        int l=0;
        int h=letters.length;
        while(l<=h)
        {
             mid=(l+h)/2;
            if(mid-1<0)
            {
                if(letters[mid]==target)
                {
                    return letters[mid+1];
                }
                return letters[mid];
            }
           if(letters[mid-1]==target&&letters[mid]!=target)
           {
               return letters[mid];
           }
            else if(target<letters[mid]&&letters[mid-1]<target)
            {
                return letters[mid];
            }
            else if(target>=letters[mid])
            {
                l=mid+1;
                if(l>letters.length-1)
                {
                    return letters[0];
                }
            }
            
            else{
                h=mid-1;
            }
        }
        return 'n';
    }
}