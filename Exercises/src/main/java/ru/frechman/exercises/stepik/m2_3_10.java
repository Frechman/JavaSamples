package ru.frechman.exercises.stepik;

public class m2_3_10 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("шалаш"));
    }

    /**
     * Checks if given <code>text</code> is a palindrome.
     *
     * @param text any string
     * @return <code>true</code> when <code>text</code> is a palindrome, <code>false</code> otherwise
     */
    public static boolean isPalindrome(String text) {
        text = text.replaceAll("[^A-Za-zА-Яа-я0-9]", "");
        String reverseText = new StringBuilder(text).reverse().toString();
        return text.equalsIgnoreCase(reverseText);
    }
}
