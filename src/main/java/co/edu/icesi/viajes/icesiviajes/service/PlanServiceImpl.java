package co.edu.icesi.viajes.icesiviajes.service;

import co.edu.icesi.viajes.icesiviajes.domain.Plan;
import co.edu.icesi.viajes.icesiviajes.repository.PlanRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class PlanServiceImpl implements PlanService {

    @Autowired
    private PlanRepository planRepository;
    @Override
    public List<Plan> findAll() {
        List<Plan> lstPlan = planRepository.findAll();
        return lstPlan;
    }

    @Override
    public Optional<Plan> findById(Integer integer) {
        return planRepository.findById(integer);
    }

    @Override
    public Plan save(Plan entity) throws Exception {
        return planRepository.save(entity);
    }

    @Override
    public Plan update(Plan entity) throws Exception {
        return planRepository.save(entity);
    }

    @Override
    public void delete(Plan entity) throws Exception {
        planRepository.delete(entity);
    }

    @Override
    public void deleteById(Integer integer) throws Exception {
        planRepository.deleteById(integer);
    }

    @Override
    public void validate(Plan entity) throws Exception {

    }

    @Override
    public Long count() {
        return planRepository.count();
    }
}
