package com.blog.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "categories")
@NoArgsConstructor
@Getter
@Setter
public class Category {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Integer categoryId;

    @Column(name = "title",nullable = false)
    private String  categoryTitle;

    @Column(name = "description")
    private String categoryDescription;
}
