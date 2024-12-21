// Time Complexity: O(1) for all the methods
// Space Complexity: O(N)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No

class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data)
        {
            //Constructor here
            this.data = data;
            this.next = null;
        }
    }

    StackAsLinkedList() {
        this.root = null;
    }
    public boolean isEmpty()
    {
        //Write your code here for the condition if stack is empty.
        return root == null;
    }

    public void push(int data)
    {
        //Write code to push data to the stack.
        StackNode newNode = new StackNode(data);
        newNode.next = root;
        root = newNode;
    }

    public int pop()
    {
        //If Stack Empty Return 0 and print "Stack Underflow"
        //Write code to pop the topmost element of stack.
        //Also return the popped element
        if(root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        StackNode temp = root;
        root = temp.next;
        return temp.data;
    }

    public int peek()
    {
        //Write code to just return the topmost element without removing it.
        if(root == null) {
            System.out.println("Stack is empty");
            return 0;
        }
        return root.data;
    }

    //Driver code
    public static void main(String[] args)
    {

        StackAsLinkedList sll = new StackAsLinkedList();

        sll.push(10);
        sll.push(20);
        sll.push(30);

        System.out.println(sll.pop() + " popped from stack");

        System.out.println("Top element is " + sll.peek());
    }
} 
