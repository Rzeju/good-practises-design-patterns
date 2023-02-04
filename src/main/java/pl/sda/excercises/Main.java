package pl.sda.excercises;

import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        String[] myArray = {"Hello", "aaaaa", "AAAaaaaa", "Beczka", "Mmmmm", "Z", "zzzzz"};

        System.out.println(StringListSortingUtils.getSortedList(myArray));
        System.out.println(StringListSortingUtils.getSortedSet(myArray));


        System.out.println(StringListSortingUtils.getSortedList(myArray, String::compareTo));
        System.out.println(StringListSortingUtils.getSortedList(myArray, String.CASE_INSENSITIVE_ORDER));
        System.out.println(StringListSortingUtils.getSortedList(myArray, String.CASE_INSENSITIVE_ORDER.reversed()));


        Comparator<String> comparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() > o2.length()) {
                    return 1;
                }
                return 0;
            }
        };

        System.out.println(StringListSortingUtils.getSortedList(myArray, comparator));


    }
}
