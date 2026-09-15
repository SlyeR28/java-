package SlidingWindowAndTwoPointer;

public class LongestSubsitringWithoutRepaeating {
    public int lenghtOfLongestSubstring(String s) {
        int len = 0;
        int j = 0;
        char [] charArray = s.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            while(charArray[i] == charArray[j]){
                j++;
                len--;
            }
            len = Math.max(len, j - i);
        }

        return len;
    }

    public static void main(String[] args) {
        String s = "abcabcabc";
        LongestSubsitringWithoutRepaeating l1 =  new LongestSubsitringWithoutRepaeating();
        System.out.println(l1.lenghtOfLongestSubstring(s));
    }
}
