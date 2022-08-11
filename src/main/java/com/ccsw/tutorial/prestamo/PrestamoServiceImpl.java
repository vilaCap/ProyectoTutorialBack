package com.ccsw.tutorial.prestamo;

import com.ccsw.tutorial.prestamo.model.Prestamo;
import com.ccsw.tutorial.prestamo.model.PrestamoDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.List;

/**
 * @author ccsw
 */
@Service
@Transactional
public class PrestamoServiceImpl implements PrestamoService {

    @Autowired
    PrestamoRepository prestamoRepository;

    /**
     * {@inheritDoc}
     */
    @Override
    public Prestamo get(Long id) {

        return this.prestamoRepository.findById(id).orElse(null);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<Prestamo> find(String title, String client, LocalDate prestamo_date) {

        return this.prestamoRepository.find(title, client, prestamo_date);
    }


    /**
     * {@inheritDoc}
     */
    @Override
    public void save(Long id, PrestamoDto dto) {
        Prestamo prestamo = null;

        if (id == null)
            prestamo = new Prestamo();
        else
            prestamo = this.get(id);

        prestamo.setTitle(dto.getTitle());
        prestamo.setClient(dto.getClient());
        prestamo.setPrestamoDate(dto.getPrestamoDate());
        prestamo.setDevDate(dto.getDevDate());
        this.prestamoRepository.save(prestamo);
    }

    public void delete(Long id){
        this.prestamoRepository.deleteById(id);
    }


}
