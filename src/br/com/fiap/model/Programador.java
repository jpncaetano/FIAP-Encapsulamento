package br.com.fiap.model;

public class Programador extends Funcionario {
    public int ramal;

    public Programador() {
        super();
    }

    public Programador(String nome, String cpf, Endereco endereco, Double salarioFixo, int ramal) {
        super(nome, cpf, endereco, salarioFixo);
        this.ramal = ramal;
    }

    public int getRamal() {
        return ramal;
    }

    public void setRamal(int ramal) {
        this.ramal = ramal;
    }

    @Override
    public double getBonus() {
        return this.getSalarioFixo() * 0.02;
    }

    @Override
    public String getDetalhamento() {
        return "Nome: " + this.getNome() + "\n" +
                "Ramal: " + this.getRamal() + "\n" +
                "Endereço: " + this.getEndereco().getEnderecoCompleto() + "\n" +
                "Salário mensal: R$" + this.getSalarioFixo() + "\n" +
                "Bônus semestral: " + this.getBonus();
    }
}
