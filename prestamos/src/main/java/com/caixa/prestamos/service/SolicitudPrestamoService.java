package com.caixa.prestamos.service;

import org.springframework.stereotype.Service;

import com.caixa.prestamos.model.EstadoPrestamo;
import com.caixa.prestamos.model.SolicitudPrestamo;
import com.caixa.prestamos.repository.SolicitudPrestamoRepository;

import java.util.List;
import java.util.UUID;

@Service
public class SolicitudPrestamoService {

    private final SolicitudPrestamoRepository repository;

    public SolicitudPrestamoService(SolicitudPrestamoRepository repository) {
        this.repository = repository;
    }

    public SolicitudPrestamo crear(SolicitudPrestamo solicitud) {
        return repository.guardar(solicitud);
    }

    public List<SolicitudPrestamo> listarTodas() {
        return repository.buscarTodas();
    }

    public SolicitudPrestamo buscarPorId(UUID id) {
        return repository.buscarPorId(id)
                .orElseThrow(() -> new RuntimeException("Solicitud no encontrada"));
    }

    public SolicitudPrestamo actualizarEstado(UUID id, EstadoPrestamo nuevoEstado) {

        SolicitudPrestamo solicitud = buscarPorId(id);

        validarTransicion(solicitud.getEstado(), nuevoEstado);

        solicitud.setEstado(nuevoEstado);

        return repository.guardar(solicitud);
    }

    private void validarTransicion(EstadoPrestamo actual, EstadoPrestamo siguiente) {

        if (actual == EstadoPrestamo.PENDIENTE &&
                (siguiente == EstadoPrestamo.APROBADA || siguiente == EstadoPrestamo.RECHAZADA)) {
            return;
        }

        if (actual == EstadoPrestamo.APROBADA &&
                siguiente == EstadoPrestamo.CANCELADA) {
            return;
        }

        throw new IllegalStateException("Transición de estado no permitida");
    }
}
