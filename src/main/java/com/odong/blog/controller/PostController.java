package com.odong.blog.controller;

import com.odong.blog.dto.Post;
import com.odong.blog.service.PostService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("api/posts")
public class PostController {

    private final PostService postService;

    @GetMapping
    public ResponseEntity<List<Post>> getAllPosts() {
        return ResponseEntity.ok(postService.getAllPosts());
    }

//    @GetMapping("/{id}")
//    public ResponseEntity<Post> getPost(@PathVariable String id) {
//        return ResponseEntity.ok(postService.getPost());
//    }
//
//    @PostMapping
//    public ResponseEntity<Post> createPost(@RequestBody Post post) {
//        return ResponseEntity.ok(postService.createPost(post));
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity<Post>  updatePost(
//            @PathVariable Long id,
//            @RequestBody Post post) {
//        return ResponseEntity.ok(postService.updatePost(id, post));
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity<String> deletePost(@PathVariable Long id){
//        postService.deletePost(id);
//        return ResponseEntity.ok("포스트 삭제 완료");
//    }
}
