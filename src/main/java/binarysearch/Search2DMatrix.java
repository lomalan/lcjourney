package binarysearch;

public class Search2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        // mid / elementsInArray - responsible for needed array
        // mid % elementsInArray - responsible for element in array

        int start = 0;
        int arrays = matrix.length;
        int elementsInArray = matrix[0].length;
        int end = (arrays * elementsInArray) - 1;

        while(start <= end) {
            int mid = (start + end) / 2;
            int element = matrix[mid / elementsInArray][mid % elementsInArray];
            if (element == target) {
                return true;
            } else if (element > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }
}
