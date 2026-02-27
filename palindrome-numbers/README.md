# 🔢 Palindrome Number

A **Palindrome Number** is a number that reads the same forward and backward.

---

## 📌 Examples

| Number | Reversed | Result             |
| ------ | -------- | ------------------ |
| 121    | 121      | ✅ Palindrome       |
| 1331   | 1331     | ✅ Palindrome       |
| 123    | 321      | ❌ Not a Palindrome |

---

## 🧠 Concept

To check if a number is a palindrome:

1. Reverse the given number.
2. Compare it with the original number.
3. If both are equal → it is a palindrome.


---

## ⚡ Optimized Approach (Without Full Reverse)

```java
class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 || (x % 10 == 0 && x != 0)) return false;

        int reversedHalf = 0;

        while (x > reversedHalf) {
            reversedHalf = reversedHalf * 10 + x % 10;
            x /= 10;
        }

        return x == reversedHalf || x == reversedHalf / 10;
    }
}
```

---

## 🚀 Complexity

* **Time Complexity:** O(log n)
* **Space Complexity:** O(1)

---

## ⚠️ Edge Cases

* Negative numbers → ❌ Not palindrome
* Numbers ending with 0 (except 0) → ❌ Not palindrome
* Single digit numbers → ✅ Always palindrome


---

## 📚 Summary

A palindrome number stays the same when reversed.
Efficient solutions avoid reversing the entire number and instead compare half of it.

---
