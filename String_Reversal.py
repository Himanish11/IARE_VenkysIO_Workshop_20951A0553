import time
start=time.time()
s=input()
s=list(s)
l=[]
for i in range(len(s)):
    l.append(s[i])
for i in range(len(s)):
    s[i]=l.pop()
s=''.join(s)
print(s)
end=time.time()
print(end-start)