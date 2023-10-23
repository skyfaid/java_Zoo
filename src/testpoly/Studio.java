package testpoly;

public class Studio {
    public static void main(String[] args) {
        Machine m=new Machine();
        Camera c=new Camera();
        m.start();
        c.start();
        Machine m2=new Machine();
        Camera c2=new Camera();
        m2=c2;//upcasting keyenu ktebt => m2=new Camera();

        //downcasting ne peut pas etre comme ca
        Machine m3=new Machine();
        Camera c3=new Camera();
        //c3=m3; c'est faust

        //donwcasting permit
        Machine m4=new Camera();
        Camera c4;
        c4=(Camera)m4;
        c4.start();
        //downcastgin avec erreru
        Machine m5=new Machine();
        Camera c5=new Camera();
        //c5=(Camera) m5; ca va donner une euueur lors de compiklation tu vas trouver une execption de


        //suerclassement et substitition(changement de type pour utiliser la methode de camera fille )
        Machine m6=new Camera();

        ((Camera)m6).snap();//substitition

    }
}
