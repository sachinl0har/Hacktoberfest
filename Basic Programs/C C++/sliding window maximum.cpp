/* Problem link - https://leetcode.com/problems/sliding-window-maximum/ 
You are given an array of integers nums, there is a sliding window of size k which is moving from the very left of the array to the very right. You can only see the k numbers in the window. Each time the sliding window moves right by one position.

Return the max sliding window.

 
Example 1:

Input: nums = [1,3,-1,-3,5,3,6,7], k = 3
Output: [3,3,5,5,6,7]
Explanation: 
Window position                Max
---------------               -----
[1  3  -1] -3  5  3  6  7       3
 1 [3  -1  -3] 5  3  6  7       3
 1  3 [-1  -3  5] 3  6  7       5
 1  3  -1 [-3  5  3] 6  7       5
 1  3  -1  -3 [5  3  6] 7       6
 1  3  -1  -3  5 [3  6  7]      7

Time Complexity - O(n)
Space Complexity - O(k)

*/

/* Algorithm :
1. Create a list to store k elements.
2. Run a loop from start(j = 0) to end of the array.
2. Insert the elements in the list. Before inserting the element, check if the element at the back of the list is 
   smaller than the current element , if it is so remove the element from the back of the list, until all elements 
   left in the list are greater than the current element. Then insert the current element, at the back of the list.
3. Increment the start(j) pointer till it reaches to window size
4. When the start pointer hits window size, push the front element of list into the ans vector.
5. Remove the element from the front of the list if they are out of the current window.
6. slide the window.
7. return ans vector.

*/
class Solution {
public:
    vector<int> maxSlidingWindow(vector<int>& a, int k) {
        int n = a.size();
        vector<int> v;
        list<int> l;
        int i=0,j=0;
        //sliding window
        while(j<n){
            while(!l.empty() && l.back() < a[j]){
			    l.pop_back();
		    }
            l.push_back(a[j]);
            //increment j'th pointer till it hits sliding window size.
            if(j-i+1 < k){
                j++;
            }else if(j-i+1 == k){
                v.push_back(l.front());
                if(l.front() == a[i]){
                    l.pop_front();
                }
                i++;
                j++;
            }
        }
        return v;
    }
};




