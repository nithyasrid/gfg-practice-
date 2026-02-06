class Solution:
    def isPrime(self, n: int) -> bool:
        # 0 and 1 are not prime
        if n <= 1:
            return False
        
        # 2 and 3 are prime
        if n <= 3:
            return True
        
        # eliminate multiples of 2 and 3 early
        if n % 2 == 0 or n % 3 == 0:
            return False
        
        # check divisors of form 6k ± 1 up to sqrt(n)
        i = 5
        while i * i <= n:
            if n % i == 0 or n % (i + 2) == 0:
                return False
            i += 6
        
        return True
