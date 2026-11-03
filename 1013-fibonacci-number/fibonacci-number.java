class Solution {
    public int fib(int n) {
        int a = 0;
        int b = 1;
        int c = 0;
        int count = 0;

        while(count < n){
            c = a + b;
            a = b;
            b = c;
        count++;
        }
        return a;
    }
}