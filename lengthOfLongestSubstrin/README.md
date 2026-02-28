Problem Summary
Given a string s,
find the length of the longest substring without repeating characters

Important:

Substring = continuous

No duplicate characters allowed

Core Idea (Sliding Window)

We maintain a window:

[left -------- right]

right → expands the window

left → shrinks the window when needed

We also use a HashSet to track characters in the current window.

Line-by-Line Explanation

1️ Initialization
int maxlength = 0;
Set<Character> set = new HashSet<>();
int left = 0;

maxlength → stores best answer

set → stores current window characters

left → start of window

2️ Loop through string
for (int right = 0; right < s.length(); right++)

 right is the end of window

3️ Remove duplicates (MOST IMPORTANT)
while (set.contains(s.charAt(right))) {
    set.remove(s.charAt(left));
    left++;
}
Why?

If current char already exists → duplicate 

So we shrink window from left

Why while?

Because:

One removal may not be enough

We remove until window becomes valid 

4️ Add current character
set.add(s.charAt(right));

Now window is valid, so add new char

5️ Update max length
maxlength = Math.max(maxlength, right - left + 1);

 right - left + 1 = current window size

We store the maximum seen so far.

Full Dry Run: "abcabcbb"
Step 1:
Window: "a"
max = 1
Step 2:
Window: "ab"
max = 2
Step 3:
Window: "abc"
max = 3 
Step 4 (duplicate 'a'):
Remove 'a'
Window: "bca"
max = 3
Step 5:
Window: "cab"
max = 3
Step 6:
Window adjusts...
Final max = 3
Key Concepts to Remember
Sliding Window Pattern

Expand → right++

Shrink → left++
HashSet Purpose

Fast duplicate check → O(1)

Avoids scanning substring

Why while not if

Duplicate may require multiple removals

while ensures window becomes valid

 Formula
window size = right - left + 1
⏱ Complexity
Type	Value
Time	O(n)
Space	O(n)


 One-Line Summary


Expand window → remove duplicates → update max length

 Final Understanding

This problem teaches:

Sliding Window

Two Pointer technique

Optimizing brute force O(n²) → O(n)
