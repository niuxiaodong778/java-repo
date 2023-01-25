package org.example.set;

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList arrayList = new  ArrayList();
        arrayList.add("xiaodong001");
        arrayList.add("xiaodong002");
        arrayList.add("xiaodong003");
        arrayList.add("xiaodong004");
        arrayList.add("xiaodong005");

        ViewAll viewAll = new ViewAll();
        viewAll.MyFor(arrayList);
        System.out.println("-----------------");
        viewAll.MyIterator(arrayList);

    }
}
