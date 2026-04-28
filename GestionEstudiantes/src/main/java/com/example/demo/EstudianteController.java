package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class EstudianteController {

    @Autowired
    private EstudianteRepository estudianteRepository;

    // Listar con opción de búsqueda
    @GetMapping("/")
    public String listarEstudiantes(@RequestParam(name = "keyword", required = false) String keyword, Model model) {
        List<Estudiante> estudiantes;
        if (keyword != null && !keyword.isEmpty()) {
            estudiantes = estudianteRepository.findByNombreContainingIgnoreCase(keyword);
        } else {
            estudiantes = estudianteRepository.findAll();
        }
        
        model.addAttribute("estudiantes", estudiantes);
        model.addAttribute("estudiante", new Estudiante());
        model.addAttribute("keyword", keyword);
        return "index";
    }

    @PostMapping("/guardar")
    public String guardarEstudiante(@ModelAttribute("estudiante") Estudiante estudiante) {
        estudianteRepository.save(estudiante);
        return "redirect:/";
    }

    // Método para eliminar
    @GetMapping("/eliminar/{id}")
    public String eliminarEstudiante(@PathVariable("id") Long id) {
        estudianteRepository.deleteById(id);
        return "redirect:/";
    }
}