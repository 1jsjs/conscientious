num1, num2 = map (int,input().split())

nums = list(map(int, input().split()))

for i in nums:
    if i < num2:
        print (i, end=' ')