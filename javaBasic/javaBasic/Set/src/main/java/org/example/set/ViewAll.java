package org.example.set;

import java.util.ArrayList;
import java.util.Iterator;

public class ViewAll {
    public void MyIterator(ArrayList<String> arrayList){
        Iterator it = arrayList.iterator();
        while (it.hasNext()){
            Object object = it.next();
            if(object instanceof String){
                System.out.println(object);
            } else if (object instanceof Integer) {
                System.out.println(object);
            }
        }
    }
    public void MyFor(ArrayList<String> arrayList){
        for (int i = 0; i <arrayList.size(); i++) {
            System.out.println(arrayList.get(i));
        }

    }
}
