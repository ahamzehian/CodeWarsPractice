# CodeWarsPractice
The solution here is an attampt to solve snail move on an ixj array. Consider following example:
input
  int[][] arr = {{1,2,3},
                 {4,5,6},
                 {7,8,9}};
                 
like a spiral movement from arr[0][0] through all outer lines to inner elements.
output
  1  2  3   then   6  9   then   8  7   then   4   then   5
  or
  1 2 3 6 9 8 7 4 5

This solution will return the output as an array and the input does not need to be a square.
