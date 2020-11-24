package bean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {

	
	private String id;
	private String name;
	private String role;
	private int age;
	
	public Employee() {
		super();
	}
	
	public Employee(String id, String name, String role, int age) {
		super();
		this.id = id;
		this.name = name;
		this.role = role;
		this.age = age;
	}


	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static Map<Integer, Employee> empleados;
	
	static {
		empleados = new HashMap<Integer, Employee>();
		empleados.put(0, new Employee("0", "Gerardo", "empleado", 20));
		empleados.put(1, new Employee("1", "Gustavo", "empleado", 20));
		empleados.put(2, new Employee("2", "Hernando", "empleado", 20));
		empleados.put(3, new Employee("3", "Alberto", "empleado", 20));
		empleados.put(4, new Employee("4", "Hernán", "empleado", 20));
		empleados.put(5, new Employee("5", "Fabio", "empleado", 20));
		empleados.put(6, new Employee("6", "María", "empleado", 20));
		empleados.put(7, new Employee("7", "Isabel", "jefa", 20));
	}
	
	public Employee obtenerEmpleado(int id) {
		Employee empleado = null;
		
		empleado = Employee.empleados.get(id);
		
		return empleado;
		
	}
	
	public static List<Employee> getEmployees() {
		List<Employee> listaEmpleados = new ArrayList<Employee>();
		Employee empleado = null;
		
		for(int i=0; i < empleados.size(); i++){
			empleado = empleados.get(i);
			
			if(empleado != null) {
				listaEmpleados.add(empleado);
			}
		}
		return listaEmpleados;
	}
}
