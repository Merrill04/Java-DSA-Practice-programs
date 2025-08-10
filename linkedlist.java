public class linkedlist {
    public static Node head;

    public void addatbegining(int data){
        Node newnode = new Node(data);
        
        newnode.next = head;
        head = newnode;
    }

    public void addatend(int data){
        Node newnode = new Node(data);
        if(head == null){
            head = newnode;
            return;
        }

        Node current = head;

        while(current.next != null){
            current = current.next;
        }
        current.next = newnode;
    }

    public void printlist(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }

        Node current = head;

        while(current != null){
            System.out.print(current.data + " --> ");
            current = current.next;
        }
    }

    public void removeatbegining(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else if(head.next == null){
            head = null;
            return;
        }

        head = head.next;
    }

    public void removeatend(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        else if(head.next == null){
            head = null;
            return;
        }

        Node current = head;
        while(current.next.next != null){ 
            current = current.next;
        }
        current.next = null;
    }
    
    public void sizeofLL(){
        int count = 0;
        Node current = head;

        while(current != null){
            count++;
            current = current.next;
        }
        System.out.println("Size of Linked List is: " + count);
    }

    public void search(int data){
        Node current = head;
        
        while(current != null){
            if(current.data == data){
                System.out.println("Element is found");
                return;
            }
            current = current.next;
        }

        System.out.println("Element not found");
    }

    public void addinmiddle(int data, int index){
        Node newNode = new Node(data);

        if(index == 1){
            newNode.next = head;
            head = newNode;
            return;
        }

        int count = 1;

        Node current = head;

        while(count < index-1 && current.next != null){
            current = current.next;
            count++;
        }

        newNode.next = current.next;
        current.next = newNode;
    }

    public static void main(String[] args){
        linkedlist list = new linkedlist();

        list.addatbegining(1);
        list.addatend(2);
        list.addatend(3);
        list.addatend(4);

        list.printlist();

        list.addinmiddle(5,3);
        System.out.println();

        list.printlist();

        list.removeatbegining();
        list.removeatend();
        System.out.println();

        list.printlist();
        System.out.println();

        list.search(2);
        System.out.println();
        list.sizeofLL();

        System.out.println();
        list.addatend(6);
        list.printlist();
    }
}
