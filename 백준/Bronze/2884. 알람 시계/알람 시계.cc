#include <stdio.h>

int main(int argc, const char * argv[]) {
    int H, M;
    
    scanf ("%d %d", &H, &M);
    
    if (M < 45) {
        if (H == 0) {
            H = 24;
        }
        H = H - 1;
        M = 15 + M;
    } else if ( M >= 45) {
        M = M - 45;
    }
    
    printf ("%d %d\n", H, M);
    
    return 0;
}
