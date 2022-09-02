package com.ccsw.tutorial.loan.model;

import com.ccsw.tutorial.client.model.ClientDto;
import com.ccsw.tutorial.game.model.GameDto;

import java.time.LocalDate;

/**
 * @author ccsw
 */
public class LoanDto {

    private Long id;

    private GameDto game;

    private ClientDto client;

    private LocalDate loan_date;

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
     * @return game
     */
    public GameDto getGame() {
        return game;
    }

    /**
     *
     * @param game new value of {@link #getGame}.
     */
    public void setGame(GameDto game) {
        this.game = game;
    }

    /**
     *
     * @return client
     */
    public ClientDto getClient() {
        return client;
    }


    /**
     *
     * @param client new value of {@link #getClient}.
     */
    public void setClient(ClientDto client) {
        this.client = client;
    }

    /**
     * @return loan_date
     */
    public LocalDate getLoanDate() {
        return loan_date;
    }

    /**
     *
     * @param loan_date new value of {@link #getLoanDate}.
     */
    public void setLoanDate( LocalDate loan_date) {
        this.loan_date = loan_date;
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
