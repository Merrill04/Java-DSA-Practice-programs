public class stack {
    int[] stackarray;
    int top;
    int maxsize;

    public stack(int size){
        maxsize = size;
        stackarray = new int[maxsize];
        top = -1;
    }

    public boolean isFull() {
        if(top == maxsize - 1) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    public void push(int item) {
        if(isFull()) {
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        stackarray[top] = item;
    }

    public void pop() {
        if(isEmpty()){
            System.out.println("Stack Underflow");
        }
        System.out.println(stackarray[top]);
        top--;
    }

    public void peek() {
        if(isEmpty()) {
            System.out.println("Stack is empty");
        }
        System.out.println(stackarray[top]);
    }

    public static void main(String[] args) {
        stack s = new stack(10);
        s.push(1);
        s.push(2);
        s.peek();
        s.pop();
        s.peek();

    }
}
