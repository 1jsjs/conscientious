#include <iostream>

int main() {
    int T;
    std::cin >> T; // 테스트 케이스의 개수를 입력 받음

    for (int i = 0; i < T; ++i) {
        int a, b;
        std::cin >> a >> b;
        std::cout << a + b << '\n';
    }

    return 0;
}