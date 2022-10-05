Arrays solving techniques-
Sliding Window --> Two pointers [ static + variable ]

Sliding window --> Idea/Intuition
- Window of two pointers, left and right
- Keep increasing right pointer
- If element at right pointer violates condition, keep the left pointer moving, to shrink the window until it becomes valid again
- Update global min/max with the result from valid window
- Check if it is valid, we need to store the **"state"** of the window (eg., frequency of letters, number of distinct integers)

```
for(right = 0; right < n; right++):
    update window with element at right pointer
    while (condition not valid):
        remove element at left pointer from window, move left pointer to the right
    update global max

```

Window of 2 pointers

Keywords to identify problem:- (Longest/Shortest number of) (Substring/Subarrays) with atmost/exactly K elements that fit, with [some condition], have a common pattern. Usually always O(n)
Questions

    3. Longest Substring Without Repeating Characters
    340. Longest Substring with At Most K Distinct Characters
    76. Minimum Window Substring
    1004. Max Consecutive Ones III
    904. Fruit Into Baskets
    424. Longest Repeating Character Replacement
    930. Binary Subarrays with Sum
    992. Subarrays with K Different Integers
    1248. Count Number of Nice Subarrays
    1358. Number of Substrings Containing All Three Characters

Not sliding window/not this pattern

    Subarray Sum Equals K
    Longest Subarray with Absolute Difference <= Limit
    Longest Palindromic Substring
