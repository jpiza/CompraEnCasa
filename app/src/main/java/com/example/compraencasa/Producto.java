package com.example.compraencasa;

public class Producto {
    private String name;
    private int imageSource;

    public Producto (int imageSource, String name) {
        this.name = name;
        this.imageSource = imageSource;
    }

    public String getName() {
        return name;
    }

    public int getImageSource() {
        return imageSource;
    }
}
