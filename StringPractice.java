public class StringPractice {
    public static void main(String[] args) {

        // Declare strings
        String str1 = "Hello";
        String str2 = "World";

        // length()
        System.out.println("Length of str1: " + str1.length());

        // concat()
        String combined = str1.concat(" " + str2);
        System.out.println("Concatenated string: " + combined);

        // toUpperCase()
        System.out.println("Uppercase str1: " + str1.toUpperCase());

        // toLowerCase()
        System.out.println("Lowercase str2: " + str2.toLowerCase());

        // substring()
        System.out.println("Substring of str1 (0-3): " + str1.substring(0, 3));

        // equals()
        System.out.println("str1 equals str2? " + str1.equals(str2));

        // replace()
        System.out.println("Replace l with x in str1: " + str1.replace('l', 'x'));

        // charAt()
        System.out.println("Character at index 1 in str1: " + str1.charAt(1));
    }
}
