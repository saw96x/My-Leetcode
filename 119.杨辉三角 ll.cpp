#include <vector>
using namespace std;
class Solution
{
public:
    vector<int> getRow(int rowIndex)
    {
        vector<vector<int>> ans;
        for (int i = 0; i <= rowIndex; i++)
        {
            vector<int> line(i + 1, 1);
            for (int j = 1; j < i; j++)
                line[j] = ans[i - 1][j] + ans[i - 1][j - 1];
            ans.push_back(line);
        }
        return ans[rowIndex];
    }
};