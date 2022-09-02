package com.ccsw.tutorial.loan;

import com.ccsw.tutorial.client.ClientService;
import com.ccsw.tutorial.game.GameService;
import com.ccsw.tutorial.loan.model.Loan;
import com.ccsw.tutorial.loan.model.LoanDto;
import com.ccsw.tutorial.loan.model.LoanSearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.Date;
import java.util.List;

/**
 * @author ccsw
 */
@Service
@Transactional
public class LoanServiceImpl implements LoanService {

    @Autowired
    LoanRepository loanRepository;

    @Autowired
    GameService gameService;

    @Autowired
    ClientService clientService;

    /**
     * {@inheritDoc}
     */
    @Override
    public Loan get(Long id) {

        return this.loanRepository.findById(id).orElse(null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Loan> find(Long game_id, Long client_id, LocalDate loanDate) {

        return this.loanRepository.find(game_id, client_id, loanDate);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Page<Loan> findPage(LoanSearchDto dto){
        return this.loanRepository.findAll(dto.getPageable());
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Long id, LoanDto dto) {
        Loan loan = null;

        if (id == null)
            loan = new Loan();
        else
            loan = this.get(id);

        if(dto.getGame() != null && dto.getClient() != null && dto.getLoanDate() != null && dto.getDevDate() != null){
            loan.setGame(gameService.get(dto.getGame().getId()));
            loan.setClient(clientService.get(dto.getClient().getId()));
            loan.setLoanDate(dto.getLoanDate());
            loan.setDevDate(dto.getDevDate());
            this.loanRepository.save(loan);
        }
    }

    public void delete(Long id){
        this.loanRepository.deleteById(id);
    }


}
