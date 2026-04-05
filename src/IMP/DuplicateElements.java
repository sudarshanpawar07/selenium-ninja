package IMP;

import java.util.HashMap;

public class DuplicateElements {
    public static void main(String[] args) {

        int[] arr = {2, 3, 4, 3, 2, 5, 4, 6, 5, 7, 5, 6, 7};

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        for (int key : map.keySet()) {
            if (map.get(key) > 1) {
                System.out.println(key);
            }
        }
    }
}