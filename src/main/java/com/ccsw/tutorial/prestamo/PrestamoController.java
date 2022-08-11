package com.ccsw.tutorial.prestamo;

import com.ccsw.tutorial.prestamo.model.Prestamo;
import com.ccsw.tutorial.prestamo.model.PrestamoDto;
import com.devonfw.module.beanmapping.common.api.BeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;

/**
 * @author ccsw
 */
@RequestMapping(value = "/prestamo")
@RestController
@CrossOrigin(origins = "*")
public class PrestamoController {

    @Autowired
    PrestamoService prestamoService;

    @Autowired
    BeanMapper beanMapper;

    @RequestMapping(path = "", method = RequestMethod.GET)
    public List<PrestamoDto> find(@RequestParam(value = "id", required = false) Long id,
                                  @RequestParam(value = "title", required = false) String title,
                                  @RequestParam(value = "client", required = false) String client,
                                  @RequestParam(value = "prestamo_date", required = false) String prestamo_date,
                                  @RequestParam(value = "dev_Date", required = false) String devDate) {

        LocalDate date = null;

        if(!(prestamo_date == null))
            date = LocalDate.parse(prestamo_date);

        List<Prestamo> prestamos = prestamoService.find(title, client, date);
        return beanMapper.mapList(prestamos, PrestamoDto.class);
    }

    @RequestMapping(path = { "", "/{id}" }, method = RequestMethod.PUT)
    public void save(@PathVariable(name = "id", required = false) Long id, @RequestBody PrestamoDto dto) {
        this.prestamoService.save(id, dto);
    }

    @RequestMapping(path = {"/{id}" }, method = RequestMethod.DELETE)
    public void delete(@PathVariable(name = "id", required = false) Long id) {
        prestamoService.delete(id);
    }

}
