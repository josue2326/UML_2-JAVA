/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Class;

import java.util.ArrayList;

/**
 *
 * @author josue
 */
public class Curso {
    private String nombre;
    private String titular;
    private ArrayList<String> estudiantes;

    public Curso() {
    }

    public Curso(String nombre, String titular, ArrayList<String> estudiantes) {
        this.nombre = nombre;
        this.titular = titular;
        this.estudiantes = estudiantes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public ArrayList<String> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<String> estudiantes) {
        this.estudiantes = estudiantes;
    }
    
    
}
