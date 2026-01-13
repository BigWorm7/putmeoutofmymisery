package com.pt2.simga;

public class Samochod {
    public Samochod(String model, String marka, String historia, int rocznik, boolean wlasciciel) {
        this.model = model;
        this.marka = marka;
        this.historia = historia;
        this.rocznik = rocznik;
        this.wlasciciel = wlasciciel;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public int getRocznik() {
        return rocznik;
    }

    public void setRocznik(int rocznik) {
        this.rocznik = rocznik;
    }

    public boolean isWlasciciel() {
        return wlasciciel;
    }

    public void setWlasciciel(boolean wlasciciel) {
        this.wlasciciel = wlasciciel;
    }

    String model, marka, historia;
    int rocznik;
    boolean wlasciciel;

}
