class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character,Integer> lower = new HashMap<>();
        Map<Character,Integer> upper = new HashMap<>();
        int count = 0;

        for(int i=0 ; i<word.length() ; i++){
            char ch = word.charAt(i);
            if(Character.isLowerCase(ch)){
                lower.put(ch,i);
            }else if(!upper.containsKey(ch)){
                upper.put(ch,i);
            }
        }

        for(Map.Entry<Character,Integer> entry : lower.entrySet()){
            char lowerChar = entry.getKey();
            char upperChar = Character.toUpperCase(lowerChar);

            if(upper.containsKey(upperChar) && lower.get(lowerChar) < upper.get(upperChar)){
                count++;
            }
        }
        return count;
    }
}
