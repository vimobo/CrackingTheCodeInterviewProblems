public class OneEditDistance {

    public boolean oneEditDistance (String s, String t) {
        boolean solution = false;
        int diferentCharCount = 0;
        int secondStringCounter = 0;

        if(!s.equals(t) && (s.length() == t.length() -1 || s.length() == t.length() + 1 || s.length() == t.length())) {

            
            for(int i = 0; i < s.length() && secondStringCounter < t.length(); i++) {
                    
                if(diferentCharCount == 0 && s.charAt(i) != t.charAt(secondStringCounter)){
                    diferentCharCount++;
            
                }
                secondStringCounter++;
            }
            

            
            if(s.length() == t.length() - 1 && diferentCharCount == 0)
                solution = true;

            else if(diferentCharCount <= 1)
                solution = true;
        }
            
        return solution;
    }

    public static void main (String[]args){
        String s = "abcd";
        String t = "accd";
        OneEditDistance oe = new OneEditDistance();
        
        System.out.println(oe.oneEditDistance(s,t));
    }
}