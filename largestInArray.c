/**
 * ALGORITHM findLargest(a,size)
 *  a: array of positive integers
 *  size: length of the array a
 * assume a[0] be largest
 * for i <- 1 to size-1 do
 *      check if a[i] > largest
 *          largest <- a[i]
 * return largest
 * the main() takes input of size of array, elements of array
 * and display the output message by calling findLargest(a,size) 
 */

#include<stdio.h>
int findLargest(int a[],int size) {
    int largest=a[0];
    for(int i=1;i<size;i++) {
        if(a[i]>largest)
            largest=a[i];
    }
    return largest;
}

int main() {
    printf("Enter the size of the array: ");
    int size;
    scanf("%d",&size);
    printf("Enter %d values in the array: ",size);
    int a[size];
    for(int i=0;i<size;i++)
        scanf("%d",&a[i]);
    printf("The largest element in the array: %d\n",findLargest(a,size));
}