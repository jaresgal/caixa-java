package com.caixa.prestamos.config;

import com.caixa.prestamos.model.SolicitudPrestamo;
import com.caixa.prestamos.repository.SolicitudPrestamoRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;

@Configuration
public class DatosInicialesConfig implements CommandLineRunner {

    private final SolicitudPrestamoRepository repository;

    public DatosInicialesConfig(SolicitudPrestamoRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... args) {

        SolicitudPrestamo s1 = new SolicitudPrestamo(
                "Juan Pérez",
                new BigDecimal("10000"),
                "EUR",
                "12345678A"
        );

        SolicitudPrestamo s2 = new SolicitudPrestamo(
                "Ana López",
                new BigDecimal("25000"),
                "EUR",
                "87654321B"
        );

        SolicitudPrestamo s3 = new SolicitudPrestamo(
                "Carlos García",
                new BigDecimal("5000"),
                "USD",
                "11223344C"
        );

        repository.guardar(s1);
        repository.guardar(s2);
        repository.guardar(s3);

        System.out.println("Datos de prueba cargados correctamente");
    }
}

