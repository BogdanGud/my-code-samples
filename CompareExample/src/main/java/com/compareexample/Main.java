package com.compareexample;


import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {
        Main main = new Main();

        Integer[] input = {2, 5, 34, 7, 13, 25, 9, 10, 16};
        String[] stringInput = {"qe", "qwe", "asd", "t"};

        Person bill = new Person("Bill", "McAdams", 16);
        Person jake = new Person("Jake", "Gyllenhaal", 42);
        Person tom = new Person("Tom", "Hanks", 28);
        Person andre = new Person("Andre", "Clinton", 50);
        Person roy = new Person("Roy", "Jones", 32);

        Person[] personInput = {bill, jake, tom, andre, roy};


        System.out.println("By age:");
        main.bubbleSort(personInput, new PersonAgeComparator());
        System.out.println(Arrays.toString(personInput));

        System.out.println("By name:");
        main.bubbleSort(personInput, new PersonNameComparator());
        System.out.println(Arrays.toString(personInput));

    }

    public <T> void bubbleSort(T[] arr, Comparator<T> comparator) {
        boolean swapped = true;
        int j = 0;
        T tmp;
        while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < arr.length - j; i++) {
                if (comparator.compare(arr[i], arr[i + 1]) > 0) {
                    tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                    swapped = true;
                }
            }
        }

    }
}
