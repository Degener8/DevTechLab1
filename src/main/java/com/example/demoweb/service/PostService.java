package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections.*;
import java.util.List;

@Service
public class PostService {

    public List<Post> listAllPosts() {

        List<Post> posts  = new ArrayList<Post>();
        posts.add(new Post("Первая статья."));
        posts.add(new Post("Вторая статья."));
        posts.add(new Post("Третья статья."));

        return posts;
    }

}
