package tn.esprit.gestionzoo.entities;

public final class Dolphin extends Aquatique{
    private float swimmingSpeed;

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public Dolphin(){
        super();
    }
    public Dolphin(String family, String name, int age, boolean isMammal, String habitat,float swimmingSpeed) {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }
    public String toString(){
        return super.toString()+" avec speed "+swimmingSpeed;
    }
    @Override
    public void swim(){
        System.out.println("this dolphin is swimming");

    }
}
