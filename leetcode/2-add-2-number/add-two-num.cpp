//
// Created by amuzt on 8/19/2023.
//
/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode() : val(0), next(nullptr) {}
 *     ListNode(int x) : val(x), next(nullptr) {}
 *     ListNode(int x, ListNode *next) : val(x), next(next) {}
 * };
 */
#include <iostream>
using namespace std;
struct ListNode {
     int val;
     ListNode *next;
     ListNode() : val(0), next(nullptr) {}
     ListNode(int x) : val(x), next(nullptr) {}
     ListNode(int x, ListNode *next) : val(x), next(next) {}
};
class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummy = new ListNode(); // Dummy node to start the result list
        ListNode* current = dummy; // Pointer to traverse the result list
        int carry = 0;

        while (l1 || l2 || carry) {
            int sum = carry;
            if (l1) {
                sum += l1->val;
                l1 = l1->next;
            }
            if (l2) {
                sum += l2->val;
                l2 = l2->next;
            }

            carry = sum / 10;
            sum = sum % 10;

            current->next = new ListNode(sum); // Create a new node with the sum digit
            current = current->next; // Move to the next node
        }

        ListNode* result = dummy->next; // Store the actual result (skip the dummy node)
        delete dummy; // Delete the dummy node

        return result; // Return the result list
    }
};

// Test cases
int main() {
    // Test case 1
    ListNode* l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
    ListNode* l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
    Solution solution;
    ListNode* result1 = solution.addTwoNumbers(l1, l2);
    while (result1) {
        cout << result1->val << " ";
        result1 = result1->next;
    }
    cout << endl;

    // Test case 2
    ListNode* l3 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9)))))));
    ListNode* l4 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));
    ListNode* result2 = solution.addTwoNumbers(l3, l4);
    while (result2) {
        cout << result2->val << " ";
        result2 = result2->next;
    }
    cout << endl;

    return 0;
}
