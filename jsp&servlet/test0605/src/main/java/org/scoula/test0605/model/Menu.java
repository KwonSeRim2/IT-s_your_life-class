package org.scoula.test0605.model;

public class Menu {
    private String naem;
    private String price;

    public Menu() {
    }

    public Menu(String naem, String price) {
        this.naem = naem;
        this.price = price;
    }

    public String getNaem() {
        return naem;
    }

    public void setNaem(String naem) {
        this.naem = naem;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
