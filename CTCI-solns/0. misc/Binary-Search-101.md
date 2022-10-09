Problems faced-
1. Infinite loop
2. Where/When to shrink search space\
3. Use low or high, where and how
4. When to exit loop

Fundamental idea-
1. low & high
   - Store array indices, that work like a boundary/window, such that we will only be looking at elements inside the window
   - initialize window as entire array, almost always
      ```
      int low = 0, high = a.length-1;
      ```
2. mid
    - middle element, separates boundary into 2 parts, left and right.
    - decides which half of the search window is to be discarded, and which will we continue our search with
    - When array has even elements, mid can be lower (left) or higher (right) element
    ```
    int mid = low+(high-low)/2; --> left/lower mid
    int mid = low+(high-low+1)/2; --> right/upper mid
    ```
3. comparing target element with mid
    - comparison allows us to determine where the target could be present.
    - if greater than mid, target will be to the right
    - if lesser, target will be to the left
    - in either case, there is no need to keep record of the elements in the other window, so they are discarded
    - this works well because the array is sorted
    - keep shrinking the window, until target element is found
    ``` 
    if(nums[mid]<target)
    l = mid+1;
    else 
    r = mid-1; 
    ```
4. Keep loop going
    - use while loop as number of iterations generally not known
    - condition:- 
    ``` 
    while (low < high) { ... }
    ```
    - loop exits only when low==high, i.e. when there is only one element left


TBC
