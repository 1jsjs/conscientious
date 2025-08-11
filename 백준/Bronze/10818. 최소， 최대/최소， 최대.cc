#include <iostream>

int main() {
    int n;
    std::cin >> n;

    int min, max;
    std::cin >> min;
    max = min;

    for (int i = 1; i < n; i++) {
        int num;
        std::cin >> num;

        if (num < min) {
            min = num;
        }

        if (num > max) {
            max = num;
        }
    }

    std::cout << min << " " << max << std::endl;

    return 0;
}