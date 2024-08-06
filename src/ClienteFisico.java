public class ClienteFisico extends Cliente{
    
    public ClienteFisico(String nome, String tipo) {
        super(nome, tipo);
    }

    @Override
    public double aplicarDesconto() {
        return 0.1;
    }
}
