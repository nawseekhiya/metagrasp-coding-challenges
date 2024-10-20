/**
 * ALGORITHM bubbleSort(a[0..n-1])
 *  a[] : array of integers taken as input from user
 *          let n be size of array
 *          the index of array runs from 0 to n-1
 *  for i <- 0 to n-1 do
 *      for j <- 0 to n-1-i do
 *          if a[j] > a[j+1]
 *              swap a[j] with a[j+1]
 * the main() takes size of array and the array itself as inputs from user
 *  calls the bubbleSort() to arrange the array in ascending order using bubble sort technique
 *  display the arranged array with appropriate output message
 */


#include <stdio.h>
void bubbleSort(int a[], int len)
{
    for (int i = 0; i < len - 1; i++)
    {
        for (int j = 0; j < len - 1 - i; j++)
        {
            if (a[j] > a[j + 1])
            {
                int temp = a[j]; // temp var is used for swapping purpose
                a[j] = a[j + 1];
                a[j + 1] = temp;
            }
        }
    }
}

int main()
{
    int size;
    printf("Enter the no. of elements: ");
    scanf("%d", &size);
    int a[size];
    printf("Enter %d elements in the array: \n", size);
    for(int i=0; i<size; i++) {
        scanf("%d", &a[i]);
    }
    bubbleSort(a,size);
    printf("The sorted array in ascending order using Bubble Sort:\n");
    for (int i = 0; i < size; i++)
    {
        printf("%d\t",a[i]);
    }
    return 0;
}