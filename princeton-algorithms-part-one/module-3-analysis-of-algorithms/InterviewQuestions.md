## Analysis Of Algorithms

1. 3 Sum in quadratic time
   - Design an algorithm for the 3 sum problem that takes time proportional to `n^2` in the worst case. You may assume that you can sort the n integers in time proportional to `n^2` or better.
   - First of all we need to sort the array using any fast sorting algorithm like quick sort or merge sort. We could also use any other traditional sorting algorithm for the sake of simplicity.
   - Next we interate through the array elements one by one. Every time we take into account two pointers i and j such that i is the index just after the selected element and j is the last index.
   - Now we try to find out a triplet that satisfy our condition. If the sum is greater than 0 than decrement j. If the sum is less than 0 the increment i. Otherwise we would increase the triplet count.

2. Search in a bitonic array
   - We can break the problem of searching into two steps.
   - Find the peak element in the bitonic array using binary search.
   - Perform binary search on the increasing subarray (left to the peak) and the decreasing subarray (right of the peak)
   - We can optimize the algorithm by combining the two operations into single pass.
   
3. Egg drop
   - Version 0: Drop the egg from 1st floor and move up one floor at a time.
   - Version 1: Perform binary search on the floors of the building.
   - Version 2: Perform binary search with exponential increments.
   - Version 3: Use k√n.
   - Version 4: use kc.