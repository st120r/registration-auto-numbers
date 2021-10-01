package src.main.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.TreeSet;

import static src.main.java.Constants.numbers;

public class LocalRepoLists {

    static ArrayList<String> arrayList = new ArrayList<String>();
    static HashSet<String> hashSet = new HashSet<String>();
    static TreeSet<String> treeSet = new TreeSet<String>();

    public static void addToArrays(String num){
        setArrayToList(num);
        setHashToSet(num);
    }

    private static void setHashToSet(String licNumber) {
        if (!isFull()) {
            if (!hashSet.contains(licNumber)) {
                LocalRepoLists.hashSet.add(licNumber);
            }
        }
    }

    private static void setArrayToList(String licNumber) {
        if (!isFull()) {
            if (!isContains(arrayList, licNumber)) {
                LocalRepoLists.arrayList.add(licNumber);
            }
        }
    }

    public static boolean isFull() {
        return (arrayList.size() >= numbers);
    }

    public static ArrayList<String> getArrayList() {
        return arrayList;
    }

    public static boolean isContains(ArrayList<String> list, String number) {
        return list.contains(number);
    }

    @Override
    public String toString() {
        return "LocalRepoLists{}";
    }
}
