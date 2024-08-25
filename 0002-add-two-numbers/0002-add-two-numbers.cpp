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

class Solution {
public:
    ListNode* addTwoNumbers(ListNode* l1, ListNode* l2) {
        ListNode* dummyHead = new ListNode(0); // Dummy node to simplify handling the head of the result list
        ListNode* curr = dummyHead; // Pointer to the current node in the result list
        int carry = 0; // Variable to store carry

        // Loop until both lists are fully traversed and there's no carry
        while (l1 != nullptr || l2 != nullptr || carry != 0) {
            int x = (l1 != nullptr) ? l1->val : 0; // Get the value from l1 or 0 if l1 is null
            int y = (l2 != nullptr) ? l2->val : 0; // Get the value from l2 or 0 if l2 is null
            int sum = x + y + carry; // Calculate the sum

            carry = sum / 10; // Update the carry for the next digit
            curr->next = new ListNode(sum % 10); // Create a new node with the digit part of the sum
            curr = curr->next; // Move to the next node

            // Move to the next nodes in l1 and l2
            if (l1 != nullptr) l1 = l1->next;
            if (l2 != nullptr) l2 = l2->next;
        }

        return dummyHead->next; // Return the head of the result list
    }
};