package SpringRest.T24.service;

import java.util.List;

import SpringRest.T24.dto.Empleado;

/**
 * 
 * @author JOAN
 *
 */
public interface IEmpleadoService {
	
	public List<Empleado> listarEmpleados();

	public Empleado guardarEmpleado(Empleado empleado);
	
	public Empleado empleadoXID(Long id);
	
	public List<Empleado> listarEmpleadosTrabajo(String trabajo);
	
	public Empleado actualizarEmpleado(Empleado empleado);
	
	public void eliminarEmpleado(Long id);
}
