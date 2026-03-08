import heapq

class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        heap = []
        
        # 1. Put the head of each list into the min-heap
        for i, head in enumerate(lists):
            if head:
                # Store (value, list_index, node) 
                # list_index acts as a tie-breaker for identical values
                heapq.heappush(heap, (head.val, i, head))
        
        dummy = ListNode(0)
        curr = dummy
        
        # 2. Extract the smallest and push its successor
        while heap:
            val, i, node = heapq.heappop(heap)
            curr.next = node
            curr = curr.next
            
            if node.next:
                heapq.heappush(heap, (node.next.val, i, node.next))
                
        return dummy.next
