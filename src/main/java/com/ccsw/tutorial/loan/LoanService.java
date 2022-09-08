package com.ccsw.tutorial.loan;

import com.ccsw.tutorial.author.AuthorService;
import com.ccsw.tutorial.author.model.AuthorSearchDto;
import com.ccsw.tutorial.category.CategoryService;
import com.ccsw.tutorial.client.ClientService;
import com.ccsw.tutorial.game.GameService;
import com.ccsw.tutorial.loan.model.Loan;
import com.ccsw.tutorial.loan.model.LoanDto;
import com.ccsw.tutorial.loan.model.LoanSearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * @author ccsw
 */
public interface LoanService {

    Loan get(Long id);
    /**
     * Recupera los juegos filtrando opcionalmente por título y/o categoría
     * @param game_id
     * @param client_id
     * @param loanDate
     * @return
     */
    List<Loan> find(Long game_id, Long client_id, LocalDate loanDate);

    Page<Loan> findPage(Long game_id, Long client_id, Date loanDate, LoanSearchDto dto);

    /**
     * Guarda o modifica un juego, dependiendo de si el id está o no informado
     * @param id
     * @param dto
     */
    void save(Long id, LoanDto dto);

    void delete(Long id);

}
