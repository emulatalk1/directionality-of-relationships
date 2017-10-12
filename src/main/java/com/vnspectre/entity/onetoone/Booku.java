package com.vnspectre.entity.onetoone;

import javax.persistence.*;

//This is undirectional one - one
@Entity
@Table(name = "booku")
public class Booku {

    private Long id;
    private int version;
    private String title;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
