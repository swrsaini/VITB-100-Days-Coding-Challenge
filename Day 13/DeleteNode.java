class Deletenode
{
    Node deleteNode(Node head, int x)
    {
	if (head == null || x<=0){
	    return head;
	}
	
	if (x == 1){
	    return head.next;
	}
	
	Node current = head;
	
	for(int i = 1; i<x-1 && current.next != null; i++){
	    current = current.next;
	}
	
	if(current == null || current.next == null){
	    return head;
	}
	
	current.next = current.next.next;
	return head;
    }
}