package utils;

import java.util.Comparator;

import models.Contacto;

public class ContactoComparator implements Comparator<Contacto>{

    //@Override
    public int compare(Contacto o1, Contacto o2) {

        //primero el apellido orden alfabetico

        Integer comparacionApellido = o1.getApellido().compareTo(o1.getApellido());

        //segundo si son iguales comparo por el nombre orden alfabetico
        
        return ;
    }

    
    
}
