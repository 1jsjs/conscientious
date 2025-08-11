#include <iostream>

int main() {
    int first = 1000;
    
    int second;

    std::cin >> second;

    int sum = first - second;

    int C1= sum / 500;
    sum = sum % 500;

    int C2 = sum / 100;
    sum = sum % 100;

    int C3 = sum / 50;
    sum = sum % 50;

    int C4 = sum / 10;
    sum = sum % 10;

    int C5 = sum / 5;
    sum = sum % 5;

    int C6 = sum;

    std::cout << C1+C2+C3+C4+C5+C6 << std::endl;

    return 0;
}