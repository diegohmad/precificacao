public class ClienteJuridico extends Cliente {

    public ClienteJuridico(String nome, String tipo) {
        super(nome, tipo);
    }

    @Override
    public double aplicarDesconto() {
        return 0.2;
    }
}
