package com.ccsw.tutorial.prestamo.model;

import com.ccsw.tutorial.author.model.Author;
import com.ccsw.tutorial.category.model.Category;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

/**
 * @author ccsw
 */
@Entity
@Table(name = "Prestamo")
public class Prestamo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "client", nullable = false)
    private String client;

    @Column(name = "prestamo_date", nullable = false)
    private LocalDate prestamo_date;

    @Column(name = "dev_date", nullable = false)
    private LocalDate dev_date;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public LocalDate getPrestamoDate() {
        return prestamo_date;
    }

    public void setPrestamoDate(LocalDate prestamo_date) {
        this.prestamo_date = prestamo_date;
    }

    public LocalDate getDevDate() {
        return dev_date;
    }

    public void setDevDate(LocalDate dev_date) {
        this.dev_date = dev_date;
    }
}
