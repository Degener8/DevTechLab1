package com.example.demoweb.model;

public class Post {

    private static String text;
    private static Integer likes = 0;

    public Post (String textContent) {
        this.text = textContent;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

}
