#include<stdio.h>
#include<unistd.h>
#include<string.h>
#define fun(i, j) i##j

void main(){
    int a = 4, b=3;
    float c=11;
    c=c*b/a;
    printf("fun(1,1)= %d", fun(1,9));
}
