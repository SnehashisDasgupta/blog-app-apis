package com.blog.payloads;

import com.blog.entities.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.*;

import java.util.Date;

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
}
