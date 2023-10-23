package tn.esprit.gestionzoo.entities;

public sealed class Animal permits Aquatique,Terrestrial {
    private String family;
    private String name;
    private int age;
    private boolean isMammal;

    public Animal(String family,String name,int age,boolean isMammal){
        this.family=family;
        this.name=name;
        try {
            setAge(age);
        }catch (InvalidAgeException e){
           // e.printStackTrace(); ya3tik mochkel w ykamel 3la ro7u
            System.err.println(e.getMessage());
        }
        this.isMammal=isMammal;
    }
    public void setAge(int age) throws  InvalidAgeException{
        if(age>0)
            this.age=age;
        else
           throw new InvalidAgeException("age invlid c'est nega monsirut oui oiuo");
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getFamily() {
        return family;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFamily(String family) {
        this.family = family;
    }

    public void setMammal(boolean mammal) {
        isMammal = mammal;
    }

    public boolean isIsMammal() {
        return isMammal;
    }

    public Animal(){}
    public String toString(){
        if(isMammal)
            return("Animal name "+this.name+" de la famille "+this.family+" d'age "+this.age+" et Mammal.");
        else
            return("Animal name "+this.name+" de la famille "+this.family+" d'age "+this.age+" et non Mammal.");
    }
}
