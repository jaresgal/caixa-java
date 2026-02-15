package com.caixa.prestamos.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

import lombok.Data;


public class SolicitudPrestamo {

    private UUID id;
    private String nombreSolicitante;
    private BigDecimal importeSolicitado;
    private String divisa;
    private String documentoIdentificativo;
    private LocalDateTime fechaCreacion;
    private EstadoPrestamo estado;

    public SolicitudPrestamo(String nombreSolicitante,
                             BigDecimal importeSolicitado,
                             String divisa,
                             String documentoIdentificativo) {
        this.id = UUID.randomUUID();
        this.nombreSolicitante = nombreSolicitante;
        this.importeSolicitado = importeSolicitado;
        this.divisa = divisa;
        this.documentoIdentificativo = documentoIdentificativo;
        this.fechaCreacion = LocalDateTime.now();
        this.estado = EstadoPrestamo.PENDIENTE;
    }

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getNombreSolicitante() {
		return nombreSolicitante;
	}

	public void setNombreSolicitante(String nombreSolicitante) {
		this.nombreSolicitante = nombreSolicitante;
	}

	public BigDecimal getImporteSolicitado() {
		return importeSolicitado;
	}

	public void setImporteSolicitado(BigDecimal importeSolicitado) {
		this.importeSolicitado = importeSolicitado;
	}

	public String getDivisa() {
		return divisa;
	}

	public void setDivisa(String divisa) {
		this.divisa = divisa;
	}

	public String getDocumentoIdentificativo() {
		return documentoIdentificativo;
	}

	public void setDocumentoIdentificativo(String documentoIdentificativo) {
		this.documentoIdentificativo = documentoIdentificativo;
	}

	public LocalDateTime getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(LocalDateTime fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public EstadoPrestamo getEstado() {
		return estado;
	}

	public void setEstado(EstadoPrestamo estado) {
		this.estado = estado;
	}

    
}
