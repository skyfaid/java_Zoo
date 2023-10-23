package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;
/**/
public class Main {
    public static void main(String[] args) {

        Zoo myZoo = new Zoo("Mon Zoo", "Ma Ville");


        Animal an=new Animal("hamdouni","arbi",-2,true);
        try{
            an.setAge(-4);
        }catch (InvalidAgeException e){
            System.err.println(e.getMessage());
        }finally {//toujours executer sauf quand utiliset system.exit()

        }

       /* try {
            myZoo.addAnimal(new Animal("Mammal", "Tigre", 5, true));

            myZoo.addAnimal(new Animal("Mammal", "Tigre", 5, true));
            myZoo.addAnimal(new Animal("Mammal", "Tigre", 5, true));
            myZoo.addAnimal(new Animal("Mammal", "Tigre", 5, true));
            myZoo.displayZoo();
        } catch (ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }

        try {
            myZoo.addAnimal(new Animal("Mammal", "Lion", -3, true));
            myZoo.displayZoo();
        } catch (ZooFullException e) {
            System.out.println("Erreur: " + e.getMessage());
        } catch (InvalidAgeException e) {
            System.out.println("Erreur: " + e.getMessage());
        }*/
    }
}





/*
*  Animal an2=new Animal("chatton","lion",10,true);

        Zoo zo2 = new Zoo("my Zoo", "tunis");
        /*zo2.displayZoo();
        zo2.addAnimal(an2);
        zo2.displayZoo();
        System.out.println(an2);
        Aquatique fish;
        Terrestrial lion = new Terrestrial();//private est herite mais on ne le vois pas
        Dolphin dep = new Dolphin();
        Penguin pen = new Penguin();

        Aquatique fisha;
       /* Dolphin depa=new Dolphin("mamal","dophin",5,true,"b7ar",100.0f);
        Penguin pena=new Penguin("mamal","pengui",15,true,"ba7ouri",15654);
        fisha.swim();
        depa.swim();
        System.out.println(fisha.toString());
        System.out.println(depa.toString());
        System.out.println(pena.toString());*/
       /* zo2.addAquaticAnimal(dep);
        zo2.addAquaticAnimal(pen);
        for(int i=0;i<zo2.getAquaticAnimals().length;i++){
            if(zo2.getAquaticAnimals()[i]!=null)
                    zo2.getAquaticAnimals()[i].swim();
        }*/























/* classe et atribut
objet
encapsulation
heritage
polymorphisme

we can use super() without having a default constructor in classe meere if we don't have an parametred constructor in the class mere puisque
on va aboir le constructor par default toujours

si attribut classe mere sont qlq chos but not private we can do this.att_mere  and use only super();sans paradans constructor de la classe fille

Regle:
toujours les attributs de la classe mere doit etre protected
et les attributs de la classe fille privee

to modify or ovverdide a mthode in class fille u can't minimize visiblity u can only up it.
si protected dans file u can't make it default exemple

final:
classe :ne peut pas etre herite
methode:ne peut pa etre redefini
attribut: constante

forcage de type:
(type) var[value];
ctrl +d => copie ligne touolw coller; */

/*INTERFDIRE des classe et permits classe d 'hetrite
apres le sdk version 15
public sealed class name_classe extends knfama permits classe_fille1,classe_fille2{
}*/
/* classe herite  kn non herite :final
kn oui add sealed w quel classe */

/* public abstarct void swim(); in aquatic //on peut pas utiliser methode abstacrt sans class abstarct rodha abstract(classe non complete)
classe abstarite peut avoir tous methode non abstraite
//on ne peut pas instancice une classe abstaraite ne9sa el classe
doit declare tous methodes abstarct dans classe memere dans classe fille ou etre abstarite et ne pas faire ca
 */