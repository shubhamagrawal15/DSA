package Strings.Hard;

public class SumofBeautyofAllSubstrings {
    public static void main(String[] args) {
        String s = "aabcbaa";
        int n = s.length();
        int result = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26]; // reset for each starting index
            for (int j = i; j < n; j++) {
                char ch = s.charAt(j);
                freq[ch - 'a']++;

                int maxFreq = 0;
                int minFreq = Integer.MAX_VALUE;

                // calculate beauty for this substring
                for (int f : freq) {
                    if (f > 0) {
                        maxFreq = Math.max(maxFreq, f);
                        minFreq = Math.min(minFreq, f);
                    }
                }

                result += (maxFreq - minFreq);
            }
        }

        System.out.println(result); // Expected for "aabcbaa" = 17
    }
}
