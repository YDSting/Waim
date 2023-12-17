import java.util.Arrays;
public class Main {

    // 1. Знайти довжину рядка.
    public static int findLength(String input) {
        return input.length();
    }

    // 2. Перевернути рядок задом наперед.
    public static String reverseString(String input) {
        return new StringBuilder(input).reverse().toString();
    }

    // 3. Перевірити, чи є рядок паліндромом.
    public static boolean isPalindrome(String input) {
        String reversed = reverseString(input);
        return input.equals(reversed);
    }

    // 4. Підрахувати кількість входжень певного символу в рядок.
    public static int countOccurrences(String input, char target) {
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }

    // 5. Замінити певний символ на інший символ у рядку.
    public static String replaceChar(String input, char target, char replacement) {
        return input.replace(target, replacement);
    }

    // 6. Видалити всі пробіли з рядка.
    public static String removeSpaces(String input) {
        return input.replaceAll("\\s", "");
    }

    // 7. Перевірити, чи починається рядок з певного префіксу.
    public static boolean startsWithPrefix(String input, String prefix) {
        return input.startsWith(prefix);
    }

    // 8. Перетворити всі символи у рядку на великі літери.
    public static String toUpperCase(String input) {
        return input.toUpperCase();
    }

    // 9. Розділити рядок на список слів за певним роздільником.
    public static String[] splitString(String input, String delimiter) {
        return input.split(delimiter);
    }

    // 10. Об'єднати список слів у рядок, розділені певним роздільником.
    public static String joinStrings(String[] words, String delimiter) {
        return String.join(delimiter, words);
    }

    // 11. Знайти слово з найбільшою кількістю букв.
    public static String findLongestWord(String input) {
        String[] words = input.split("\\s");
        String longestWord = "";
        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }

    public static void main(String[] args) {
        // Приклад використання:
        String userInput = "level";

        System.out.println("1. Довжина рядка: " + findLength(userInput));
        System.out.println("2. Рядок задом наперед: " + reverseString(userInput));
        System.out.println("3. Чи є паліндромом: " + isPalindrome(userInput));
        System.out.println("4. Кількість 'e' у рядку: " + countOccurrences(userInput, 'e'));
        System.out.println("5. Заміна 'e' на 'X': " + replaceChar(userInput, 'e', 'X'));
        System.out.println("6. Видалення пробілів: " + removeSpaces("Hello World"));
        System.out.println("7. Починається з 'lev': " + startsWithPrefix(userInput, "lev"));
        System.out.println("8. Усі символи у верхньому регістрі: " + toUpperCase(userInput));
        System.out.println("9. Розділити за 'l': " + Arrays.toString(splitString("Hello World", "l")));
        System.out.println("10. Об'єднати розділені слова: " +
                joinStrings(new String[]{"Hello", "World"}, "-"));
        System.out.println("11. Слово з найбільшою кількістю букв: " +
                findLongestWord("This is a sample sentence."));
    }
}