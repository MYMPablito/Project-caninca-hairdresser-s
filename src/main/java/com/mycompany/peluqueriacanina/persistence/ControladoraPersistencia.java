
package com.mycompany.peluqueriacanina.persistence;

import com.mycompany.peluqueriacanina.logic.Duenio;
import com.mycompany.peluqueriacanina.logic.Mascota;


public class ControladoraPersistencia {
    
    DuenioJpaController duenioJpa = new DuenioJpaController();
    MascotaJpaController mascotaJpa = new MascotaJpaController();

    public void guardar(Duenio duenio, Mascota masco) {
        
        // Crear en la BD el dueño.
        duenioJpa.create(duenio);
        
        // Crear en la BD la mascota.
        mascotaJpa.create(masco);
        
    }
    
}
