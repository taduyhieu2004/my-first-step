package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex54 {
    private static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> list = new ArrayList<>();
        List<Integer> listCheck = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (!listCheck.contains(nums[i])) {
                listCheck.add(nums[i]);
            }
        }
        if (listCheck.size() == 1&&listCheck.get(0)==1) {
            listCheck.set(0, listCheck.get(0) + 1);
            return listCheck;

        } else if (listCheck.size() == 1&&listCheck.get(0)!=1) {
            listCheck.set(0, 1);
            return listCheck;
        }
        int i = 0;
        while (i < listCheck.size() - 1) {
            int n = listCheck.get(i + 1) - listCheck.get(i);
            if (n == 1) {
                i++;
            } else {
                int x = listCheck.get(i);
                list.add(x + 1);
                listCheck.set(i, x + 1);
            }

        }
        return list;

    }

    public static void main(String[] args) {
        int[] arr = {1, 1};
        List<Integer> list = findDisappearedNumbers(arr);
        for (int a : list) {
            System.out.println(a);
        }
    }
}

