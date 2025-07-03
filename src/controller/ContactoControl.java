package controller;

import java.util.Set;
import java.util.TreeSet;

import models.Contacto;
import utils.ContactoComparator;
import utils.ContactoComparadorConNumero;

public class ContactoControl {
    
    public ContactoControl(){
        runTreeContacto();
        crunTreeContactoPorTelefonoDesc();
        
        
    }
    public void runTreeContacto(){
        Set<Contacto>contactos = new TreeSet<>(new ContactoComparator());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        System.out.println("Comparador 1");
        for (Contacto contacto : contactos){
            System.out.println(contacto);
        }
        
        
    }
    public void crunTreeContactoPorTelefonoDesc(){
        Set<Contacto>contactos = new TreeSet<>(new ContactoComparadorConNumero());
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        contactos.add(new Contacto("Luis", "Perez", "111111111"));
        contactos.add(new Contacto("Pedro", "Gonzales", "123456789"));
        contactos.add(new Contacto("Ana", "Perez", "987654321"));
        contactos.add(new Contacto("Pedro", "Lopez","123456789"));
        contactos.add(new Contacto("Pedro", "Lopez", "222222222"));
        System.out.println("Comparador 2 nombre - apellido - numero descendente");
        for (Contacto contacto : contactos){
            System.out.println(contacto);
        }
        
        
    }
        
}