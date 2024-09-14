package tries;

public class WordDictionary {
    private final Trie node;

    public WordDictionary() {
        node = new Trie();
    }

    public void addWord(String word) {
        var chars = word.toCharArray();
        Trie current = node;
        for (Character c: chars) {
            Trie trie = current.children[c - 'a'];
            if (trie == null) {
                trie = new Trie();
                current.children[c - 'a'] = trie;
            }
            current = trie;
        }
        current.isWord = true;
    }

    public boolean search(String word) {
        return search(word, node, 0);
    }

    private boolean search(String word, Trie current, int index) {
        var chars = word.toCharArray();
        for (int i = index; i < chars.length; i++) {
            var c = chars[i];
            if (c == '.') {
                for (Trie trie: current.children) {
                    if (trie != null && search(word, trie, i + 1)) {
                        return true;
                    }
                }
                return false;
            }
            Trie trie = current.children[c - 'a'];
            if (trie == null) {
                return false;
            }
            current = trie;
        }
        return current.isWord;
    }
}
