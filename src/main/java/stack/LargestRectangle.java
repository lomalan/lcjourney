package stack;

import java.util.Deque;
import java.util.LinkedList;

public class LargestRectangle {
    public int largestRectangleArea(int[] heights) {
        // Phase 1. Create and populate stack
        Deque<RectangleData> stack = new LinkedList<>();
        int maxArea = 0;
        for (int i = 0; i < heights.length; i++) {
            int start = i;
            // If currentElement is less than latest in stack, we need to calculate an area for the previous element,
            // because it can't extend more
            while (!stack.isEmpty() && stack.peekLast().height > heights[i]) {
                var poppedElement = stack.removeLast();
                maxArea = Math.max(maxArea, poppedElement.height * ((i - poppedElement.index)));
                start = poppedElement.index;
            }
            stack.add(new RectangleData(start, heights[i]));
        }
        // Phase 2. Calculate area for remaining elements in a stack
        while (!stack.isEmpty()) {
            var rectangleData = stack.removeLast();
            maxArea = Math.max(maxArea, rectangleData.height * (heights.length - rectangleData.index));
        }
        return maxArea;
    }

    private record RectangleData(
            int index,
            int height
    ){}
}
