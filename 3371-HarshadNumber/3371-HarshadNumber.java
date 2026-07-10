// Last updated: 7/10/2026, 9:29:47 AM
class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0, n = x;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        if (x % sum == 0) {
            return sum;
        }
        return -1;
    }
}