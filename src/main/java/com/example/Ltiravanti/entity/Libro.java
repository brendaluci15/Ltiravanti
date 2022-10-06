/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.example.Ltiravanti.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "Libro")
public class Libro {
// 6
    @Id
    @Column(name = "libro_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long libroId;

    @Column(name = "libro_nombre")
    private String prodNombre;

    @Column(name = "libro_introduccion")
    private String libroIntroduccion;

    @Column(name = "libro_estructura")
    private String libroEstructura;

    @Column(name = "libro_pagina")
    private String libroPagina;

    @Column(name = "libro_portada")
    private String libroPortada;

    @ManyToOne //De muchos a uno
    @JoinColumn(name = "cate_id")
    private Libro libro;
}



