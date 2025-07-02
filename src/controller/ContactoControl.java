package controller;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;

import utils.*;

public class ContactoControl {

    public ContactoControl(){
        runTreeContacto();
        runTreeContactoConNumero();
        ContactoControl con = new ContactoControl();
        con.;
        
    }

    private void runTreeContacto(){
        Set<Contacto> contactos = new TreeSet<>();

        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez", "123456789"));

        for (Contacto contacto : contactos){
            System.out.println(contacto);
        }
    }
}