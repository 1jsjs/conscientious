#include <iostream>

    //쿼터(Quarter, $0.25)의 개수, 다임(Dime, $0.10)의 개수, 니켈(Nickel, $0.05)의 개수, 
    //페니(Penny, $0.01)의 개수를 구하는 프로그램을 작성하시오.

int main() {
    int T;
    std::cin >> T;

    while (T--) {
        int C;
        std::cin >> C;

        int Q = C / 25;
        C = C % 25;
        int D = C / 10;
        C = C % 10;
        int N = C / 5;
        C = C % 5;
        
        int P = C;

        std::cout << Q <<" "<< D <<" "<< N <<" "<< P <<" "<<std::endl;

    }

    return 0;
}