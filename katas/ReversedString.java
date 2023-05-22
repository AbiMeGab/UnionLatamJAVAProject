public class ReversedString {
    public static String solution(String str) {
        char[] charArray = str.toCharArray();
        char[] reverseArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reverseArray[i] = charArray[charArray.length - 1 - i];
        }
        String joinArray = new String(reverseArray);
        return joinArray;
    }
}