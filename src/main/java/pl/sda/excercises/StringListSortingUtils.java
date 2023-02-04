package pl.sda.excercises;

import java.util.*;

public class StringListSortingUtils {

    public static List<String> getSortedList(String[] words) {
        List<String> sortedList = Arrays.asList(words);
        sortedList.sort(String::compareTo);

        return sortedList;
    }

    public static List<String> getSortedList(String[] words, Comparator<String> comparator) {
        //Arrays.sort(words, comparator);

        List<String> sortedList = Arrays.asList(words);
        sortedList.sort(comparator);

        return sortedList;
    }

    public static Set<String> getSortedSet(String[] words) {
        List<String> list = Arrays.asList(words);
        Set<String> sortedSet = new TreeSet<>(list);

        return sortedSet;
    }

}
