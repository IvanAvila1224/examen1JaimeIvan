/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.uv.project04;

/**
 *
 * @author chris
 */
public class Project04 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        DAOEmpleado DAOEmpleado=new DAOEmpleado();
        Empleado emp= new Empleado();
        emp.setClave(02);
        emp.setNombre("Ivan Avila");
        emp.setDireccion("AV 1");
        emp.setTelefono("1661438162");
        
        DAOEmpleado.create(emp);
    }
}
