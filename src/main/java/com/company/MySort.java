package com.company;

import org.junit.Test;

import java.util.ArrayList;

public class MySort {

    @Test
    public static ArrayList<Integer> selectionSort (ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            int indexMin = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(j) < list.get(indexMin)) {
                    indexMin = j;
                }
            }
            int tmp = list.get(indexMin);
            list.set(indexMin, list.get(i));
            list.set(i, tmp);
        }
        return list;
    }

    @Test
    public static ArrayList<Integer> gnomeSort (ArrayList<Integer> list) {
        int i = 1;
        while (i < list.size()) {
            if (i == 0 || list.get(i - 1) <= list.get(i)) {
                i++;
            } else {
                int tmp = list.get(i);
                list.set(i, list.get(i - 1));
                list.set(i - 1, tmp);
                i--;
            }
        }
        return list;
    }

    @Test
    public static ArrayList<Integer> coctailSort (ArrayList<Integer> list) {
        int begin = 0;
        int end = list.size() - 1;
        do {
            for (int i = begin; i < end; i++) {
                if (list.get(i) > list.get(i + 1)) {
                    int tmp = list.get(i);
                    list.set(i, list.get(i + 1));
                    list.set(i + 1, tmp);
                }
            }
            end--;

            for (int i = end; i > begin; i--) {
                if (list.get(i) < list.get(i - 1)) {
                    int tmp = list.get(i);
                    list.set(i, list.get(i - 1));
                    list.set(i - 1, tmp);
                }
            }
            begin++;
        } while (begin < end);
        return list;
    }

    public static void printArray(ArrayList<Integer> list) {
        System.out.println();
        System.out.println("Вуаля!");
        for (Integer x: list) {
            System.out.print(x + " ");
        }
    }
}
