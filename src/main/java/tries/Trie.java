package tries;

class Trie {

    public final  Trie[] children;
    public boolean isWord;

    public Trie() {
        children = new Trie[26];
        isWord = false;
    }

    public void insert(String word) {
        var current = this;
        for (char symb : word.toCharArray()) {
            var trie = current.children[symb - 'a'];
            if (trie == null) {
                trie = new Trie();
                current.children[symb - 'a'] = trie;
            }
            current = trie;
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        var current = this;
        for (char symbol : word.toCharArray()) {
            if (current.children[symbol - 'a'] == null) {
                return false;
            }
            current = current.children[symbol - 'a'];
        }
        return current.isWord;
    }

    public boolean startsWith(String prefix) {
        var current = this;
        for (char symbol : prefix.toCharArray()) {
            if (current.children[symbol - 'a'] == null) {
                return false;
            }
            current = current.children[symbol - 'a'];
        }
        return true;
    }
}