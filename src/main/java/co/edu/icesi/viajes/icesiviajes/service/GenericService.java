package co.edu.icesi.viajes.icesiviajes.service;

import java.util.*;

public interface GenericService<T, ID> {
    public List<T> findAll();
    public Optional<T> findById(ID id);
    public T save(T entity) throws Exception;
    public T update(T entity)throws Exception;
    public void delete(T entity)throws Exception;
    public void deleteById(ID id)throws Exception;
    public void validate(T entity)throws Exception;
    public Long count();
}
