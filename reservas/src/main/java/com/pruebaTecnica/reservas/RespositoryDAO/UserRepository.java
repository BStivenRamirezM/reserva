package com.pruebaTecnica.reservas.RespositoryDAO;
import com.pruebaTecnica.reservas.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    // Puedes agregar métodos personalizados aquí si es necesario
}