/*
1. Find Minimum in rotated sorted array II
Problem link - https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/ 
*/

/*
Algorithm: 
1. We initialize our start and end pointers and loop until start<=end 
   inside our while loop and calculate mid pointer with precautionary overflow handling.
2. Now we have 3 cases :
	-> If mid element is smaller than end element, we search on the right of array.
	-> If mid element is greater than end element, we search on the left of array.
	-> else we decrement end pointer.
3. return minimum element . 
*/

/*
Time Complexity - O(log(n))
*/

class Solution {
public:
    int findMin(vector<int>& a) {
        int end = a.size()-1, start = 0, mid;
        while (start <= end) {
            mid = start+ (end - start) / 2;
            if (a[mid] > a[end]){
            	start = mid + 1;
            }else if(a[mid] < a[end]){
            	 end = mid;
            }else{
            	end--;
            } 
        }
        return a[start];
    }
};
