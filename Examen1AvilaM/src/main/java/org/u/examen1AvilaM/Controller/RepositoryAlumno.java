/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package org.u.examen1AvilaM.Controller;

/**
 *
 * @author Ivan
 */
import org.springframework.data.jpa.repository.JpaRepository;



public interface RepositoryAlumno extends JpaRepository<Alumno, Long>  {
    
}
