
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int start[] = {1, 3, 4, 5, 0, 6};
        int end[] = {2, 4, 6, 7, 9, 9};
        int maxact = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        int[][] arr = new int[start.length][3];

        for (int i = 0; i < start.length; i++) {
            arr[i][0] = i;
            arr[i][1] = start[i];
            arr[i][2] = end[i];
        }

        Arrays.sort(arr, (a, b) -> Integer.compare(a[2], b[2]));

        if (arr.length > 0) {
            ans.add(arr[0][0]);
            maxact = 1;
            int endtime = arr[0][2];

            for (int i = 1; i < arr.length; i++) {
                if (endtime <= arr[i][1]) {
                    ans.add(arr[i][0]);
                    endtime = arr[i][2];
                    maxact++;
                }
            }
        }


        System.out.println("Max activities = " + maxact);
        System.out.print("Selected activity indices: ");
        for (int i = 0; i < ans.size(); i++) {
            System.out.print("A" + ans.get(i) + " ");
        }
        System.out.println();






    }
}
