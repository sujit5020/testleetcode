/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     ListNode *next;
 *     ListNode(int x) : val(x), next(NULL) {}
 * };
 */
class Solution {
public:
    void deleteNode(ListNode* node) {
        // Copy the value from the next node to the current node
        node->val = node->next->val;
        // Save the next node to be deleted
        ListNode* temp = node->next;
        // Skip the next node
        node->next = node->next->next;
        // Delete the next node
        delete temp;
    }
};
