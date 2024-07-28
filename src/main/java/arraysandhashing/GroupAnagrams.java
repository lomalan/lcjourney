package arraysandhashing;

import java.util.*;

public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> result = new HashMap<>();
        for (String currentResult : strs) {
            var storage = new int[26];
            for (char sChar : currentResult.toCharArray()) {
                storage[sChar - 'a']++;
            }
            var currentHash = Arrays.hashCode(storage);
            List<String> listForHash = result.getOrDefault(currentHash, new ArrayList<>());
            listForHash.add(currentResult);
            result.put(currentHash, listForHash);
        }
        return new ArrayList<>(result.values());
    }
}
