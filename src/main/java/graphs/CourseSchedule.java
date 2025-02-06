package graphs;

import java.util.*;

public class CourseSchedule {
    Map<Integer, List<Integer>> coursesMap = new HashMap<>();

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Set<Integer> visited = new HashSet<>();

        for (int[] prerequisite : prerequisites) {
            var courses = coursesMap.getOrDefault(prerequisite[0], new ArrayList<>());
            courses.add(prerequisite[1]);
            coursesMap.put(prerequisite[0], courses);
        }

        for (int i = 0; i < numCourses; i++) {
            if (!visited.contains(i)) {
                if (isCyclic(coursesMap, visited, i)) {
                    return false;
                }
            }
        }
        return true;
    }

    private boolean isCyclic(Map<Integer, List<Integer>> map, Set<Integer> visited, int current) {
        if (visited.contains(current)) {
            return true;
        }
        visited.add(current);
        for (int i = 0; i < map.getOrDefault(current, new ArrayList<>()).size(); i++) {
            var element = map.get(current).get(i);
            if (isCyclic(map, visited, element)) {
                return true;
            }
        }
        visited.remove(current);
        coursesMap.put(current, new ArrayList<>());
        return false;
    }

    public boolean canFinishTopologicalSort(int numCourses, int[][] prerequisites) {
        // create an adjacency list
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        // define an indegree. Basically it's an array of inbound edges of a head
        // Example: Graph: 0 -> 1 -> 2 will have indegree: [0, 1(because index one has only one direction from 0), 1(because index 2 has only one direction from 1)]
        int[] indegree = new int[numCourses];
        // populating indegree and adjacency list.
        for (int[] pre: prerequisites) {
            indegree[pre[1]]++;
            adjacency.get(pre[0]).add(pre[1]);
        }

        // populating queue
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // Defining a finish value and doing a topological sort
        int finish = 0;
        while (!queue.isEmpty()) {
            finish++;
            var head = queue.removeFirst();
            for (int edge : adjacency.get(head)) {
                indegree[edge]--;
                if (indegree[edge] == 0) {
                    queue.add(edge);
                }
            }
        }
        return finish == numCourses;
    }

    public int[] findOrder(int numCourses, int[][] prerequisites) {
        // create an adjacency list
        List<List<Integer>> adjacency = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjacency.add(new ArrayList<>());
        }
        // define an indegree. Basically it's an array of inbound edges of a head
        // Example: Graph: 0 -> 1 -> 2 will have indegree: [0, 1(because index one has only one direction from 0), 1(because index 2 has only one direction from 1)]
        int[] indegree = new int[numCourses];
        // populating indegree and adjacency list.
        for (int[] pre: prerequisites) {
            indegree[pre[0]]++;
            adjacency.get(pre[1]).add(pre[0]);
        }

        // populating queue
        Deque<Integer> queue = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // Defining an index and order and doing a topological sort
        int index = 0;
        int[] order = new int[numCourses];
        while (!queue.isEmpty()) {
            var head = queue.removeFirst();
            order[index] = head;
            index++;
            for (int edge : adjacency.get(head)) {
                indegree[edge]--;
                if (indegree[edge] == 0) {
                    queue.add(edge);
                }
            }
        }
        return index != numCourses ? new int[0] : order;
    }
}
