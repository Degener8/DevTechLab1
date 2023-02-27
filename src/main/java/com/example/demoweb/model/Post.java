package com.example.demoweb.model;

import java.time.Instant;
import java.util.Date;

public class Post {

    private String text;
    private int likes = 0;
    private long id;

    private Date creationDate;

    public Post (Long Id, String textContent) {
        this.id = Id;
        this.text = textContent;
        this.creationDate = Date.from(Instant.now());
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Date getCreationDate(){
        return creationDate;
    }

    public void setLikes(int likesNum){

        this.likes = likesNum;
    }

    public Long getId(){
        return this.id;
    }
}
