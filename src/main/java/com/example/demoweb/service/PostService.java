package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class PostService {

    private static List<Post> posts = new ArrayList() {{

        add(new Post("Первая статья"));
        add(new Post("Вторая статья"));
        add(new Post("Третья статья"));

    }};


    public List<Post> listAllPosts() {
        return posts;
    }

    public static void create(String text) {
        posts.add(new Post(text));
    }

}
