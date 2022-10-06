
package com.example.Ltiravanti.service;

import com.example.Ltiravanti.entity.Libro;
import java.util.List;

public interface LibroService {
    
    public List<Libro> findAll();

    public Libro findById(Long id);

    public Libro save(Libro libro);

    public void delete(Libro libro);

    public void deleteById(Long id);
}
