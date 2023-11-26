class SortedInsert
{
    public static Node sortedInsert(Node head, int x)
    {
        Node newNode = new Node(x);
        if(head == null || x < head.data){
            newNode.next = head;
            if(head != null){
                head.prev = newNode;
            }
            return newNode;
        }
        Node current = head;
        
        while (current.next != null && current.next.data < x){
            current = current.next;
        }
        
        newNode.next = current.next;
        if(current.next != null){
            current.next.prev = newNode;
        }
        
        current.next = newNode;
        newNode.prev = current;
        
        return head;
    }
}