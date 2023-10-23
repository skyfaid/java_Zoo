package tn.esprit.gestionzoo.entities;

public final class Zoo {
    private Animal[] animals = new Animal[3];
    private Aquatique[] aquaticAnimals=new Aquatique[10];
    private String name;
    private String city;

    private final int NBR_Cages = 3;
    private int nbranimal;
    private int nbraq=0;

    public Zoo(String name, String city) {
        animals = new Animal[NBR_Cages];
        this.name = name;
        this.city = city;
         aquaticAnimals=new Aquatique[3];
    }


    public Aquatique[] getAquaticAnimals() {

        return aquaticAnimals;
    }

    public void setAquaticAnimals(Aquatique[] aquaticAnimals) {

        this.aquaticAnimals = aquaticAnimals;
    }
    public void addAquaticAnimal(Aquatique aquatic){
        if(nbraq<10) {
            aquaticAnimals[nbraq] = aquatic;
            nbraq++;
        }
        else
            System.out.println("tableau remplis");
        }

    public String getName() {
        return name;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public String getCity() {
        return city;
    }

    public int getNBR_Cages() {
        return NBR_Cages;
    }

    public int getNbranimal() {
        return nbranimal;
    }

    public void setName(String name) {
        if(!name.equals(null))
            this.name = name;
        else
            System.out.println("name must be not null");
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public void setNbranimal(int nbranimal) {
        this.nbranimal = nbranimal;
    }

    public Zoo() {
    }

    public void displayZoo() {
        System.out.println("name= " + name + " city= " + city + " nbrcages= " + NBR_Cages);
        System.out.println("/////nos animaux/////");
        for (int i = 0; i < nbranimal; i++)
            System.out.println(animals[i]);
    }

    public String toString() {
        return ("Zoo name " + this.name + " dans " + this.city + " avec " + this.NBR_Cages + " cages");
    }

    public void addAnimal(Animal animal) throws ZooFullException, InvalidAgeException {
        if (nbranimal < NBR_Cages) {
            if (animal.getAge() >= 0) {
                animals[nbranimal] = animal;
                nbranimal++;
            } else {
                throw new InvalidAgeException("L'âge de l'animal ne peut pas être négatif.");
            }
        } else {
            throw new ZooFullException("Le zoo est plein. Impossible d'ajouter un nouvel animal.");
        }
    }

    public void affanimaux() {
        System.out.println("/////Toutes animaux/////");
        for (int i = 0; i < nbranimal; i++)
            System.out.println(animals[i]);
    }

    public int searchAnimal(Animal animal) {
        int i = 0;
        while (i < nbranimal) {
            if (animals[i].getName().equals(animal.getName())) {
                return i + 1;
            }
            i++;
        }
        return -1;
    }

    public boolean removeAnimal(Animal animal) {
        int pos = searchAnimal(animal);
        if (pos != -1) {
            for (int i = pos; i < nbranimal - 1; i++)
                animals[i] = animals[i + 1];
            nbranimal--;
            animals[nbranimal] = null;
            return true;

        }
        return false;
    }

    public boolean isZooFull() {
        return nbranimal == NBR_Cages;
    }

    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbranimal < z2.nbranimal)
            return z2;
        if (z1.nbranimal > z2.nbranimal)
            return z1;
        return z1;
    }

    public float maxPenguinSwimmmingDepth(){
        float s=0;
        for(int i=0;i<10;i++)
            if(aquaticAnimals[i] instanceof Penguin)
                 s+= ((Penguin) aquaticAnimals[i]).getSwimmingDepth();
            return s;
         }
    public void displayNumberOfAquaticsByType(){
        int s=0,j=0;
        for(int i=0;i<10;i++)
            if(aquaticAnimals[i] instanceof Dolphin)
                s++;
            else
                j++;
            System.out.println("le nombre des dolphins est"+s+j);

    }


}


