import java.util.Arrays;

public class ValidAnagram {

        public boolean isAnagram(String s, String t) {
        
            boolean answer = false;
            char[] charArrayS = s.toCharArray();
            char[] charArrayT = t.toCharArray();
            Arrays.sort(charArrayS);
            Arrays.sort(charArrayT);

            if(Arrays.equals(charArrayS, charArrayT)) 
                answer = true;

            return answer;
        }
}
