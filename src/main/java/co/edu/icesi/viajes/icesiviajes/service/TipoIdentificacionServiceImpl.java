package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.TipoIdentificacion;
import co.edu.icesi.viajes.icesiviajes.repository.TipoIdentificacionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class TipoIdentificacionServiceImpl implements TipoIdentificacionService{

    @Autowired
    private TipoIdentificacionRepository tipoIdentificacionRepository;
    @Override
    public List<TipoIdentificacion> findAll() {
        List<TipoIdentificacion> lstTipoIdentifiacion = tipoIdentificacionRepository.findAll();
        return lstTipoIdentifiacion;
    }

    @Override
    public Optional<TipoIdentificacion> findById(Integer integer) {
        return tipoIdentificacionRepository.findById(integer);
    }

    @Override
    public TipoIdentificacion save(TipoIdentificacion entity) throws Exception {
        return tipoIdentificacionRepository.save(entity);
    }

    @Override
    public TipoIdentificacion update(TipoIdentificacion entity) throws Exception {
        return tipoIdentificacionRepository.save(entity);
    }

    @Override
    public void delete(TipoIdentificacion entity) throws Exception {
        tipoIdentificacionRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        tipoIdentificacionRepository.deleteById(integer);
    }

    @Override
    public void validate(TipoIdentificacion entity) throws Exception {

    }

    @Override
    public Long count() {
        return tipoIdentificacionRepository.count();
    }
}
