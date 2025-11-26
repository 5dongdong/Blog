package com.odong.blog.service;

import com.odong.blog.dto.Post;
import com.odong.blog.mapper.PostMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PostService {

    private final PostMapper postMapper;

    public List<Post> getAllPosts() {
        return postMapper.getAllPost();
    }
}
