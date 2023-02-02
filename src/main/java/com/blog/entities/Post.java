package com.blog.entities;

import jakarta.persistence.*;
import lombok.*;

import java.util.*;

@Entity
@Table(name = "post")
@Getter
@Setter
@NoArgsConstructor
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer postId;

    @Column(name = "post_name", nullable = false)
    private String title;
    private String content;
    private String imageName;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "category_id")
    private Category category;

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "post",cascade = CascadeType.ALL)
    private Set<Comment> comments= new HashSet<>();
}
