package akshay.interview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TripletsSum {

    static List<List<Integer>> findTriplets(int[] arr)
    {
        List<List<Integer>> results=new ArrayList<>();
        int n=arr.length;
        boolean found = false;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr[i] + arr[j] + arr[k] == 0) {
                        System.out.println(arr[i] + " "
                                + arr[j] + " "
                                + arr[k]);
                        results.add(Arrays.asList(arr[i] , arr[j] , arr[k]));
                        found = true;
                    }
                }
            }
        }
        // If no triplet with 0 sum found in array
        if (found == false)
            System.out.println(" not exist ");
        return results;
    }

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 7, 12, 3, 1, 2, -6, 5, -8, 6};
        List<List<Integer>> res=findTriplets(arr);
        System.out.println(res);
    }
}