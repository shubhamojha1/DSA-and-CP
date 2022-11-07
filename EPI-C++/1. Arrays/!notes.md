C++ libraries
1. array v/s vector
   - array<int, 5> a = {1,2,3}; --> allocates 5 spaces for integers (4 bytes for each), filled as per choice, unfilled remain 0
   - vector<int> a = {1,2,3}; --> dynamically resizable
    												  --> push_back(x) & emplace_back(x) for adding elements to the end https://www.geeksforgeeks.org/push_back-vs-emplace_back-in-cpp-stl-vectors/
													  	--> emplace_back is basically faster, understand why.
	 - deep copy v/s shallow copy 
