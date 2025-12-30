public class Main {
    public static void main(String[] args) {
 //--------------------------Stack test
        System.out.println("Stack Test");
        Stack myS = new Stack(3);
        myS.push(5);
        myS.push(6);
        int test =myS.top();
        System.out.println(test);
        myS.pop();
 //--------------------------queue test
        System.out.println("---------\nQueue Test\n-------");
        Queue myQ = new Queue(3);
        myQ.enqueue(34);
        myQ.enqueue(5);
        myQ.enqueue(6);
        myQ.isEmpty();
        myQ.dequeue();
        myQ.dequeue();
  //------------------------trie test
        System.out.println("--------\ntrie test\n-------");
        Trie trie = new Trie();
        trie.insert("reza");
        trie.insert("repo");
        System.out.println(trie.search("reza"));
        System.out.println(trie.search("repo"));
    }
}