package exceptions;

import java.io.EOFException;

public class main {
    public static void method1() throws EOFException{
        throw new EOFException("probleme");
    }
    public void method2() throws EOFException{
        this.method1();
    }

    public static void main(String[] args) {

        try{
            method1();

        }catch (EOFException e){
            System.out.println(e.getMessage());
        }


    }
}
