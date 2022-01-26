package springboot.fundamentos.bean;

public class MybeanImplement implements Mybean{
    @Override
    public void print() {
        System.out.println("Hola desde mi implementacion propia del bean");
    }  
}
