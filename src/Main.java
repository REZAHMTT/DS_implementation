public class Main {
    public static void main(String[] args) {
 //--------------------------Stack test
        Stack myS = new Stack(3);
        myS.push(5);
        myS.push(6);
        int test =myS.top();
        System.out.println(test);
        myS.pop();
 //--------------------------
    }
}