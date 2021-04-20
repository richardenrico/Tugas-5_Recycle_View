package com.tugas.recyclerview;

public class MangaModel {
    private String title;
    private String synopsis;
    private String author;
    private int image;

    public void setAuthor(String author) {this.author = author;}

    public String getAuthor() {return author;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
