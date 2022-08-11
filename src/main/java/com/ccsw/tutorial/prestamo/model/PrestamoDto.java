package com.ccsw.tutorial.prestamo.model;

import java.time.LocalDate;
import java.util.Date;

/**
 * @author ccsw
 */
public class PrestamoDto {

    private Long id;

    private String title;

    private String client;

    private LocalDate prestamo_date;

    private LocalDate dev_date;


    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id new value of {@link #getId}.
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @param title new value of {@link #getTitle}.
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @return client
     */
    public String getClient() {
        return client;
    }


    /**
     *
     * @param client new value of {@link #getClient}.
     */
    public void setClient(String client) {
        this.client = client;
    }

    /**
     * @return prestamo_date
     */
    public LocalDate getPrestamoDate() {
        return prestamo_date;
    }

    /**
     *
     * @param prestamo_date new value of {@link #getPrestamoDate}.
     */
    public void setPrestamoDate( LocalDate prestamo_date) {
        this.prestamo_date = prestamo_date;
    }

    /**
     *
     * @return dev_date
     */
    public LocalDate getDevDate() {
        return dev_date;
    }

    /**
     *
     * @param dev_date new value of {@link #getDevDate}.
     */
    public void setDevDate( LocalDate dev_date) {
        this.dev_date = dev_date;
    }
}
