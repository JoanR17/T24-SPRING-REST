package SpringRest.T24.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import SpringRest.T24.dto.Empleado;

/**
 * 
 * @author JOAN
 *
 */
public interface IEmpleadoDAO extends JpaRepository<Empleado, Long> {

	public List<Empleado> findByTrabajo(String trabajo);
}
