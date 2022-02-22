package SpringRest.T24.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * 
 * @author JOAN
 *
 */
@Entity
@Table(name="empleado")
public class Empleado {

	//Atributos empleado
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column
	private String nombre;
	@Column
	private String trabajo;
	@Column
	private double salario;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecha;
	
	public Empleado() {
		
	}

	/**
	 * 
	 * @param id
	 * @param nombre
	 * @param trabajo
	 * @param salario
	 * @param fecha
	 */
	public Empleado(Long id, String nombre, String trabajo, double salario, Date fecha) 
	{
		this.id = id;
		this.nombre = nombre;
		this.trabajo = trabajo;
		this.salario = salario;
		this.fecha = fecha;
	}

	public Long getId() 
	{
		return id;
	}

	public void setId(Long id) 
	{
		this.id = id;
	}

	public String getNombre() 
	{
		return nombre;
	}

	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}

	public String getTrabajo() 
	{
		return trabajo;
	}

	public void setTrabajo(String trabajo) 
	{
		this.trabajo = trabajo;
	}

	public double getSalario() 
	{
		return salario;
	}

	public void setSalario(double salario) 
	{
		this.salario = salario;
	}

	public Date getFecha() 
	{
		return fecha;
	}

	public void setFecha(Date fecha) 
	{
		this.fecha = fecha;
	}

	@Override
	public String toString() 
	{
		return "Empleado [id=" + id + ", nombre=" + nombre + ", trabajo=" + trabajo + ", salario=" + salario
				+ ", fecha=" + fecha + "]";
	}
}
