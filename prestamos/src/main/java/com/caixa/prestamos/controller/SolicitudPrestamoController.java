package com.caixa.prestamos.controller;

import com.caixa.prestamos.dto.ActualizarEstadoDTO;
import com.caixa.prestamos.dto.CrearSolicitudPrestamoDTO;
import com.caixa.prestamos.model.SolicitudPrestamo;
import com.caixa.prestamos.service.SolicitudPrestamoService;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/solicitudes")
public class SolicitudPrestamoController {

    private final SolicitudPrestamoService service;

    public SolicitudPrestamoController(SolicitudPrestamoService service) {
        this.service = service;
    }

    @PostMapping
    public SolicitudPrestamo crear(@RequestBody CrearSolicitudPrestamoDTO dto) {

        SolicitudPrestamo solicitud = new SolicitudPrestamo(
                dto.getNombreSolicitante(),
                dto.getImporteSolicitado(),
                dto.getDivisa(),
                dto.getDocumentoIdentificativo()
        );

        return service.crear(solicitud);
    }

    @GetMapping
    public List<SolicitudPrestamo> listarTodas() {
        return service.listarTodas();
    }

    @GetMapping("/{id}")
    public SolicitudPrestamo buscarPorId(@PathVariable UUID id) {
        return service.buscarPorId(id);
    }

    @PatchMapping("/{id}/estado")
    public SolicitudPrestamo actualizarEstado(@PathVariable UUID id,
                                              @RequestBody ActualizarEstadoDTO dto) {
        return service.actualizarEstado(id, dto.getEstado());
    }
}
