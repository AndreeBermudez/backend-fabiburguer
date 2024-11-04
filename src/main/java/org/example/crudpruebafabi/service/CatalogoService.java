package org.example.crudpruebafabi.service;

import org.example.crudpruebafabi.model.Catalogo;
import org.example.crudpruebafabi.repository.CatalogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CatalogoService {

    @Autowired
    private CatalogoRepository catalogoRepository;

    public List<Catalogo> listarCatalogos() {
        return catalogoRepository.findAll();
    }

    public Optional<Catalogo> obtenerCatalogoPorId(Long idCatalogo) {
        return catalogoRepository.findById(idCatalogo);
    }

    public Catalogo guardarCatalogo(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }

    public void eliminarCatalogo(Long idCatalogo) {
        catalogoRepository.deleteById(idCatalogo);
    }

    public Catalogo actualizarCatalogo(Catalogo catalogo) {
        return catalogoRepository.save(catalogo);
    }
}