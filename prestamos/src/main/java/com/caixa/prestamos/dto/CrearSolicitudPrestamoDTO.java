package com.caixa.prestamos.dto;

import java.math.BigDecimal;

import lombok.Data;


public class CrearSolicitudPrestamoDTO {

    private String nombreSolicitante;
    private BigDecimal importeSolicitado;
    private String divisa;
    private String documentoIdentificativo;
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

    // Getters y setters
}

