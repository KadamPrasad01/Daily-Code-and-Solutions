class Solution {
    public int longestCommonPrefix(int[] arr1, int[] arr2) {
        // int prefixLen = 0;
        // int n = arr1.length;
        // int m = arr2.length;

        // String[] s1 = new String[n];
        // String[] s2 = new String[m];

        // for (int i = 0; i < n; i++) {
        //     s1[i] = Integer.toString(arr1[i]);
        // }

        // for (int i = 0; i < m; i++) {
        //     s2[i] = Integer.toString(arr2[i]);
        // }
    
        // for(int i=0 ; i<n ; i++){
        //     for(int j=0 ; j<m ; j++){
        //         if (Math.min(s1[i].length(), s2[j].length()) <= prefixLen) {
        //             continue;
        //         }
                
        //         prefixLen = Math.max(prefixLen , prefixLength(s1[i],s2[j]));
        //     }
        // }
        // return prefixLen;

        Set<String> set = new HashSet<>();

        for (int num : arr1) {
            String s = Integer.toString(num);

            String prefix = "";
            for (char ch : s.toCharArray()) {
                prefix += ch;
                set.add(prefix);
            }
        }

        int maxLen = 0;

        for (int num : arr2) {
            String s = Integer.toString(num);

            String prefix = "";
            for (char ch : s.toCharArray()) {
                prefix += ch;

                if (set.contains(prefix)) {
                    maxLen = Math.max(maxLen, prefix.length());
                }
            }
        }

        return maxLen;
    }
    // public int prefixLength(String s1  , String s2){
    //     int n = Math.min(s1.length(),s2.length());
    //     int count = 0;

    //     for(int i=0 ; i<n ; i++){
    //         if(s1.charAt(i) == s2.charAt(i)){
    //             count++;
    //         }else{
    //             break;
    //         }
    //     }
    //     return count;
    // }
}
