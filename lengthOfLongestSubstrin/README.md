#  Longest Substring Without Repeating Characters

---

##  Problem Summary

Given a string `s`, find the length of the **longest substring without repeating characters**.

###  Important

* Substring = **continuous**
* No duplicate characters allowed

---

##  Core Idea: Sliding Window

We maintain a dynamic window:

```
[left -------- right]
```

* ```right``` → expands the window
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
for (int right = 0; right < s.length(); right++)
```

* `right` represents the **end of the window**

---

### 3️ Remove duplicates (MOST IMPORTANT)

```java
while (set.contains(s.charAt(right))) {
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

---

### 4️ Add current character

```java
set.add(s.charAt(right));
```

* Now the window has no duplicates

---

### 5️ Update maximum length

```java
maxlength = Math.max(maxlength, right - left + 1);
```

* `right - left + 1` → current window size
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

### 🔹 Sliding Window Pattern

* Expand → `right++`
* Shrink → `left++`

---

### 🔹 HashSet Purpose

* Fast duplicate check → **O(1)**
* Avoids scanning substring

---

### 🔹 Important Formula

```
Window Size = right - left + 1
```

---

## ⏱ Complexity

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
