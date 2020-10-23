/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mascotas.controladores;

import com.fcastillo.mascotas.entidades.Tipo;
import com.fcastillo.mascotas.repositorios.TipoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcastillo
 */
@RestController
public class TipoController {

  @Autowired
  TipoRepository tipoRepository;

  @GetMapping("/tipo")
  public List<Tipo> findAll() {
    return tipoRepository.findAll();
  }

}
