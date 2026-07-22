class Solution {
    public boolean isPalindrome(String s){
        // s.replaceAll("\\s","");
        // s.toLowerCase()
        int l=0, r = s.length()-1;
        while(r>l){

            while(l< r && !Character.isLetterOrDigit(s.charAt(l))){
                l++;
            }
            while(r>l && !Character.isLetterOrDigit(s.charAt(r))){
                r--;
            }
            if(Character.toLowerCase(s.charAt(l)) != Character.toLowerCase(s.charAt(r))){
                return false;
            }
            l++ ; r--;
        }
        return true;
    }
}
