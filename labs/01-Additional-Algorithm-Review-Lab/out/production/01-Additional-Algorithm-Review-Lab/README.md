# Lab: Working with Arrays, Strings, and HashMaps in Java

## Objective:
The objective of this lab is to practice solving problems using **Arrays**, **Strings**, and **HashMaps** in Java. These are common data structures used to manage and manipulate data effectively. You will be given three problems to solve.

---

## Problem 1: Check for Duplicates in an Array

### Problem Description:
Given an integer array `nums`, return `true` if any value appears at least twice in the array, and return `false` if every element is distinct.

### Example 1:
**Input**:
```java
nums = [1, 2, 3, 1]
```
**Output**:
```java
true
```
**Explanation**:
- The element `1` occurs at the indices `0` and `3`.

### Example 2:
**Input**:
```java
nums = [1, 2, 3, 4]
```
**Output**:
```java
false
```
**Explanation**:
- All elements are distinct.

### Example 3:
**Input**:
```java
nums = [1, 1, 1, 3, 3, 4, 3, 2, 4, 2]
```
**Output**:
```java
true
```

### Constraints:
- `1 <= nums.length <= 10^5`
- `-10^4 <= nums[i] <= 10^4`

---

## Problem 2: Check if Two Strings are Anagrams

### Problem Description:
Given two strings `s` and `t`, return `true` if `t` is an anagram of `s`, and `false` otherwise. 

### Example 1:
**Input**:
```java
s = "anagram", t = "nagaram"
```
**Output**:
```java
true
```

### Example 2:
**Input**:
```java
s = "rat", t = "car"
```
**Output**:
```java
false
```

### Constraints:
- `1 <= s.length, t.length <= 5 * 10^4`
- `s` and `t` consist of lowercase English letters.

---

## Problem 3: Maximize Instances of "balloon"

### Problem Description:
Given a string `text`, you want to use the characters of `text` to form as many instances of the word "balloon" as possible. 

You can use each character in `text` at most once. Return the maximum number of instances that can be formed.

### Example 1:
**Input**:
```java
text = "nlaebolko"
```
**Output**:
```java
1
```

### Example 2:
**Input**:
```java
text = "loonbalxballpoon"
```
**Output**:
```java
2
```

### Example 3:
**Input**:
```java
text = "leetcode"
```
**Output**:
```java
0
```

---

## Instructions:

### Step 1: **Solve Problem 1** - Duplicates in Array
- Implement a method that checks if there are duplicates in the given integer array. Use a **HashSet** or other suitable data structure to track unique elements as you iterate through the array.

### Step 2: **Solve Problem 2** - Anagram Check
- Implement a method to check if two strings are anagrams. A **HashMap** can be used to count the frequency of characters in both strings and compare them.

### Step 3: **Solve Problem 3** - Balloon Word Count
- Implement a method to find how many times the word "balloon" can be formed from the string `text`. This will involve counting the occurrences of each relevant character (i.e., 'b', 'a', 'l', 'o', 'n') and determining how many times you can form "balloon".

### Step 4: **Test Your Code**
- Once you have implemented the solutions, test each one with the provided examples as well as additional test cases (e.g., empty strings, edge cases).

---

## Deliverables:

1. **Functionality**:
   - Implement methods to solve all three problems:
     - **Problem 1**: Check if there are duplicates in the array.
     - **Problem 2**: Check if two strings are anagrams.
     - **Problem 3**: Find how many times you can form the word "balloon".

2. **Optimization**:
   - For **Problem 1**, consider using **HashSet** or **HashMap** to optimize for time complexity.
   - For **Problem 2**, make sure to optimize the solution to handle the largest input sizes efficiently.
   - For **Problem 3**, think about how to track character counts for each letter in the word "balloon".
