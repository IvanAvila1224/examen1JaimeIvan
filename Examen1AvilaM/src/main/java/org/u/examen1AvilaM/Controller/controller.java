/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.u.examen1AvilaM.Controller;

/**
 *
 * @author Ivan
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")
public class controller {

    @Autowired
    private RepositoryAlumno repositoryAlumno;

    @GetMapping("/msg")
    public String holamundo(){
        return "Hola mundo";
    }
    
    @GetMapping("/{id}")
    public Alumno obtenerAlumno(@PathVariable("id") long id) {
        Optional<Alumno> optionalAlumno= repositoryAlumno.findById(id);
        if (optionalAlumno.isPresent()) {
            Alumno alumno = optionalAlumno.get();
            return alumno;
        } else {
            return null;
        }
    }

    @GetMapping
    public List<Alumno> obtenerTodosLosAlumnos() {
        List<Alumno> alumnos = (List<Alumno>) repositoryAlumno.findAll();

        return alumnos;
    }

    @PostMapping
    public Alumno crearAlumno(@RequestBody DTOAlumno alumnoDTO) {
        Alumno alumno = new Alumno();
        Alumno.setNombre(alumnoDTO.getNombre());
        Alumno.setDireccion(alumnoDTO.getDireccion());
        Alumno.setTelefono(alumnoDTO.getTelefono());

        Alumno alumnoNuevo = repositoryAlumno.save(alumno);

        return alumnoNuevo;
    }

    @PutMapping("/{id}")
    public Alumno actualizarAlumno(@PathVariable("id") Long id, @RequestBody DTOAlumno alumnoDTO) {
        Optional<Alumno> optionalAlumno = repositoryAlumno.findById(id);
        if (optionalAlumno.isPresent()) {
            Alumno alumno = optionalAlumno.get();
            Alumno.setNombre(alumnoDTO.getNombre());
            Alumno.setDireccion(alumnoDTO.getDireccion());
            alumno.setTelefono(alumnoDTO.getTelefono());

            Alumno alumnoActualizado = repositoryAlumno.save(alumno);

            return alumnoActualizado;
        } else {
            return null;
        }
    }

    @DeleteMapping("/{id}")
    public void eliminarAlumno(@PathVariable("id") Long id) {
        repositoryAlumno.deleteById(id);
    }
    
}
