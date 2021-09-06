package ru.geekbrains.java_core_homework_10;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        ArrayList<String> arrayList = new ArrayList<>();
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
            for (int j = i + 1; j < arrayList.size(); j++) {
                if (arrayList.get(i).equals(arrayList.get(j))) {
                    set.add(arrayList.get(i));
                }
            }
        }
        String[] resultArr = new String[set.size()];
        set.toArray(resultArr);
        System.out.println(Arrays.toString(resultArr));
    }

}
