package com.example.demoweb.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Post implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String text;
    private Date creationDate;
    private Integer likes = 0;

    public Post() {
    }
    public Post(Long id, String text, Date creationDate){
        this.id = id;
        this.text = text;
        this.creationDate = creationDate;
    }
    public String getText(){
        return text;
    }
    public Integer getLikes(){
        return likes;
    }
    public void setLikes(Integer likes){
        this.likes = likes;
    }
    public Date getCreationDate(){
        return creationDate;
    }
    public Long getId()
    {
        return this.id;
    }

}