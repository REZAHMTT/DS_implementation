public class Main {
    public static void main(String[] args){
        System.out.println("structures implementation");
        System.out.println("-AmirrezaHemmati\tST = 40231977\n");
 //--------------------------Stack test
        System.out.println("Stack Test");
        Stack myS = new Stack(3);
        myS.push(5);
        myS.push(6);
        int test =myS.top();
        System.out.println(test);
        myS.pop();
 //--------------------------queue test
        System.out.println("---------\nQueue Test\n");
        Queue myQ = new Queue(3);
        myQ.enqueue(34);
        myQ.enqueue(5);
        myQ.enqueue(6);
        myQ.isEmpty();
        myQ.dequeue();
        myQ.dequeue();
  //------------------------trie test
        System.out.println("--------\ntrie test\n");
        Trie trie = new Trie();
        trie.insert("reza");
        trie.insert("repo");
        System.out.println(trie.search("reza"));
        System.out.println(trie.search("repo"));
  //-----------------------MaxHeap test
        System.out.println("--------\nHeap test\n");
        MaxHeap maxHeap = new MaxHeap(3);
        maxHeap.insert(5);
        maxHeap.insert(6);
        maxHeap.insert(7);
        maxHeap.print();
  //-----------------------LinkedList test
        System.out.println("----------\nLinked list test\n");
        LinkedList linkedList = new LinkedList();
        LinkedList.insert(linkedList, 4);
        linkedList.insert(linkedList, 6);
        linkedList.insert(linkedList, 7);
        linkedList.insert(linkedList, 8);
        linkedList.insert(linkedList, 9);
        linkedList.printList(linkedList);
  //----------------------BSt test
        System.out.println("----------\nBstAvl\n");
        BstAvl bstAvl = new BstAvl();
        bstAvl.insert(5);
        bstAvl.insert(6);
        bstAvl.insert(7);
        bstAvl.insert(8);
        bstAvl.printTree();

    }
}