package tries;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrieTest {

    @Test
    void trieTest1() {
        var trie = new Trie();
        // apple case
        var apple = "apple";
        trie.insert(apple);
        assertTrue(trie.search(apple));
        
        // app case
        var app = "app";
        assertFalse(trie.search(app));
        assertTrue(trie.startsWith(app));
        trie.insert(app);
        assertTrue(trie.search(app));

        // bar case
        var bar = "bar";
        assertFalse(trie.search(bar));
        assertFalse(trie.startsWith(bar));
    }

    @Test
    void trieTest2() {
        var trie = new Trie();
        // apple case
        var a = "a";
        trie.insert(a);
        assertTrue(trie.search(a));
        assertTrue(trie.startsWith(a));
    }

    @Test
    void trieTest3() {
        var trie = new Trie();
        // apple case
        var a = "a";
        assertFalse(trie.search(a));
        assertFalse(trie.startsWith(a));
    }

    @Test
    void trieTest4() {
        var words = new String[] {"app", "apple", "beer", "add", "jam", "rental"};
        var trie = new Trie();
        // apple case
        for (String word: words) {
            trie.insert(word);
        }
        assertFalse(trie.search("apps"));
        assertTrue(trie.search(words[0]));
        assertFalse(trie.search("ad"));
        assertFalse(trie.search("applepie"));
        assertFalse(trie.search("rest"));
        assertFalse(trie.search("jan"));
        assertFalse(trie.search("rent"));

        assertFalse(trie.startsWith("jan"));
    }

    @Test
    void trieTest5() {
        var trie = new Trie();
        // apple case
        var add = "add";
        trie.insert(add);
        assertTrue(trie.search(add));

        // app case
        var app = "app";
        assertFalse(trie.search(app));
        trie.insert(app);
        assertTrue(trie.search(app));

        assertTrue(trie.search(add));
    }
}