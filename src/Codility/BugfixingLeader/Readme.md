
Task description

A non-empty zero-indexed array A consisting of N integers is given. The leader of this array is the value that occurs in more than half of the elements of A.

You are given an implementation of a function:

solution(A [])

that, given a non-empty zero-indexed array A consisting of N integers, returns the leader of array A. The function should return −1 if array A does not contain a leader.

For example, given array A consisting of ten elements such that:

  A[0] = 4
  A[1] = 2
  A[2] = 2
  A[3] = 3
  A[4] = 2
  A[5] = 4
  A[6] = 2
  A[7] = 2
  A[8] = 6
  A[9] = 4
the function should return −1, because the value that occurs most frequently in the array, 2, occurs five times, and 5 is not more than half of 10.

Given array A consisting of five elements such that:

  A[0] = 1
  A[1] = 1
  A[2] = 1
  A[3] = 50
  A[4] = 1
the function should return 1.

Assume that:

N is an integer within the range [1..1,000,000];
each element of array A is an integer within the range [0..2147483647].
Complexity:

expected worst-case time complexity is O(N*log(N));
expected worst-case space complexity is O(N), beyond input storage (not counting the storage required for input arguments).
Elements of input arrays can be modified.