package com.allexample.garbagecollector;

public class MainIslandofIsolation {

    public static void main(String[] args) {
        get();
    }
    static void get(){


       IslandofIsolation islandofIsolation1=  new IslandofIsolation();
       SubIslandofIsolation subIslandofIsolation=  new SubIslandofIsolation();

        islandofIsolation1.s=subIslandofIsolation;
        subIslandofIsolation.i=islandofIsolation1;

        System.out.println("Before nullifying references:");
        System.out.println("islandofIsolation references: " + islandofIsolation1);
        System.out.println("subislandofIsolation: " + subIslandofIsolation);

        // Step 2: Nullify references to create an island of isolation
        islandofIsolation1 = null;
        subIslandofIsolation = null;

        // Step 3: Suggest garbage collection
        System.gc();
        System.out.println("\nAfter nullifying references and suggesting GC:");
        System.out.println("islandofIsolation references: " + islandofIsolation1);
        System.out.println("subislandofIsolation: " + subIslandofIsolation);


    }
}
