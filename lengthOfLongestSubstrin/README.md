#  Longest Substring Without Repeating Characters

---
## 📝 Problem Statement

Given a string `s`, find the length of the **longest substring** without repeating characters.

* **Substring:** A **continuous** sequence of characters within a string.
* **Constraint:** No character can appear more than once in the window.

---

## 💡 Core Concept: The Sliding Window

To solve this efficiently in **$O(n)$** time, we use a **Sliding Window** approach with two pointers: `left` and `i` (right).



### How it works:
1.  **Expand:** The pointer `i` moves to the right, adding characters to our current window.
2.  **Validate:** We use a `HashSet` to store characters currently in the window.
3.  **Contract:** If we encounter a character already in the `HashSet`, we shrink the window from the `left` until that duplicate is removed.
4.  **Update:** At each step, we calculate the window size: `i - left + 1`.

###  Important

* Substring = **continuous**
* No duplicate characters allowed

---

##  Core Idea: Sliding Window

We maintain a dynamic window:

```
[left -------- i]
```

* ``i`` → expands the window
* `left` → shrinks the window when duplicates appear

We use a **HashSet** to track characters inside the window.

---

##  Step-by-Step Explanation

### 1️ Initialization

```java
int maxlength = 0;
Set<Character> set = new HashSet<>();
int left = 0;
```

* `maxlength` → stores best answer
* `set` → stores characters in current window
* `left` → start of window

---

### 2️ Traverse the string

```java
for (int i = 0; i < s.length(); i++)
```

* `i` represents the **end of the window**

---

### 3️ Remove duplicates (MOST IMPORTANT)

```java
while (set.contains(s.charAt(i))) {
    set.remove(s.charAt(left));
    left++;
}
```

####  Why?

* If character already exists → duplicate 
* So we shrink the window from the left

####  Why `while` and not `if`?

* One removal may NOT be enough
* We keep removing until window becomes valid

like is you put if it only remove once for example `abba`
it is is now 
1.a
2.ab
3.abb
when four the b inside will not be romoved instead the a only is removes then it becomes `bb` on the next iteration for that only we use while which removes every element untll it reaches next to b

---

### 4️ Add current character

```java
set.add(s.charAt(i));
```

* Now the window has no duplicates

---

### 5️ Update maximum length

```java
maxlength = Math.max(maxlength, i - left + 1);
```

* `i - left + 1` → current window size
* We store the maximum seen so far

---

##  Dry Run Example

### Input:

```
s = "abcabcbb"
```

### Steps:

```
Step 1: "a"       → max = 1
Step 2: "ab"      → max = 2
Step 3: "abc"     → max = 3 
Step 4: "bca"     → max = 3
Step 5: "cab"     → max = 3
Step 6: adjust... → max = 3
```

---

##  Key Concepts

###  Sliding Window Pattern

* Expand → `i++`
* Shrink → `left++`

---

###  HashSet Purpose

* Fast duplicate check → **O(1)**
* Avoids scanning substring

---

###  Important Formula

```
Window Size = i - left + 1
```

---

##  Complexity

| Type  | Value |
| ----- | ----- |
| Time  | O(n)  |
| Space | O(n)  |

---

##  One-Line Summary

> Expand window → remove duplicates → update max length

---

##  Final Understanding

This problem teaches:

* Sliding Window
* Two Pointer Technique
* Optimization from **O(n²) → O(n)**

---
