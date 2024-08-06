public class Produto {
    private String nome;
    private double precoBase;

    public Produto(String nome, double precoBase) {
        this.nome = nome;
        this.precoBase = precoBase;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    //calcular o desconto, nome do metodo será calcularDesconto
    public double calcularDesconto(Cliente cliente) {
        return this.precoBase * cliente.aplicarDesconto();
    }

    //calcular o imposto metodo chamará aplicarImposto
    public double aplicarImposto(double valor) {
        return valor * 0.1;
    }

    //calcular a taxa adicional, metodo chamará calcularTaxaAdicional
    public double aplicarTaxaAdicional(double valor) {
        return valor+= 50;
    }

    //calcular o preço final, metodo chamará calcularPrecoFinal
    public double calcularPrecoFinal(Cliente cliente) {
        double desconto = this.calcularDesconto(cliente);
        double precoComDesconto = this.precoBase - desconto;
        double imposto = this.aplicarImposto(precoComDesconto);
        double precoFinal = aplicarTaxaAdicional(precoComDesconto + imposto);

        if (precoFinal < 0) {
            precoFinal = 0;
        }

        return precoFinal;
    }
}
