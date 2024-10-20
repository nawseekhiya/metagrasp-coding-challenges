/**
 * ALGORITHM sumOfEvenNumbers(n)
 *  n: a positive array of integers taken as input from user
 *      finds even integers in the array
 *      calculates the sum of those integers
 *  let len be length of array n
 * for i<-0 to len-1 do
 *      if n[i] % 2 = 0
 *          sum+=n[i]
 * return sum
 */

int sumOfEvenNumbers(int n[], int len) {
    int sum=0;
    for(int i=0;i<len-1;i++){
        if(n[i]%2==0)
            sum=sum+n[i];
    }
    return sum;
}