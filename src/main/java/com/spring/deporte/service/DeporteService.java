package com.spring.deporte.service;

import com.spring.deporte.domain.Deporte;
import lombok.AccessLevel;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@FieldDefaults(level = AccessLevel.PRIVATE)
public class DeporteService {

    List<Deporte> deportes = new ArrayList<>() {{
        add(new Deporte("natacion", "easy"));
        add(new Deporte("natacion", "intermedio"));
        add(new Deporte("natacion", "profesional"));
        add(new Deporte("basquet", "easy"));
        add(new Deporte("voley", "intermedio"));
        add(new Deporte("gim", "profesional"));
    }};

    public Optional<Deporte> buscarPorNombre(String nombre){
        return this.deportes.stream()
                .filter(deporte -> deporte.getNombre().equals(nombre))
                .findFirst();
    }

    public List<Deporte> todosLosDeportes(){
        return this.deportes;
    }

}
