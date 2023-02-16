/*
 * 1. Создать метод, который проверяет, является ли строка палиндромом.
 */
import java.util.Scanner;
public class Task01 {

    private static boolean isPalindrom(String str) {
        int len = str.length();
        if(len <= 1) return false;

        for(int i = 0; i < len; i++) {
            if(str.charAt(i) != str.charAt(len - 1 - i)) return false;
            if(i >= len/2) return true;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.printf("Введите строку для проверки на палиндром: ");
        String str = myScanner.nextLine();
        myScanner.close();

        System.out.printf("Признак палиндрома введённого слова: %s", isPalindrom(str));
    }
}