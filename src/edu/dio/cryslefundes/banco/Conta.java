package edu.dio.cryslefundes.banco;

public class Conta {
    private int numero;
    private String agencia;
    private String nomeCliente;
    private double saldo;

    private Conta(ContaBuilder builder) {
        this.numero = builder.numero;
        this.agencia = builder.agencia;
        this.nomeCliente = builder.nomeCliente;
        this.saldo = builder.saldo;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public static class ContaBuilder {
        private int numero;
        private String agencia;
        private String nomeCliente;
        private double saldo;

        public ContaBuilder numero(int numero) {
            this.numero = numero;
            return this;
        }

        public ContaBuilder agencia(String agencia) {
            this.agencia = agencia;
            return this;
        }

        public ContaBuilder nomeCliente(String nomeCliente) {
            this.nomeCliente = nomeCliente;
            return this;
        }

        public ContaBuilder saldo(double saldo) {
            this.saldo = saldo;
            return this;
        }

        public Conta build() {
            return new Conta(this);
        }
    }
}
