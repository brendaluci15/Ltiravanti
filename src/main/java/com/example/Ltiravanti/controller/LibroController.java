/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Ltiravanti.controller;

import com.example.Ltiravanti.entity.Libro;
import com.example.Ltiravanti.service.LibroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/libro")
@Api(value = "Libro", description ="Libro")
public class LibroController {

    @Autowired
    private LibroService libroService;

    @ApiOperation(value="Lista de libros")
    @GetMapping("/all")
    public List<Libro> findAll() {
        return libroService.findAll();
    }

    @ApiOperation(value="Paginas de un libro")
    @GetMapping("/{id}")
    public ResponseEntity<Libro> findById(@PathVariable Long id) {
        Libro libro = libroService.findById(id);
        return ResponseEntity.ok(libro);
    }

    @ApiOperation(value="Elimina libro")
    @DeleteMapping("/{id}")
    public void deleteById(@PathVariable Long id) {
        libroService.deleteById(id);
    }

    @ApiOperation(value="Crea libro")
    @PostMapping("/save")
    public Libro save(@RequestBody Libro libro) {
        return libroService.save(libro);
    }

    @ApiOperation(value="Modifica libro")
    @PutMapping("/update")
    public Libro update(@RequestBody Libro libro) {
        return libroService.save(libro);
    }
}
