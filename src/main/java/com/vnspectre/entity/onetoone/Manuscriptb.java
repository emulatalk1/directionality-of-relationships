package com.vnspectre.entity.onetoone;

import javax.persistence.*;

//This is Bidirectional One to One
@Entity
@Table(name = "manuscriptb")
public class Manuscriptb {

    private Long id;
    private String file;
    private Bookb bookb;

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
    @JoinColumn(name = "fk_bookb")
    public Bookb getBookb() {

        return bookb;
    }


    public void setBookb(Bookb bookb) {
        this.bookb = bookb;
    }
}
