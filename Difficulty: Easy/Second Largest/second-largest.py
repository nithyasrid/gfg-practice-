class Solution:
    def getSecondLargest(self, arr):
        # code here
        
        largest = -1
        sec = -1
        for num in arr:
            if num >largest:
                second = largest
                largest = num 
                
            elif num != largest and num > second:
                second = num 
        return second         