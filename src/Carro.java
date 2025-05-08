public class Carro extends Veiculos implements Manutencao {
    public int numeroPortas;

    public Carro(String placa, int ano, int numeroPortas){
        super(placa, ano);
        this.numeroPortas = numeroPortas;
    }

    @Override
    public calcularValorSeguro(this.numeroPortas){
        if (this.numeroPortas > 2){
            return "O VALOR DO SEGURO E DE R$ 200 POR MES";
        }else{
            return "O VALOR DO SEGURO E DE R$ 100 POR MES";
        }
    }

    @Override
    public realizarManutencao() {
        return "A vistoria nos 4 pneus foram realizadas com sucesso!";
    }
}
