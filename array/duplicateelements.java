import java.util.ArrayList;

public class duplicateelements {
    public static void main(String[] args) {
        int[] arr = { 4, 3, 2, 7, 8, 2, 3, 1 };
        System.out.println(findDuplicate(arr));

    }

    public static ArrayList<Integer> findDuplicate(int arr[]) {
        ArrayList<Integer> list1 = new ArrayList<>();

        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int index = arr[i] % n;
            arr[i] += n;
        }
        for (int i = 0; i < n; i++) {
            if (arr[i] / n >= 2) {
                list1.add(i);
                return list1;
            }
        }
        if (list1.size() == 0) {
            list1.add(-1);
        }
        return list1;
    }

}