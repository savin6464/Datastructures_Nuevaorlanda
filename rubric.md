# Project Assessment Rubric

**Project:** Data Structures Interactive Demo
**Section:** C2A
**Course:** Data Structures

## Grading Breakdown

### 1. Data Structure Completeness & Implementation (50%)

**Score:** 15/50

| Data Structure | Implementation      | Functions                           | Notes                                     |
| -------------- | ------------------- | ----------------------------------- | ----------------------------------------- |
| ArrayList      | **Java Built-in**   | add, get, insert                    | Demo only - no user input for operations  |
| LinkedList     | **Java Built-in**   | addFirst, addLast, removeFirst, get | Demo only                                 |
| Stack          | **Java Built-in**   | push, pop, peek                     | Demo only                                 |
| Queue          | **Java Built-in**   | offer, poll, peek                   | Demo only                                 |
| Tree (BST)     | **Custom TreeNode** | insert                              | Only insert function, no search/traversal |

**Major Deductions:**

- -15: Uses Java built-in ArrayList, LinkedList, Stack, Queue
- -10: Missing required functions (add at start/end/index for ArrayList, search, sort, clear)
- -5: Demo-style program with hardcoded values, not interactive
- -5: Tree has only insert, no search or traversal functions

**What's Missing:**

- No user-driven add at end/start/index for ArrayList and LinkedList
- No search function (manual, not using built-in)
- No sort function (manual, not using built-in)
- No clear function
- No list all/display function with user interaction
- Tree missing search and traversal (in-order, pre-order, post-order)

### 2. Visualization (30%)

**Score:** 15/30

- Shows contents after preset operations
- Good explanation of time complexity (O(1), O(N), O(log N))
- -15: Visualization is for demo purposes only, not after user operations

### 3. Short Paper (20%)

**Score:** 0/20

- **No short paper submitted**
- README.txt.txt file exists but is empty

---

## Final Grade: **30/100**

### Summary

This submission is a demonstration program that shows how data structures work using hardcoded examples, but does not meet the requirements for an interactive implementation. The project uses Java's built-in classes instead of custom implementations, lacks required functions (search, sort, clear, list all), and has no reflection paper. The BST is partially custom but only implements insert.

### Recommendations

- Convert to interactive program with user input for all operations
- Implement custom ArrayList, LinkedList, Stack, Queue classes
- Add search (manual), sort (manual), clear, and list all functions
- Implement BST search and all three traversal methods
- Submit a reflection paper on the implementation experience

---

_Assessment generated on November 29, 2025_
