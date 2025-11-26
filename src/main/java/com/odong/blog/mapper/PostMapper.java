package com.odong.blog.mapper;
import com.odong.blog.dto.Post;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;


@Mapper
public interface PostMapper {

    List<Post> getAllPost();
}
