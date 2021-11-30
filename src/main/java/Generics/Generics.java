package Generics;

import java.util.ArrayList;

public class Generics {

    public static void learnGenerics() {

        Detective duke = new Detective("Duke");
        Detective shelock = new Detective("Sherlock");

        String watson = "Watson";
        Parrot paco = new Parrot("Paco");

        //without Generics
        //inherit Typ from Object class
        //ArrayList items = new ArrayList();

     /*   items.add(shelock);
        items.add(duke);
        items.add(watson);
        items.add(paco);*/


        //1. its possible, becuase toString method inherit from Object class
     /*   for (Object item : items) {
            System.out.println(item.toString());
        }*/
        //2. without typ in arrayList the call of specific method could be a problem
        //Strings und Parrots could not cast to Detective
    /*    for (Object item: items) {
            ((Detective)item).investigate();
        }*/

        // with Generics
        ArrayList<Detective> detectives= new ArrayList<>();
        detectives.add(shelock);
        detectives.add(duke);
        // watson is a String not a Detective, so it doesnt work
        // detectives.add(watson);


        //3. solution: Generics
        for (Detective detective: detectives){
            detective.investigate();
        }

    }
}
