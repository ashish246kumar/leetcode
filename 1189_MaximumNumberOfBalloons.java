class Solution {
    public int maxNumberOfBalloons(String text) {
        HashMap<Character,Integer> h=new HashMap<>();
        int count=0;
        for(int i=0;i<text.length();i++)
        {
            char ch=text.charAt(i);
            
            h.put(ch,h.getOrDefault(ch,0)+1);
        }
        
        
            if(h.containsKey('b')&&h.containsKey('a')&&h.containsKey('l')&&h.containsKey('o')&&h.containsKey('n'))
            {
                while(h.get('b')>=1&&h.get('a')>=1&&h.get('l')>=2&&h.get('o')>=2&&h.get('n')>=1)
                {
                    count++;
                    
                
                if(h.get('b')==1)
                {
                    h.remove('b');
                    return count;
                }
                else{
                   h.put('b',h.get('b')-1);
                }
                if(h.get('a')==1)
                {
                     h.remove('a');
                    return count;
                }
                else{
                     h.put('a',h.get('a')-1);
                }
                 if(h.get('l')<=2)
                {
                     h.remove('l');
                    return count;
                }
                else{
                     h.put('l',h.get('l')-2);
                }
                 if(h.get('o')<=2)
                {
                     h.remove('o');
                    return count;
                }
                else{
                     h.put('o',h.get('o')-2);
                }
                 if(h.get('n')==1)
                {
                     h.remove('n');
                    return count;
                }
                else{
                     h.put('n',h.get('n')-1);
                }
                
                }
            }      
        
        return count;
        
    }
}