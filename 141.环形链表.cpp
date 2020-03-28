struct ListNode
{
    int val;
    ListNode *next;
    ListNode(int x) : val(x), next(nullptr) {}
};

class Solution
{
public:
    bool hasCycle(ListNode *head)
    {
        ListNode *dummy = new ListNode(0);
        dummy->next = head;
        ListNode *fast = dummy, *slow = dummy;
        while (fast->next != nullptr)
        {
            if (fast->next->next == nullptr)
                break;
            else
                fast = fast->next->next;
            if (slow->next == nullptr)
                break;
            else
                slow = slow->next;
            if (slow == fast)
                return true;
        }
        return false;
    }
};