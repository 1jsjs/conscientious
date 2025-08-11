#include <iostream>

using namespace std;

int main () {
    int arr[9];
    int max = 0;
    int maxIndex = 0;
    int num = 0;

    for (int i = 0; i < 9; i++) {
        cin >> num;
        arr[i] = num;

        if (num > max) {
            max = num;
            maxIndex = i;
        }
    }
    
    cout << max << endl;
    cout << maxIndex + 1;

    return 0;
}