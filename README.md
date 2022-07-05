# LeetCodeProblems

Leetcode Interview Codecs Using Java

## 1. Two Sum

* Approach 3: One-pass Hash Table
  Algorithm

It turns out we can do it in one-pass. While we are iterating and inserting elements into the hash table, we also look
back to check if current element's complement already exists in the hash table. If it exists, we have found a solution
and return the indices immediately.
* Implementation
* Complexity Analysis

Time complexity: O(n)O(n). We traverse the list containing nn elements only once. Each lookup in the table costs only O(
1)O(1) time.

Space complexity: O(n)O(n). The extra space required depends on the number of items stored in the hash table, which
  stores at most nn elements.