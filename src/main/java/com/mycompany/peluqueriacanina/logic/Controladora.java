
package com.mycompany.peluqueriacanina.logic;

import com.mycompany.peluqueriacanina.persistence.ControladoraPersistencia;


public class Controladora {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();

    public void guardar(String nombreMasco, String raza, String color, 
            String observaciones, String nombreDuenio, String celDuenio, 
            String alergico, String atencion_especial) {
        
        // Creamos el dueño y asignamos sus valores.
        Duenio duenio = new Duenio();
        duenio.setNombre(nombreDuenio);
        duenio.setCelDuenio(celDuenio);
        
        // Creamos la mascota y asignamos sus valores.
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setRaza(raza);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atencion_especial);
        masco.setObservaciones(observaciones);
        masco.setunDuenio(duenio);
        
        controlPersis.guardar(duenio,masco);
        
        
        
        
    }
    
    
}
