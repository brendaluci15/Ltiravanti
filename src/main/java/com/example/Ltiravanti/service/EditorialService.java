/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.example.Ltiravanti.service;

import com.example.Ltiravanti.entity.Editorial;
import java.util.List;

/**
 *
 * @author Brenda Tiravanti
 */
public interface EditorialService {

    public List<Editorial> findAll();

    public Editorial findById(Long id);

    public Editorial save(Editorial editorial);

    public void delete(Editorial editorial);

    public void deleteById(Long id);
}