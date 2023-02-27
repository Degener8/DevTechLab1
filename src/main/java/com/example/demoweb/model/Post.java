package com.example.demoweb.model;

import java.time.Instant;
import java.util.Date;

public class Post {

    private String text;
    private Integer likes = 0;

    private Date creationDate;

    public Post (String textContent) {
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

}
