package LongestPrefix;

public class main {
    public static void main(String[] args) {
    String [] strs = {"horse", "horde", "horror"};
        System.out.println(longestCommonPrefix(strs));

    }

    static String longestCommonPrefix(String[] strs) {
       if(strs.length == 1 ) return strs[0];
       if(strs.length == 0)return "";

       String base = strs[0];
        char ch;

        for (int i = 0; i < base.length() ; i++) {
            ch = base.charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if(i >= strs[j].length() || strs[j].charAt(i) != ch){
                    return base.substring(0,i);
                }
            }
        }
        return strs[0];

    }



}
