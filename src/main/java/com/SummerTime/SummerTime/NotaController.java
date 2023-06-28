package com.SummerTime.SummerTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/notas")
public class NotaController {

    private final NotaRepository notaRepository;

    @Autowired
    public NotaController(NotaRepository notaRepository) {
        this.notaRepository = notaRepository;
    }

    @GetMapping
    public List<Nota> getAllNotas() {
        return notaRepository.findAll();
    }

    @GetMapping("/{id}")
    public Nota getNotaById(@PathVariable int id) {
        return notaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Nota no encontrada con ID: " + id));
    }

    @PostMapping
    public Nota createNota(@RequestBody Nota nota) {
        return notaRepository.save(nota);
    }

    @PutMapping("/{id}")
    public Nota updateNota(@PathVariable int id, @RequestBody Nota notaDetails) {
        Nota nota = notaRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Nota no encontrada con ID: " + id));

        nota.setTitulo(notaDetails.getTitulo());
        nota.setTextoNota(notaDetails.getTextoNota());

        return notaRepository.save(nota);
    }

    @DeleteMapping("/{id}")
    public void deleteNota(@PathVariable int id) {
        notaRepository.deleteById(id);
    }
}
