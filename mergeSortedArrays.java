/**
 * ALGORITHM mergeSortArrays(a1,a2)
 * a1: array of integers taken as user input
 * a2: array of integers taken as user input
 * the function will merge two sorted arrays
 * therefore the user must input two sorted arrays
 * let len1 be length of a1, len2 be length of a2
 * mergedArray <- new int[len1+len2]
 * i,j,k <- 0
 * while i<len1 && j<len2 do
 * if a1[i] <= a2[j]
 * mergedArray[k++] <- a1[i++]
 * otherwise mergedArray[k++] <- a2[j++]
 * now, copy remaining elements from a1 if there's any
 * and copy remaining elements from a2 if there's any
 * return mergedArray
 */

class mergeSortedArrays {
    public int mergeSortArrays(int a1[],int a2[]) {
        int len1=a1.length;
        int len2=a2.length;
        int mergedArray[]=new int[len1+len2];
        i,j,k=0;
        while (i<len1 && j<len2)
        {
            if (a1[i] <= a2[j])
                mergedArray[k++] = a1[i++];
            else
                mergedArray[k++] = a2[j++];
        }

        // this copies the remaining elements from a1 and a2 respectively if there is any
        while (i < len1) {
            mergedArray[k++] = a1[i++];
        }
        while (i < len2) {
            mergedArray[k++] = a2[i++];
        }
    }
}