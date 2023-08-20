//
// Created by amuzt on 8/19/2023.
//
#include <iostream>
#include <vector>
#include <string>
using namespace std;

class Solution {
public:
    int lengthOfLongestSubstring(string s) {
        int n = s.length();
        int maxLength = 0;
        vector<int> charIndex(256, -1); // Store the last index of each character

        int left = 0; // Pointer to the start of the current substring

        for (int right = 0; right < n; ++right) {
            // If the character is seen before in the current substring
            // Move the left pointer to the next position after the last occurrence of the character
            if (charIndex[s[right]] != -1) {
                left = max(left, charIndex[s[right]] + 1);
            }

            // Update the last index of the character
            charIndex[s[right]] = right;

            // Calculate the current substring length
            int currentLength = right - left + 1;
            maxLength = max(maxLength, currentLength);
        }

        return maxLength;
    }
};

int main() {
    Solution solution;

    // Test cases
    cout << solution.lengthOfLongestSubstring("abcabcbb") << endl; // Expected: 3
    cout << solution.lengthOfLongestSubstring("bbbbb") << endl;    // Expected: 1
    cout << solution.lengthOfLongestSubstring("pwwkew") << endl;   // Expected: 3

    return 0;
}
