/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poop5;

/**
 *
 * @author Sara Alejandra Cardenas
 */
public class POOP5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Alumno alumno = new Alumno();
        alumno.setNombre("Fer");
        alumno.setApellido("Gutierrez");
        Fecha fecha = new Fecha(29,9,2023);
        Alumno alu2 = new Alumno("Xuri", "Lopez","Arquitectura", "UNAM", 4, fecha);
        String var = alumno.toString();
        System.out.println(var);
        System.out.println(alumno.toString());
        System.out.println(alu2);
             
    }   
}
