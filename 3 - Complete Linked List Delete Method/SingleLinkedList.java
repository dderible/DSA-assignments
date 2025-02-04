//Deleting a Node from the linked list
//0. if the link doesn't
//1. delete at the begining
//2. delete at the ending
//3. delete anywhere

public class SingleLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createdLinkedList (int nodeValue) {
        Node node = new Node();
        node.next = null;
        node.value = nodeValue;
        head = node;
        tail = node;
        size = 1;
        return head;
    }

    public void insertInLinkedList (int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;
        if (head == null) {
            createdLinkedList(nodeValue);
            return;

        } else if (location == 0) {
            node.next = head;
            head = node;

        } else if (location >= size) {
            tail.next = node;
            node.next = null;
            tail = node;

        } else {
            Node tempNode = head;
            int index = 0;
            while (index < location - 1) {
                tempNode = tempNode.next;
                index++;
            }
            Node nextNode = node;
            node.next = nextNode;
        }
        size++;
    }

    public void traverseLinkedList () {
        if (head == null) {
            System.out.println("ERROR: List does not exist.");

        } else {
            Node temNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(temNode.value);
                if(i != size -1) {
                    System.out.print(" -> ");
                }
                temNode = temNode.next;
            }
            System.out.print("\n");
        }
    }

    public boolean searchNode (int nodeValue) {
        if (head != null) {
            Node tempNode = head;
            for (int i = 0; i < size; i++) {
                if (tempNode.value == nodeValue) {
                    System.out.println("SUCCESS: Found the node: " + tempNode.value + " at location: " + i + "\n");
                    return true;
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("ERROR: Node not found.");
        return false;
    }

    public void deleteNode (int nodeValue) {
        if (head != null) {
            System.out.println("ERROR: List does not exist.");
            return;

        } else if (location == 0) {
            head = head.next;
            size--;
            if (size == 0) {
                tail = null;
            }
            System.out.println("SUCCESS: Deleted Node at: " + location + ".");
            return;

        } else if (location >= size - 1) {
            Node tempNode = head;
            for (int i = 0; i < size - 2; i++) {
                tempNode = tempNode.next;
            }
            if (tempNode == head) {
                head = null;
                tail = null;
                size--;
                System.out.println("SUCCESS: Deleted Node at: " + location + ".");
                return;
            }
            tempNode.next = null;
            tail = tempNode;
            size--;
            System.out.println("SUCCESS: Deleted Node at: " + location + ".");
            return;

        } else {
            Node tempNode = head;
            for (int i = 0; i < location - 1; i++) {
                tempNode = tempNode.next;
            }
            tempNode.next = tempNode.next.next;
            size--;
            System.out.println("SUCCESS: Deleted Node at: " + location + ".");
        }
    }
}