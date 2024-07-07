class TrieNode {
    TrieNode[] trienode;
    boolean wordEnd;
    public TrieNode() {
        trienode = new TrieNode[26];
        for(int i=0; i<26; i++){
            trienode[i] = null;
        }
        wordEnd = false;
    }
    public boolean containsCharacter(Character ch){
        //  if (trienode == null) {
        //     return false;
        // }

        if(trienode[ch - 'a'] == null){
            return false;
        } else {
            return true;
        }
    }

    public boolean checkWordEnd(TrieNode curr){
        if(curr.wordEnd == false){
         return false;
       }
       return true;
    }

   
}

class Trie {

    TrieNode root;
    TrieNode curr = null;

    public Trie() {
        root = new TrieNode();
        curr = root;
    }
    
    public void insert(String word) {
        curr = root;
        for(int i=0; i<word.length(); i++){
            if(!curr.containsCharacter(word.charAt(i))){
                curr.trienode[word.charAt(i) - 'a'] = new TrieNode();
            }  
            curr = curr.trienode[word.charAt(i) - 'a'];
             
        }
        
        curr.wordEnd = true;
        
    }
    
    public boolean search(String word) {
       curr = root;
       for(int i=0; i<word.length(); i++){
            if(!curr.containsCharacter(word.charAt(i))){
                return false;
            }
            curr = curr.trienode[word.charAt(i) - 'a'];
       } 
       return curr.checkWordEnd(curr);
    }
    
    public boolean startsWith(String prefix) {
       curr = root;
        for(int i=0; i<prefix.length(); i++){
            if(!curr.containsCharacter(prefix.charAt(i) )){
                return false;
            }
            curr = curr.trienode[prefix.charAt(i) - 'a'];
        }
        return true;
    }
}

/**
 * Your Trie object will be instantiated and called as such:
 * Trie obj = new Trie();
 * obj.insert(word);
 * boolean param_2 = obj.search(word);
 * boolean param_3 = obj.startsWith(prefix);
 */