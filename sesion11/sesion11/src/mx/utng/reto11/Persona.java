package mx.utng.reto11;

import java.time.LocalDate;

public class Persona {
        private String nombre;
        private byte edad;
        private final LocalDate fechaNacimiento;
    
        private Persona(String nombre, byte edad, LocalDate fechaNacimiento) {
            this.nombre = nombre;
            this.edad = edad;
            this.fechaNacimiento = fechaNacimiento;
        }
    }
    
    public class Empleado extends Persona {
        private float salario;
    
        private Empleado(String nombre, byte edad, LocalDate fechaNacimiento, float salario) {
            super(nombre, edad, fechaNacimiento);
            this.salario = salario;
        }
    }
    
    public class Programador extends Empleado {
        private String lenguajePrincipal;
    
        private Programador(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String lenguajePrincipal) {
            super(nombre, edad, fechaNacimiento, salario);
            this.lenguajePrincipal = lenguajePrincipal;
        }
    }
    
    public class DBA extends Empleado {
        private String herramientaConsultas;
    
        private DBA(String nombre, byte edad, LocalDate fechaNacimiento, float salario, String herramientaConsultas) {
            super(nombre, edad, fechaNacimiento, salario);
            this.herramientaConsultas = herramientaConsultas;
        }
    }
    
    

