import java.util.*;
import java.lang.*;
public class Solution {
        public static String copy(int len, String str, char c) {
            for(int i = 0 ;i < len; i++) {
                str += c;
            }
            return str;
        }
        public static void main(String... args) {
            Scanner sc = new Scanner(System.in);
            String S = sc.nextLine();
            String C = sc.nextLine();
            String s = S.toLowerCase();
            String c = C.toLowerCase();
          	Set<Character> set = new HashSet<Character>();
          	for(int i = 0; i < s.length(); i++) {
              		if(set.contains(s.charAt(i))) {
                      		System.out.println("New Language Error");
                     		 return;
                    }
              		set.add(s.charAt(i));
            }
            int dp[] = new int[36];
            for (int i = 0; i < c.length(); i++) {
                if (c.charAt(i) - '0' >= 0 && c.charAt(i) - '0' <= 9) {
                    dp[26 + (c.charAt(i) - '0')]++;
                } else if(c.charAt(i) >= 'a' && c.charAt(i) <= 'z') {
                    dp[c.charAt(i) - 'a']++;
                }
            }
            String num = "";
            String str = "";
            for (int i = 0; i < c.length(); i++) {
                if (c.charAt(i) - '0' >= 0 && c.charAt(i) - '0' <= 9) {
                    num += c.charAt(i);
                }
                else if(c.charAt(i) >= 'a' && c.charAt(i) <= 'z') {
                    str += c.charAt(i);
                }
            }
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                String str1 = "";
                str1 += s.charAt(i);
                if (str.contains(str1)) {
                    int len = dp[s.charAt(i) - 'a'];
                    ans += copy(len, "", s.charAt(i));
                }
            }
            ans += " ";
            for (int i = 0; i < s.length(); i++) {
                String str1 = "";
                str1 += s.charAt(i);
                if (num.contains(str1)) {
                    int len = dp[26 + (s.charAt(i) - '0')];
                    ans += copy(len, "", s.charAt(i));
                }
            }
            if (ans.length() > 0) {
                System.out.println(ans);
            } else {
                System.out.println("New Language Error");
            }
        }
}