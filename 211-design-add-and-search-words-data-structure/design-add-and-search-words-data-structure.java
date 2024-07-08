class TrieNode{
    TrieNode trienode[];
    boolean wordEnd;
    public TrieNode() {
        trienode = new TrieNode[26];
        for(int i=0; i<26; i++){
            trienode[i] = null;
        }
        wordEnd = false;
    }

    public boolean containsCharacter(Character ch){
        if(trienode[ch - 'a'] == null ){
            return false;
        }
        return true;
    }

    public boolean checkWordEnd( TrieNode curr) {
        if(curr.wordEnd == true){
            return true;
        }
        return false;
    }

}

class WordDictionary {

    TrieNode root;
    TrieNode curr;

    public WordDictionary() {
         root = new TrieNode();
         curr = root;
    }
    
    public void addWord(String word) {
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
        return searchHelper(word, root);
    }

    private boolean searchHelper(String word, TrieNode node) {
        if (word.isEmpty()) {
            return node.wordEnd;
        }

        char ch = word.charAt(0);
        if (ch == '.') {
            for (TrieNode child : node.trienode) {
                if (child != null && searchHelper(word.substring(1), child)) {
                    return true;
                }
            }
            return false;
        } else {
            if (node.containsCharacter(ch)) {
                return searchHelper(word.substring(1), node.trienode[ch - 'a']);
            } else {
                return false;
            }
        }
    }
}

/**
 * Your WordDictionary object will be instantiated and called as such:
 * WordDictionary obj = new WordDictionary();
 * obj.addWord(word);
 * boolean param_2 = obj.search(word);
 */