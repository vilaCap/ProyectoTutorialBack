package com.ccsw.tutorial.loan;

import com.ccsw.tutorial.game.model.Game;
import com.ccsw.tutorial.loan.model.Loan;
import com.ccsw.tutorial.loan.model.LoanDto;
import com.ccsw.tutorial.loan.model.LoanSearchDto;
import com.ccsw.tutorial.config.mapper.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.data.domain.Page;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/**
 * @author ccsw
 */
@RequestMapping(value = "/loan")
@RestController
@CrossOrigin(origins = "*")
public class LoanController {

    @Autowired
    LoanService loanService;

    @Autowired
    BeanMapper beanMapper;

    @RequestMapping(path = "", method = RequestMethod.POST)
    public Page<LoanDto> findPage(@RequestParam(value = "game_id", required = false) Long game,
                                  @RequestParam(value = "client_id", required = false) Long client,
                                  @RequestParam(value = "loan_date", required = false) Date loanDate,
                                  @RequestBody LoanSearchDto dto) {

        return this.beanMapper.mapPage(this.loanService.findPage(game, client, loanDate, dto), LoanDto.class);
    }

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<LoanDto> find(@RequestParam(value = "game_id", required = false) Long game,
                              @RequestParam(value = "client_id", required = false) Long client,
                              @RequestParam(value = "loan_date", required = false) Date loanDate) {
        LocalDate date = null;

        if(loanDate != null) {
            date = loanDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }

        List<Loan> loans = loanService.find(game, client, date);
        return beanMapper.mapList(loans, LoanDto.class);
    }

    @RequestMapping(path = "/find", method = RequestMethod.POST)
    public List<LoanDto> findSearch(@RequestParam(value = "game_id", required = false) Long game,
                              @RequestParam(value = "client_id", required = false) Long client,
                              @RequestParam(value = "loan_date", required = false) Date loanDate) {
        LocalDate date = null;

        if(loanDate != null) {
            date = loanDate.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        }

        List<Loan> loans = loanService.find(game, client, date);
        return beanMapper.mapList(loans, LoanDto.class);
    }

    @RequestMapping(path = { "", "/{id}" }, method = RequestMethod.PUT)
    public void save(@PathVariable(name = "id", required = false) Long id, @RequestBody LoanDto dto) {
        this.loanService.save(id, dto);
    }

    @RequestMapping(path = {"/{id}" }, method = RequestMethod.DELETE)
    public void delete(@PathVariable(name = "id", required = false) Long id) {
        loanService.delete(id);
    }

}
