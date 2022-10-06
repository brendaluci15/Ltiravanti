/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Ltiravanti.controller;

import com.example.Ltiravanti.entity.Editorial;
import com.example.Ltiravanti.service.EditorialService;
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

/**
 *
 * @author Brenda Tiravanti
 */
@RestController
@RequestMapping("/editorial")
@Api(value = "Microservicio de editoriales", description = "Microservicio de Editoriales")
public class EditorialController {

    @Autowired
    EditorialService editorialService;

    @ApiOperation(value = "Lista de Editoriales")
    @GetMapping
    public List<Editorial> findAll() {
        return editorialService.findAll();
    }

    @ApiOperation(value = "Lista un Editorial")
    @GetMapping(value = "/{id}")
    public ResponseEntity<Editorial> findById(@PathVariable Long id) {
        Editorial editorial = editorialService.findById(id);
        return ResponseEntity.ok(editorial);
    }

    @ApiOperation(value = "Crea un Editorial")
    @PostMapping
    public Editorial save(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);
    }

    @ApiOperation(value = "Elimina un Editorial")
    @DeleteMapping(value = "/{id}")
    public void deleteById(@PathVariable Long id) {
        editorialService.deleteById(id);
    }
@ApiOperation(value="Modifica Editorial")
    @PutMapping("/update")
    public Editorial update(@RequestBody Editorial editorial) {
        return editorialService.save(editorial);
    }

}

