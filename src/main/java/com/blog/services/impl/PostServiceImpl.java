package com.blog.services.impl;

import com.blog.entities.*;
import com.blog.exceptions.ResourceNotFoundException;
import com.blog.payloads.PostDto;
import com.blog.repositories.*;
import com.blog.services.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    private PostRepo postRepo;

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserRepo userRepo;

    @Autowired
    private CategoryRepo categoryRepo;

    @Override
    public PostDto createPost(PostDto postDto,Integer userID, Integer categoryId) {
        User user= this.userRepo.findById(userID)
                .orElseThrow(()-> new ResourceNotFoundException("User", "User Id", userID));

        Category category= this.categoryRepo.findById(categoryId)
                .orElseThrow(()-> new ResourceNotFoundException("Category", "Category Id", categoryId));

        Post post= this.modelMapper.map(postDto, Post.class);
        post.setImageName("default.png");
        post.setDate(new Date());
        post.setUser(user);
        post.setCategory(category);

        Post newPost= this.postRepo.save(post);

        return this.modelMapper.map(newPost, PostDto.class);
    }

    @Override
    public PostDto updatePost(PostDto postDto, Integer postId) {
        return null;
    }

    @Override
    public void deletePost(Integer postId) {

    }

    @Override
    public List<Post> getAllPost() {

        return null;
    }

    @Override
    public Post getPostById(Integer postId) {
        return null;
    }

    @Override
    public List<Post> getPostByCategory(Integer categoryId) {
        return null;
    }

    @Override
    public List<Post> getPostByUser(Integer userId) {
        return null;
    }

    @Override
    public List<Post> searchPost(String keyword) {
        return null;
    }
}
