class Solution {
    public boolean areNumbersAscending(String s) {
        int j = 0;
    
    for(String str: s.split(" "))
    {
        if(Character.isDigit(str.charAt(0)))
        {
            int num = Integer.parseInt(str);
            
            if(num <=j)
                return false;
            
            j = num;
        }
    }
    return true;

    }
}