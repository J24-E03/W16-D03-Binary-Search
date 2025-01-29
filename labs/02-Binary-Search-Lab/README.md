# Binary Search Lab

### Objective:
In this lab, you will implement a binary search algorithm to solve multiple problems. You will learn how to efficiently search for elements, find insertion positions, and solve problems that require identifying certain elements in an array with O(log n) time complexity.

---

### Problem 1: Search Insert Position

**Problem Statement:**
Given a sorted array of distinct integers and a target value, return the index of the target if it is found. If the target is not found, return the index where it would be if it were inserted in order.

You need to implement an algorithm with **O(log n)** runtime complexity using binary search.

**Example 1:**

```plaintext
Input: nums = [1,3,5,6], target = 5
Output: 2
```

**Example 2:**

```plaintext
Input: nums = [1,3,5,6], target = 2
Output: 1
```

**Example 3:**

```plaintext
Input: nums = [1,3,5,6], target = 7
Output: 4
```

---

### Problem 2: Find the Peak Element

**Problem Statement:**
Given an array of integers, where the elements are strictly increasing and then strictly decreasing (i.e., there is one peak), find the **peak element**. A peak element is an element that is greater than or equal to its neighbors.

You need to implement an algorithm with **O(log n)** runtime complexity using binary search.

**Example 1:**

```plaintext
Input: nums = [1, 3, 5, 6, 4, 2]
Output: 5
```

**Example 2:**

```plaintext
Input: nums = [1, 2, 3, 1]
Output: 3
```

**Example 3:**

```plaintext
Input: nums = [1, 2, 1, 3, 5, 6, 4]
Output: 2
```

**Approach:**
- Perform a binary search to find the peak element. 
- Compare the middle element with its neighbors:
  - If `nums[mid] > nums[mid + 1]`, then the peak is on the left side, so adjust the search space to the left half.
  - If `nums[mid] < nums[mid + 1]`, then the peak is on the right side, so adjust the search space to the right half.

---

### Approach for Both Problems:

For both problems, binary search will be used to find the desired element or position. The key idea is to modify the typical binary search logic to account for the specific needs of each problem.

1. **Search Insert Position:** Perform binary search to find the target. If the target is not found, the position to insert is where the left pointer ends up.
2. **Find Peak Element:** Perform binary search to locate the peak by comparing mid elements with their neighbors.

---

### Constraints:
- The input array is sorted and contains distinct integers for the search insert problem.
- The array for the peak element problem is strictly increasing then strictly decreasing.
- Both solutions must be implemented with O(log n) time complexity using binary search.

---

### Tasks:

1. Implement the `searchInsert` function to solve the "Search Insert Position" problem.
2. Implement the `findPeakElement` function to solve the "Find Peak Element" problem.
3. Test both functions with the provided examples.
4. Verify your solution with additional test cases.

---

### Additional Test Cases for Both Problems:

**Search Insert Position:**

1. **Test with a Single Element Array:**
   ```java
   nums = [5], target = 5
   Output: 0
   ```
   
   ```java
   nums = [5], target = 2
   Output: 0
   ```

2. **Test with Target Smaller than All Elements:**
   ```java
   nums = [10, 20, 30, 40], target = 5
   Output: 0
   ```

3. **Test with Target Larger than All Elements:**
   ```java
   nums = [10, 20, 30, 40], target = 50
   Output: 4
   ```

**Find Peak Element:**

1. **Test with a Simple Peak:**
   ```java
   nums = [1, 2, 3, 1]
   Output: 2
   ```

2. **Test with Multiple Peaks:**
   ```java
   nums = [1, 2, 1, 3, 5, 6, 4]
   Output: 2
   ```

3. **Test with Large Array:**
   ```java
   nums = [1, 3, 5, 7, 8, 6, 4]
   Output: 4
   ```

