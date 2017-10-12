package com.vnspectre.entity.manytomany;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "author")
public class Author {

    private Long id;
    private String name;
    private String address;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

}
