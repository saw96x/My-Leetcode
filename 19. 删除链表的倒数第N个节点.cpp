struct ListNode
{
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

class Solution
{
public:
    ListNode *removeNthFromEnd(ListNode *head, int n)
    {
        ListNode *dummy = new ListNode(0);
        dummy->next = head;
        int len = 0;
        ListNode *fast = dummy, *slow = dummy;
        while (fast->next)
        {
            if (len < n)
            {
                fast = fast->next;
                len++;
            }
            else
            {
                fast = fast->next;
                slow = slow->next;
            }
        }
        slow->next = slow->next->next;
        return dummy->next;
    }
};