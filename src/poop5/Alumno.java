/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poop5;

/**
 * Clase que guarda los datos de un alumno
 * @author Sara Alejandra Cardenas
 */
public class Alumno {
    public String nombre, apellido, carrera, escuela;
    private int semestre;
    private Fecha fNacimiento;

    /**
     * Constructor vacío
     */
    public Alumno() {
    }

    /**
     * 
     * @param nombre del alumno
     * @param apellido del alumno
     * @param carrera que cursa el alumno
     * @param escuela en la que se encuentra
     * @param semestre que cursa
     * @param fNacimiento fecha de nacimiento
     */
    public Alumno(String nombre, String apellido, String carrera, String escuela, int semestre, Fecha fNacimiento) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carrera = carrera;
        this.escuela = escuela;
        this.semestre = semestre;
        this.fNacimiento = fNacimiento;
    }
    
    /**
     * Getter
     * @return Nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Recibe como parametro un nombre de tipo String
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Getter
     * @return Apellido 
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * Recibe como parametro un apellido de tipo String
     * @param apellido 
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    /**
     * Getter
     * @return Carrera
     */
    public String getCarrera() {
        return carrera;
    }

    /**
     * Recibe como parametro el nombre de la carrera de tipo String
     * @param carrera 
     */
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    /**
     * Getter
     * @return Escuela a la que asiste el alumno
     */
    public String getEscuela() {
        return escuela;
    }

    /**
     * Recibe el parametro de la escuela a la que asiste de tipo String
     * @param escuela 
     */
    public void setEscuela(String escuela) {
        this.escuela = escuela;
    }

    /**
     *Getter 
     * @return semestre en que se encuentra
     */
    public int getSemestre() {
        return semestre;
    }

    /**
     * Recibe el parametro del semestre al que asiste de tipo int
     * @param semestre 
     */
    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    /**
     * Getter
     * @return su fecha de nacimiento
     */
    public Fecha getfNacimiento() {
        return fNacimiento;
    }

    /**
     * Recibe como parametro es su fecha de nacimiento tipo Fecha
     * @param fNacimiento 
     */
    public void setfNacimiento(Fecha fNacimiento) {
        this.fNacimiento = fNacimiento;
    }
    
    public void dormir(){
        System.out.println("zzzz...");          
    }
    
    public void comer(){
        System.out.println("mmmm...");          
    }
    
    public void estudiar(){
        System.out.println("estudiando...");          
    }
    
    public void trabajar(){
        System.out.println("Estoy trabajndo...");          
    }
    
    public void jugar(){
        System.out.println("Estoy jugando...");          
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", apellido=" + apellido + ", "
                + "carrera=" + carrera + ", escuela=" + escuela + ", semestre=" 
                + semestre + ", fNacimiento=" + fNacimiento + '}';
    }
    
    
}
