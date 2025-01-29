package org.dci;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        checkArrayDuplication();
        checkAnagram();
        checkTextForMaxBalloons();
    }

    private static void checkArrayDuplication() {
        int[] numbers = generateRandomArray();
        System.out.println("array of numbers: " + Arrays.toString(numbers));
        System.out.println("Are all numbers unique (using nested for loops) ? " + areAllNumbersUnique(numbers));
        System.out.println("Are all numbers unique (using stream) ? " + areNumbersUniqueUsingStream(numbers));

    }

    private static int[] generateRandomArray() {
        Random random = new Random();
        int n = random.nextInt(10) + 1;
        int[] numbers = new int[n];

        int min = 0;
        int max = 20;
        for (int i = 0; i < n; i++) {
            numbers[i] = random.nextInt(max - min + 1) + min;
        }

        return numbers;
    }

    private static boolean areAllNumbersUnique(int[] numbers) {
        // Solution 1: using nested for loops:
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    return false;
                }
            }
        }
        return true;
    }

    private static boolean areNumbersUniqueUsingStream(int[] numbers) {
        // Solution 2: using streams:
        return numbers.length == Arrays.stream(numbers)
                .boxed().collect(Collectors.groupingBy(num -> num)).keySet().size();
    }

    private static void checkAnagram() {
        String s = "listen";
        String t = "silent";
        System.out.printf("\n\"%s and \"%s are anagram (using streams)? %b\n", s, t, checkIfStringsAreAnagramUsingStream(s, t));
        System.out.printf("\"%s and \"%s are anagram (using for loops)? %b\n", s, t, checkIfStringsAreAnagram(s, t));
        s = "hello";
        t = "world";
        System.out.printf("\"%s and \"%s are anagram (using streams)? %b\n", s, t, checkIfStringsAreAnagramUsingStream(s, t));
        System.out.printf("\"%s and \"%s are anagram (using for loops)? %b\n", s, t, checkIfStringsAreAnagram(s, t));
    }

    private static boolean checkIfStringsAreAnagramUsingStream(String s, String t) {
        // solution 1: using streams
        if (s.length() != t.length()) {
            return false;
        }

        Map<String, Long> charMapS = Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        Map<String, Long> charMapT = Arrays.stream(t.split(""))
                .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

        return charMapS.equals(charMapT);
    }

    private static boolean checkIfStringsAreAnagram(String s, String t) {
        // solution 2: using for loops
        if (s.length() != t.length()) {
            return false;
        }

        Map<Character, Integer> charCount = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            charCount.put(s.charAt(i), charCount.getOrDefault(s.charAt(i), 0) + 1);
            charCount.put(t.charAt(i), charCount.getOrDefault(t.charAt(i), 0) - 1);
        }

        return charCount.values().stream().allMatch(count -> count == 0);
    }

    private static void checkTextForMaxBalloons() {
        String text = "nlaebolko";
        System.out.printf("\nNumber of \"balloons\" inside %s is: %d\n", text, balloonCounter(text));

        text = "loonbalxballpoon";
        System.out.printf("Number of \"balloons\" inside %s is: %d\n", text, balloonCounter(text));
    }

    private static int balloonCounter(String text) {
        Map<Character, Integer> characterMap = new HashMap<>();

       String balloonCharContainer = "ablno";
        for (char c : text.toLowerCase().toCharArray()) {
            if (balloonCharContainer.indexOf(c) != -1) {
                characterMap.put(c, characterMap.getOrDefault(c, 0) + 1);
            }
        }

        int minCount = Integer.MAX_VALUE;

        minCount = Math.min(minCount, characterMap.getOrDefault('a', 0));
        minCount = Math.min(minCount, characterMap.getOrDefault('b', 0));
        minCount = Math.min(minCount, characterMap.getOrDefault('l', 0) / 2);
        minCount = Math.min(minCount, characterMap.getOrDefault('o', 0) / 2);
        minCount = Math.min(minCount, characterMap.getOrDefault('a', 0));

        return minCount;
    }

}