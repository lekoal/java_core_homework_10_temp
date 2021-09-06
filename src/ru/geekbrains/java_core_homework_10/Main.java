package ru.geekbrains.java_core_homework_10;

import java.util.*;

public class Main {
    public static ArrayList<String> arrayList = new ArrayList<>();

    public static void main(String[] args) {
        ArrayList<String> arrayCutList = new ArrayList<>();
        arrayList.add("пропасть");
        arrayList.add("столик");
        arrayList.add("крыло");
        arrayList.add("вина");
        arrayList.add("кредит");
        arrayList.add("житель");
        arrayList.add("пропасть");
        arrayList.add("чувство");
        arrayList.add("памятник");
        arrayList.add("беседа");
        arrayList.add("металл");
        arrayList.add("потребитель");
        arrayList.add("житель");
        arrayList.add("памятник");
        arrayList.add("чувство");
        arrayList.add("обстановка");
        arrayList.add("беседа");
        arrayList.add("житель");
        int count;
        for (int i = 0; i < arrayList.size(); i++) {
            count = 1;
            for (int j = arrayList.size() - 1; j > i; j--) {
                if (!(arrayList.get(i).equals(arrayList.get(j)))) {
                    count++;
                    arrayCutList.add(arrayList.get(i));
                }
            }
            System.out.println(arrayCutList);
        }

//        System.out.println((Arrays.toString(removeElement(elem))));

    }

    public static String[] removeElement(String elem) {
        Iterator<String> iter = arrayList.iterator();
        while (iter.hasNext()) {
            String str = iter.next();
            if (str.equals(elem)) {
                iter.remove();
            }
        }
        String[] arr = new String[arrayList.size()];
        arrayList.toArray(arr);
        return arr;
    }
}
