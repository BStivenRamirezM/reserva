package com.pruebaTecnica.reservas.RespositoryDAO;
import com.pruebaTecnica.reservas.Entity.Servicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ServicioRepository extends JpaRepository<Servicio, Long> {

}
