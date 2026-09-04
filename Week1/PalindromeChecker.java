import java.util.Scanner;

public class PalindromeChecker {

    static boolean usingStringBuilder(String str) {
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equalsIgnoreCase(reversed);
    }

    static boolean usingTwoPointers(String str) {
        int left = 0;
        int right = str.length() - 1;

        while (left < right) {
            if (Character.toLowerCase(str.charAt(left)) !=
                Character.toLowerCase(str.charAt(right))) {
                return false;
            }
            left++;
            right--;
        }

        return true;
    }

    static boolean usingRecursion(String str, int left, int right) {
        if (left >= right) {
            return true;
        }

        if (Character.toLowerCase(str.charAt(left)) !=
            Character.toLowerCase(str.charAt(right))) {
            return false;
        }

        return usingRecursion(str, left + 1, right - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("StringBuilder: " +
                usingStringBuilder(str));

        System.out.println("Two Pointers: " +
                usingTwoPointers(str));

        System.out.println("Recursion: " +
                usingRecursion(str, 0, str.length() - 1));

        sc.close();
    }
}