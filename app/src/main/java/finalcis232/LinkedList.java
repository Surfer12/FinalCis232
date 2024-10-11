package finalcis232;

class LinkedList {
    Node head;

    // ... other methods ...

    public void modifyList() {
        if (head == null || head.next == null) {
            return; // Checks for head of linked list, whether it or the next element is null,
                    // indicating it has reached either the head or the node previous of the linked
                    // list
        }

        Node prev = null; // sets previous node to null
        Node current = head; // current node to head
        Node next = null; // sets the next node to null

        while (current != null) {
            next = current.next; // sets next node as next while the current node is not the second to last or
                                 // last.
            current.next = prev; // sets the ahead node as the previous node,
            prev = current; // previous node becomes the current head node
            current = next; // current node becomes the next.
        }

        head = prev; // reverse traverse
    }
}

//