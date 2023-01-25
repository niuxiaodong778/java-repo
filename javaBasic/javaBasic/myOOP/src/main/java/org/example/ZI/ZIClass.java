package org.example.ZI;

import org.example.fu.FU;

public class ZIClass extends FU {
    private String ziName;

    public String getZiName() {
        return ziName;
    }

    public void setZiName(String ziName) {
        this.ziName = ziName;
    }

    public ZIClass(String ziName) {
        this.ziName = ziName;
    }

    public ZIClass() {
    }
}
