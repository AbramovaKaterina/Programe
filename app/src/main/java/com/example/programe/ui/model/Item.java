package com.example.programe.ui.model;

public class Item {
    private String name = null;
    private String author = null;
    private String image = null;

    public Item(String name, String author, String image) {
        this.author = author;
        this.name = name;
        this.image = image;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
