package com.caixa.prestamos.repository;

import org.springframework.stereotype.Repository;

import com.caixa.prestamos.model.SolicitudPrestamo;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

@Repository
public class SolicitudPrestamoRepository {

    private final Map<UUID, SolicitudPrestamo> almacenamiento = new ConcurrentHashMap<>();

    public SolicitudPrestamo guardar(SolicitudPrestamo solicitud) {
        almacenamiento.put(solicitud.getId(), solicitud);
        return solicitud;
    }

    public Optional<SolicitudPrestamo> buscarPorId(UUID id) {
        return Optional.ofNullable(almacenamiento.get(id));
    }

    public List<SolicitudPrestamo> buscarTodas() {
        return new ArrayList<>(almacenamiento.values());
    }
}

