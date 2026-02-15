package com.caixa.prestamos.dto;

import com.caixa.prestamos.model.EstadoPrestamo;

import lombok.Data;


public class ActualizarEstadoDTO {

    public EstadoPrestamo getEstado() {
		return estado;
	}

	public void setEstado(EstadoPrestamo estado) {
		this.estado = estado;
	}

	private EstadoPrestamo estado;

}
