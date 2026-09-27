class Solution {
    public boolean isPalindrome(int x) {
        int digit=1,rev = 0,n=x;
        while(x>0)
        {
            digit = x % 10;
            rev = (rev * 10) + digit;
            x = x / 10;
        }

    if(n==rev)
    return true;
    else
    return false;
    }
}