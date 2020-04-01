# BinarySearch
  - a function will take a sorted array of integers as well as a target integer.
  - the function should use the BinarySearch algorithm to determine if the target integer is contained in the array and should return its index if it is
  - otherwise return -1
  - input array = [0,1,2,3,4,6] target 2
  - output : 2.
# Solution 1
  - go to midpoint of array compare with the target
  - if the target is greater than the mid value, move to the right mid
  - else move to the left mid,
  - equal reture mid index.
  - time complexity : O(LogN)
  - space: O(logN)
# Solution 2
  - using pointer to start as most start and ending node
  - using loop to iterate the midpoint, because it is sorted array, so
  - if there is a smaller than target, move the left pointer to right mid
  - if there is a larger than target, move the right pointer to left mid
  - util left <= right is wrong 
