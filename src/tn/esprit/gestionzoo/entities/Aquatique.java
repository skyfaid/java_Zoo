package tn.esprit.gestionzoo.entities;

public sealed class Aquatique extends Animal permits Dolphin,Penguin{
    private String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatique(){
        super();
    }

    public Aquatique(String family,String name,int age,boolean isMammal,String habitat){
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }
    public String toString(){
        return super.toString()+"habite a "+habitat;
    }
    public void swim(){
        System.out.println("this aquatic animal is swimming");
    }
    @Override
    public boolean equals(Object obj) {
        if(obj ==null)
            return false;
        if(obj.getClass() !=this.getClass() )
            return false;
        Aquatique aa=(Aquatique) obj;
        return (this.getName().equals(aa.getName())&&(this.getAge()==aa.getAge()));
    }

}
