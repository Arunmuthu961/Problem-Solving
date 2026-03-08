class Solution:
    def divide(self, dividend: int, divisor: int) -> int:

        MAX_INT = 2147483647  
        MIN_INT = -2147483648 
        
        if dividend == MIN_INT and divisor == -1:
            return MAX_INT
        
        negative = (dividend < 0) != (divisor < 0)
        
        a, b = abs(dividend), abs(divisor)
        res = 0
        
        while a >= b:
            temp, multiple = b, 1
            while a >= (temp << 1):
                temp <<= 1
                multiple <<= 1
            
            a -= temp
            res += multiple
            
        return -res if negative else res
