package Projeto1;

/**
 * @author Jeremias
 */

public class Funcionario {
    private String nome;
    private String cargo;
    private double sal;
    //Construtores
    public Funcionario(){
    }
    public Funcionario(String nome, String cargo, double sal){
        this.nome = nome;
        this.cargo = cargo;
        this.sal = sal;
    }
    //Gets e sets

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }
    
}
