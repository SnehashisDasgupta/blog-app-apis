package com.blog.payloads;

import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {

    private Integer postId;

    @NotEmpty
    private String title;

    @NotEmpty
    private String content;

    private String imageName;

    private Date date;

    private CategoryDto category;

    private UserDto user;

    private Set<CommentDto> comments= new HashSet<>();
}
