/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import empleados.Aplicacion;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Páez
 */
public class DatosEmpleados {
  public static void main(String[] args) {

        Aplicacion employee1=new Aplicacion("Yaneth Beltran",38,"Cra. 1B N° 47-64",5869545);
        Aplicacion employee2=new Aplicacion("Albeiro Paez",45,"Calle Bicentenario N° 5-18",8475623);
        Aplicacion employee3=new Aplicacion("David Paez",25,"Cra. 3 N° 5-45",5689746);
        Aplicacion employee4=new Aplicacion("Paula Arias",25,"Calle 4 N° 6-27",8475555);
        Aplicacion employee5=new Aplicacion("Duban Castillo",21,"Cra. 2E N° 8a-53",7458686);
       
        int opcion;
         
            opcion=Integer.parseInt(JOptionPane.showInputDialog("Información Empleados \n Digite el numero del empleado del cual desea imprimir la información \n 1). Empleado 1 \n 2). Empleado 2 \n 3). Empleado 3 \n 4). Empleado 4 \n 5). Empleado 5 \n 0). Salir \n "));
            
            switch(opcion){
            
                case 0: break;
                
                case 1: JOptionPane.showMessageDialog(null," Nombre: " +employee1.getName() +"\n Edad: " +employee1.getAge() +"\n Direccion: " +employee1.getAddress() +"\n Número telefónico: " +employee1.getNumberPhone());
                break;
                
                case 2: JOptionPane.showMessageDialog(null," Nombre: " +employee2.getName() +"\n Edad: " +employee2.getAge() +"\n Direccion: " +employee2.getAddress() +"\n Número telefónico: " +employee2.getNumberPhone());
                break;
                
                case 3: JOptionPane.showMessageDialog(null," Nombre: " +employee3.getName() +"\n Edad: " +employee3.getAge() +"\n Direccion: " +employee3.getAddress() +"\n Número telefónico: " +employee3.getNumberPhone());
                break;
                
                case 4: JOptionPane.showMessageDialog(null," Nombre: " +employee4.getName() +"\n Edad: " +employee4.getAge() +"\n Direccion: " +employee4.getAddress() +"\n Número telefónico: " +employee4.getNumberPhone());
                break;
                
                case 5: JOptionPane.showMessageDialog(null," Nombre: " +employee5.getName() +"\n Edad: " +employee5.getAge() +"\n Direccion: " +employee5.getAddress() +"\n Número telefónico: " +employee5.getNumberPhone());
                break;
            }
        }
}
