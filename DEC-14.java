 public class HelloWorld {

    public static int searching(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }

        int mid = start + (end - start) / 2;

        if (arr[mid] == target) {
            return mid;
        }

        if (arr[start] <= arr[mid]) {
            if (target >= arr[start] && target < arr[mid]) {
                return searching(arr, target, start, mid - 1);
            } else {
                return searching(arr, target, mid + 1, end);
            }
        } else {
            if (target > arr[mid] && target <= arr[end]) {
                return searching(arr, target, mid + 1, end);
            } else {
                return searching(arr, target, start, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        int target = 0;

        int index = searching(arr, target, 0, arr.length - 1);
        System.out.println(index);
    }
}
