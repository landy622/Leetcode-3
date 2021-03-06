/* Method 1: The typical loop solution */
public class Solution {
    public boolean isPowerOfFour(int num) {
        if(num == 0) return false;
        while(num % 4 == 0){
            num /= 4;
        }

        return num == 1;
    }
}

/* Method 2: without loop, using regular expression */
public class Solution {
    public boolean isPowerOfFour(int num) {
        return Integer.toBinaryString(num).matches("1(00)*");
    }
}
