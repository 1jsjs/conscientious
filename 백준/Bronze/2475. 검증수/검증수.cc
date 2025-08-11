#include <stdio.h>

int main(int argc, const char * argv[]) {
    int arr[5];
    int sum = 0;
    int rest = 0;
    
    for (int i=0; i<5; i++) {
        scanf ("%d", &arr[i]);
        }
    
    for (int j=0; j<5; j++) {
        sum += arr[j]*arr[j];
    }
    
    rest = sum%10;

    printf ("%d\n", rest);
    
    return 0;
}
