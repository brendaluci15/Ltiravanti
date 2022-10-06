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
import javax.persistence.Table;
import lombok.Data;

/**
 *
 * @author Brenda Tiravanti
 */
@Data
@Entity
@Table(name = "persona")
public class Editorial {

    @Id
    @Column(name = "Edit_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long persId;

    @Column(name = "edit_Estilo")
    private String editEstilo;

    @Column(name = "edit_Estructura")
    private String editEstructura;

    @Column(name = "edit_Indice")
    private String editIndice;


}

