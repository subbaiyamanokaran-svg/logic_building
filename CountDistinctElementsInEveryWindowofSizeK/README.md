# Distinct Elements in Every Sliding Window

A Java-based solution to find the count of unique integers in every sliding window of size `k`. This implementation uses an optimized **Sliding Window** algorithm with a `HashMap` to achieve linear time complexity.

---

## 📖 Description

The problem involves an array of size `n` and a window of size `k`. The window slides from the start of the array to the end, one element at a time. For each window, the program identifies how many distinct (unique) numbers are present.



## 🛠️ Logic & Implementation

Instead of re-calculating the count for every window (which would be slow), this program uses a **Frequency Map** strategy:

1.  **Map Initialization**: Store the first `k` elements in a `HashMap` where the key is the number and the value is its frequency.
2.  **Slide Mechanism**:
    * **Remove Outgoing**: Decrease the count of the element leaving the window. If its count becomes `0`, remove the key entirely.
    * **Add Incoming**: Add the new element entering the window or increment its existing count.
3.  **Result**: At each step, the `map.size()` gives the total number of distinct elements.

---

## 📊 Performance

| Metric | Complexity |
| :--- | :--- |
| **Time Complexity** | $O(n)$ |
| **Space Complexity** | $O(k)$ |

---

## 🚀 How to Run

1.  **Save the file**: Ensure your file is named `Main.java`.
2.  **Compile**:
    ```bash
    javac Main.java
    ```
3.  **Execute**:
    ```bash
    java Main
    ```

### Example Input/Output

**Input:**
```text
1 2 1 3 4 2 3
Enter window size (k): 4