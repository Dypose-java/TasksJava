public class MergeStringsAlternately {

    public static void main(String[] args) {
        String word1 = "abcd", word2 = "abcd";
        String string = MergeStringsAlternately.mergeStringsAlternately(word1, word2);
        String string1 = MergeStringsAlternately.mergeStringsAlternatelyGPT(word1, word2);


    }

    public static String mergeStringsAlternately(String word1, String word2) {
        int word1Length = word1.length(), word2Length = word2.length();
        char[] charArray1 = word1.toCharArray();
        char[] charArray2 = word2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        if (word2Length > word1Length) {
            for (int i = 0; i < word1Length; i++) {
                stringBuilder.append(charArray1[i]).append(charArray2[i]);
            }
            stringBuilder.append(word2.substring(word1Length, word2Length));

        } else if (word1Length > word2Length) {
            for (int i = 0; i < word2Length; i++) {
                stringBuilder.append(charArray1[i]).append(charArray2[i]);
            }
            stringBuilder.append(word1.substring(word2Length, word1Length));
        } else
            for (int i = 0; i < word1Length; i++) {
                stringBuilder.append(charArray1[i]).append(charArray2[i]);
            }
        return stringBuilder.toString();
    }

    public static String mergeStringsAlternatelyGPT(String str1, String str2) {
        int counter = 0;
        StringBuilder stringBuilder = new StringBuilder();
        while (counter < str1.length() || counter < str2.length()) {
            if (counter < str1.length())
                stringBuilder.append(str1.charAt(counter));
            if (counter < str2.length())
                stringBuilder.append(str2.charAt(counter));
            counter++;
        }
        return stringBuilder.toString();
    }

}
