package jala.university.sw;
public class ReversedStrings {
    public static String solution(String str) {
        char[] charArray = str.toCharArray();
        char[] reverseArray = new char[charArray.length];
        for (int i = 0; i < charArray.length; i++) {
            reverseArray[i] = charArray[charArray.length - 1 - i];
        }
        return new String(reverseArray);
    }}