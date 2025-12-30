class TrieNode{
    TrieNode[] children;
    boolean isEndOfWord;
    public TrieNode(){

        children = new TrieNode[26];
        isEndOfWord = false;
    }
}
public class Trie{
    private TrieNode root;
    public Trie(){
        root=new TrieNode();
    }
    public void insert(String word){
        TrieNode current=root;
        for (int i = 0; i <word.length(); i++) {
            char ch = word.charAt(i);
            if (current.children[ch - 'a'] == null){
                current.children[ch - 'a'] = new TrieNode();
            }
            current = current.children[ch - 'a'];
        }
        current.isEndOfWord=true;
    }
    public boolean search(String word){
        TrieNode current = root;
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);

            if (current.children[ch - 'a']==null){
                return false;
            }
            current = current.children[ch - 'a'];
        }
        return current != null && current.isEndOfWord;
    }
    public boolean startsWith(String prefix){
        TrieNode current = root;
        for (int i = 0; i < prefix.length(); i++){
            char ch = prefix.charAt(i);
            if (current.children[ch - 'a'] == null){
                return false;
            }
            current =current.children[ch - 'a'];
        }
        return true;
    }
}