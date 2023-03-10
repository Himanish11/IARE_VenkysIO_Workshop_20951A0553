
import heapq

def heap_sort(arr):
    heap = []
    ans = []
    for i in arr:
        heapq.heappush(heap, i)
    while heap:
        ans.append(heapq.heappop(heap))
    return ans
arr = [int(i) for i in input().split()]
print(heap_sort(arr))