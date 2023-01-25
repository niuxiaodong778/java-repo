package org.example.fu;

public class FU {
    private String priName;
    public String pubNane;

    public String getPriName() {
        return priName;
    }

    public void setPriName(String priName) {
        this.priName = priName;
    }

    public String getPubNane() {
        return pubNane;
    }

    public void setPubNane(String pubNane) {
        this.pubNane = pubNane;
    }

    public FU() {
    }

    public FU(String priName, String pubNane) {
        this.priName = priName;
        this.pubNane = pubNane;
    }
}
