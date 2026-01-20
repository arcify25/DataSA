#include <iostream>
#include <vector>
using namespace std;

int pushZerosToEnd(vector<int> &arr)
{
    int len = arr.size();

    int count = 0;

    for (int i = 0; i < len; i++)
    {
        if (arr[i] != 0)
        {
            swap(arr[i], arr[count]);
            count++;
        }
    }
}

int main()
{
    vector<int> arr = {0, 1, 0, 3, 12, 0, 5, 0, 7};
    pushZerosToEnd(arr);
    for (int num : arr)
    {
        cout << num << " ";
    }
    return 0;
}