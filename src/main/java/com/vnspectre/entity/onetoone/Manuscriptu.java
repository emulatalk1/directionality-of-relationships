package com.vnspectre.entity.onetoone;

import javax.persistence.*;

//This is undirectional one - one
@Entity
@Table(name = "Manuscriptu")
public class Manuscriptu {

    private Long id;
    private String file;
    private Booku booku;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", updatable = false, nullable = false)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFile() {
        return file;
    }

    public void setFile(String file) {
        this.file = file;
    }

    @OneToOne
    @JoinColumn(name = "fk_ubook")
    public Booku getBooku() {
        return booku;
    }

    public void setBooku(Booku booku) {
        this.booku = booku;
    }
}
