package tries;

import java.util.HashMap;
import java.util.Map;

public class Trie {

    private final Map<Character, Trie> branches;
    private boolean isWord;

    public Trie() {
        this.branches = new HashMap<>();
        this.isWord = false;
    }

    public void insert(String word) {

    }

    public boolean search(String word) {
        return false;
    }

    public boolean startsWith(String prefix) {
        return false;
    }
//    public void insert(String word) {
//        var key = word.toCharArray()[0];
//        if (word.length() == 1) {
//            isWord = true;
//            var trie = branches.getOrDefault(key, new Trie());
//            branches.put(key, trie);
//        } else {
//            var trie = branches.getOrDefault(key, new Trie());
//            branches.put(key, trie);
//            trie.insert(word.substring(1));
//        }
//
//    }
//
//    public boolean search(String word) {
//        var key = word.toCharArray()[0];
//        if (word.length() == 1) {
//            return isWord && branches.containsKey(key);
//        }
//        var trie = branches.get(key);
//        if (trie == null) {
//            return false;
//        }
//        return trie.search(word.substring(1));
//    }
//
//    public boolean startsWith(String prefix) {
//        var key = prefix.toCharArray()[0];
//        if (prefix.length() == 1 && branches.containsKey(key)) {
//            return true;
//        }
//        var trie = branches.get(key);
//        if (trie == null) {
//            return false;
//        }
//        return trie.startsWith(prefix.substring(1));
//    }
}
