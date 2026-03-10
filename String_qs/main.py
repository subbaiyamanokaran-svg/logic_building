s=input().split()
n=int(input())
res=""

if n==0:
    for ch in s:
        ch=ch[::-1]
        res+=ch
        res+=" "
if n==1:
    for ch in s:
        if "," in ch:
            ch=ch[::-1]
            res += ch
            res+=" "
        else:
            ch=ch[::-1]
            ch.lower()
            ch.capitalize()
            res+=ch
            res+=" "
            
print(res)