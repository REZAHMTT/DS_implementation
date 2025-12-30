public class Stack {
    private int maxSize;
    private int[] stackArray;
    private int top;
    public Stack(int size) {
        maxSize=size;
        stackArray=new int[maxSize];
        top=-1;
    }
    public void push(int value){
        if(top == maxSize - 1){
            System.out.println("Stack overflow");
            return;
        }
        stackArray[++top]= value;
        System.out.println(value +"->pushed");
    }
    public int pop(){
        if(top == -1){
            System.out.println("Stack underflow");
            return -1;
        }
        int POPel=stackArray[top--];
        System.out.println(POPel + "->popped");
        return POPel;
    }
    public int top(){
        if (top == -1){
            System.out.println("empty");
            return -1;
        }
        return stackArray[top];
    }
    public boolean isEmpty() {
        return (top == -1);
    }
}