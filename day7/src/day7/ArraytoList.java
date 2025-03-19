package day7;

import java.util.Arrays;
import java.util.List;

public class ArraytoList {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        List<int[]> list = Arrays.asList(arr);
        System.out.println(list);
    }
}
