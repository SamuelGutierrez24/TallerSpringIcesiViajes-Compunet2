package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.DetallePlan;
import co.edu.icesi.viajes.icesiviajes.domain.Plan;
import co.edu.icesi.viajes.icesiviajes.repository.DetallePlanRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class DetallePlanServiceImpl implements DetallePlanService {

    @Autowired
    private DetallePlanRepository detallePlanRepository;

    @Override
    public List<DetallePlan> findAll() {
        List<DetallePlan> lstDetallePlan = detallePlanRepository.findAll();
        return lstDetallePlan;
    }

    @Override
    public Optional<DetallePlan> findById(Integer integer) {
        return detallePlanRepository.findById(integer);
    }

    @Override
    public DetallePlan save(DetallePlan entity) throws Exception {
        return detallePlanRepository.save(entity);
    }

    @Override
    public DetallePlan update(DetallePlan entity) throws Exception {
        return detallePlanRepository.save(entity);
    }

    @Override
    public void delete(DetallePlan entity) throws Exception {
        detallePlanRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        detallePlanRepository.deleteById(integer);
    }

    @Override
    public void validate(DetallePlan entity) throws Exception {

    }

    @Override
    public Long count() {
        return detallePlanRepository.count();
    }
}
