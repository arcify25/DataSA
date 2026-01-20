#include <iostream>
#include <vector>
using namespace std;

int waveForm(vector<int> &arr)
{
    int n = arr.size();
    for (int i = 0; i < n - 1; i += 2)
    {
        swap(arr[i], arr[i + 1]);
    }
}

int main()
{
    vector<int> arr = {1, 2, 3, 4, 5};
    waveForm(arr);
    for (int num : arr)
    {
        cout << num << " ";
    }
    return 0;
}