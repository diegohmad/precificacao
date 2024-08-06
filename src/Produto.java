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
    public double aplicarImposto(Cliente cliente) {
        return this.precoBase * 0.1;
    }

    //calcular a taxa adicional, metodo chamará calcularTaxaAdicional
    public double calcularTaxaAdicional() {
        return 50;
    }

    //calcular o preço final, metodo chamará calcularPrecoFinal
    public double calcularPrecoFinal(Cliente cliente) {
        double desconto = this.calcularDesconto(cliente);
        // System.out.println("Desconto: " + desconto);
        double imposto = this.aplicarImposto(cliente);
        // System.out.println("Imposto: " + imposto);
        double taxaAdicional = this.calcularTaxaAdicional();
        // System.out.println("Taxa adicional: " + taxaAdicional);

        double precoComDesconto = this.precoBase - desconto;
        // System.out.println("Preço com desconto: " + precoComDesconto);
        double precoFinal = precoComDesconto + imposto + taxaAdicional;
        // System.out.println("Preço final: " + precoFinal);

        if (precoFinal < 0) {
            precoFinal = 0;
        }

        return precoFinal;
    }
}
