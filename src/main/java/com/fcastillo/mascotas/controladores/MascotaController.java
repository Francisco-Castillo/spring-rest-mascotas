/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mascotas.controladores;

import com.fcastillo.mascotas.entidades.Mascota;
import com.fcastillo.mascotas.repositorios.MascotaRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author fcastillo
 */
@RestController
@RequestMapping("/mascotas")
public class MascotaController {

  @Autowired
  private MascotaRepository mascotaRepository;
  
  @GetMapping("")
  List<Mascota> findAll(){
    return mascotaRepository.findAll();
  }

}
