package controller;
import java.util.*;
public class Ejercicios {

    public Ejercicios(){
        System.out.println("Ejercicio 1: ");
        System.out.println(tieneDuplicados(new int[]{1, 2, 3, 4, 5}));
        System.out.println(new int[]{1, 2, 3, 4, 5, 4, 3, 2, 45});

        System.out.println("Ejercicio 2: ");
        System.out.println("Murcielago es isograma = " + esIsograma("murcielago"));
        System.out.println("camaleon es isograma = " + esIsograma("camaleon"));
    }

    public boolean tieneDuplicados(int[] numeros){
        Set<Integer> set = new HashSet<>();
        for(int num : numeros){
            if(!set.add(num)){
                return true;
            }
        }


        return false;
    }

    //Ejemplos:
    // murcielago -> true
    // camaleon -> false

    public boolean esIsograma(String palabra){

        Set<Character> palabraSet = new HashSet<>();
        for(char c : palabra.toCharArray()){
            if (!palabraSet.add(c)){
                return true;
            }
        }
        return false;
    }

    public int contarPalabrasUnicas(String frase){
        int cont = 0;
        Set<String> palabra = new HashSet<>();
        for( String s : frase.split("")){
            if (!palabra.add(s)){
                cont ++;
                return cont;
            }
        }
        return 0;
    }

    
}