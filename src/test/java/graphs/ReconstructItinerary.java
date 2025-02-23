package graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Stack;

public class ReconstructItinerary {

    public List<String> findItinerary(List<List<String>> tickets) {
        List<String> result = new ArrayList<>();
        Map<String, List<String>> adj = new HashMap<>();

        result.add("JFK");
        for(List<String> ticket: tickets) {
            adj.putIfAbsent(ticket.get(0), new ArrayList<>());
        }

        tickets.sort(Comparator.comparing(s -> s.get(1)));
        for (List<String> ticket : tickets) {
            adj.get(ticket.get(0)).add(ticket.get(1));
        }
        if (dfs("JFK", tickets.size() + 1, result, adj)) {
            return result;
        }
        return new ArrayList<>();
    }

    private boolean dfs(String src, int size, List<String> result, Map<String, List<String>> adj) {
        if (size == result.size()) {
            return true;
        }

        if (!adj.containsKey(src)) {
            return false;
        }

        List<String> temp = new ArrayList<>(adj.get(src));
        for (int i = 0; i < temp.size(); i++) {
            String v = temp.get(i);
            adj.get(src).remove(i);
            result.add(v);
            if (dfs(v, size, result, adj)) {
                return true;
            }
            adj.get(src).add(i, v);
            result.remove(result.size() - 1);
            
        }
        return false;
    }

    List<String> itineraryOptimal(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> adj = new HashMap<>();
        for (List<String> ticket : tickets) {
           if (!adj.containsKey(ticket.get(0))) {
                adj.put(ticket.get(0), new PriorityQueue<>());
           }
           adj.get(ticket.get(0)).add(ticket.get(1));
        }
        LinkedList<String> res = new LinkedList<>();
        Stack<String> stack = new Stack<>();
        stack.add("JFK");
        while (!stack.isEmpty()) {
            String curr = stack.peek();
            if (!adj.containsKey(curr) || adj.get(curr).isEmpty()) {
                res.addFirst(stack.pop());
            } else {
                stack.push(adj.get(curr).poll());
            }
        }

        return res;    
    }
}