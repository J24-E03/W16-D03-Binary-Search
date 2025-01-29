public class AdditionalAlgorithm {
    public static void main(String[] args) {
        // Task 1
        System.out.println(checkForDuplicates(new int[]{1, 2, 3, 1}));
        System.out.println(checkForDuplicates(new int[]{1, 2, 3, 4}));
        System.out.println(checkForDuplicates(new int[]{1, 1, 1, 3, 3, 4, 3, 2, 4, 2}));

        // Task 2
        System.out.println(checkIfTwoStringsAreAnagrams("anagram", "nagaram"));
        System.out.println(checkIfTwoStringsAreAnagrams("rat", "car"));

        // Task 3
        System.out.println(createBalloons("nlaebolko"));
        System.out.println(createBalloons("loonbalxballpoon"));
        System.out.println(createBalloons("leetcode"));
    }

    private static boolean checkForDuplicates(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkIfTwoStringsAreAnagrams(String first, String second) {
        char[] firstArray = first.toCharArray();
        char[] secondArray = second.toCharArray();

        int lettersFound = 0;
        boolean flag = true;

        for (char c : firstArray) {
            if (flag) {
                flag = false;
                for (int i = 0; i < secondArray.length - lettersFound; i++) {
                    if (c == secondArray[i]) {
                        lettersFound++;
                        char temp = secondArray[i];
                        secondArray[i] = secondArray[secondArray.length - lettersFound];
                        secondArray[secondArray.length - lettersFound] = temp;
                        flag = true;
                        break;
                    }
                }
            }
        }
        return flag;
    }

    private static int createBalloons(String text) {
        char[] balloon = {'b', 'a', 'l', 'l', 'o', 'o', 'n'};
        char[] letters = text.toCharArray();

        int lettersFound = 0;
        int words = 0;

        for (char letter : letters) {
            for (int i = 0; i < balloon.length - lettersFound; i++) {
                if (letter == balloon[i]) {
                    lettersFound++;
                    char temp = balloon[i];
                    balloon[i] = balloon[balloon.length - lettersFound];
                    balloon[balloon.length - lettersFound] = temp;
                    if (lettersFound == balloon.length) {
                        words++;
                        lettersFound = 0;
                    }
                    break;
                }
            }
        }

        return words;
    }
}
