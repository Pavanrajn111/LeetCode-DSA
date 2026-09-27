class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        int value = 0;
        for(int i = 0;i<s.length();i++)
        {
        switch(s.charAt(i))
        {
            case 'I': value = 1;
            break;
            case 'V': value = 5;
            break;
            case 'X': value = 10;
            break;
            case 'L': value = 50;
            break;
            case 'C': value = 100;
            break;
            case 'D': value = 500;
            break;
            case 'M': value = 1000;
            break;
        }
        if(i+1 < s.length())
        {
            int next = 0;
            switch(s.charAt(i+1))
        {
            case 'I': next = 1;
            break;
            case 'V': next = 5;
            break;
            case 'X': next = 10;
            break;
            case 'L': next = 50;
            break;
            case 'C': next = 100;
            break;
            case 'D': next = 500;
            break;
            case 'M': next = 1000;
            break;
        }
        if(value < next)
        {
            sum -= value;
        }
        else
        {
            sum += value;
        }
        }
    else{
        sum += value;
        }
    }
        return sum;
    }
}