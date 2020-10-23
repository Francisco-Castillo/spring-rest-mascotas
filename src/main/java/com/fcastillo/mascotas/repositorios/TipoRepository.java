/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fcastillo.mascotas.repositorios;

import com.fcastillo.mascotas.entidades.Tipo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author fcastillo
 */
public interface TipoRepository extends JpaRepository<Tipo, Integer>{
  
}
