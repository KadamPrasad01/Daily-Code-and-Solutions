class Solution {
    public boolean isPalindromic(String s) {
        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            String binary = String.format("%8s", Integer.toBinaryString(ch))
                                  .replace(' ', '0');

            sb.append(binary);
        }

        return palindrome(sb.toString());
    }
    public boolean palindrome(String s){
        int left = 0;
        int right = s.length()-1;

        while(left < right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}