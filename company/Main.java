package com.company;

import com.company.Movimiento;
import com.company.Persona;
import com.company.Posicion;

import java.util.ArrayList;
import java.util.List;
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Persona persona = new Persona();
        Persona persona1 = new Persona();
        persona.setNombre("Знайка");
        persona1.setNombre("Пончика");
        System.out.println("my name is " +persona.getNombre());
        System.out.println("my name is " +persona1.getNombre());
        persona.setTipoPersona(TipoPersona.Man);
        persona1.setTipoPersona(TipoPersona.Man);
        System.out.println(persona.getNombre()+" is a "+persona.getTipoPersona());
        System.out.println(persona1.getNombre()+" is a "+persona1.getTipoPersona());
        System.out.println(persona.advice("grab  to something"));
        System.out.println(persona1.getNombre()+" "+persona.fallThrough("Air"));
        System.out.println(persona.getNombre()+" said "+persona.getCloseTo("wall"));
        List<Persona> everyone =new ArrayList<>();
        everyone.add(new Persona());
        everyone.add(new Persona());
        for (Persona actual:everyone) {
            System.out.println(actual.grabSomething(new steamHeatingPipe()));
        }
        //persona.grabSomething( null); this Throws an exception unchecked
        System.out.println(persona.grabSomething(new windowSill()));
    }
}
