public class DoublyLLoperations {
    static DLLnode head;

    public void addatbegining(int data){
        DLLnode node = new DLLnode(data);
        if(head == null){
            head = node;
        }else{
            node.next = head;
            head.prev = node;
            node.prev = null;
            head = node;
        }
    }

    public void addinmiddle(int data, int target){
        DLLnode node = new DLLnode(data);
        DLLnode temp = head;

        if(temp == null){
            System.out.println("List is empty.");
            head = node;
        }else{
            while(temp.data != target){
                temp = temp.next;
            }
        }

        node.next = temp.next;
        temp.next.prev = node;
        temp.next = node;
        node.prev = temp;
    }

    public void addatend(int data){
        DLLnode node = new DLLnode(data);
        DLLnode temp = head;

        if(temp == null){
            System.out.println("List is empty.");
        }else{
            while(temp.next != null){
                temp = temp.next;
            }
        }

        temp.next = node;
        node.prev = temp;
        node.next = null;
    }

    public void deletenode(int target){
        DLLnode temp = head;

        if(temp == null){
            System.out.println("List is empty.");
        }else{
            while(temp.data != target){
                temp = temp.next;
            }
        }

        if(temp.prev == null){
            head = temp.next;
            head.prev = null;
        }else if(temp.next == null){
            temp.prev.next = temp.next;
        }else{
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }

    public void display(){
        DLLnode temp = head;

        if(temp == null){
            System.out.println("List is empty.");
        }else{
            while(temp != null){
                System.out.print(temp.data + "-->");
                temp = temp.next;
            }
            System.out.println("null");
        }
    }

    public static void main(String []args){
        DoublyLLoperations dll = new DoublyLLoperations();

        dll.display();
        dll.addatbegining(1);
        dll.addatbegining(2);
        dll.addatbegining(3);
        dll.display();
        dll.addatend(4);
        dll.display();
        dll.addinmiddle(5, 3);
        dll.display();
        dll.deletenode(3);
        dll.deletenode(2);
        dll.deletenode(4);
        dll.display();
    }
}
