public class Moto extends Veiculos implements Manutencao {
    public int cilindrada;

    @Override
    public Moto(String placa, int ano, int cilindrada){
        super(placa, ano);
        this.cilindrada = cilindrada;
    }
    
    public calcularValorSeguro(this.cilindrada){
        if (this.cilindrada > 2){
            return "O VALOR DO SEGURO E DE R$ 200 POR MES";
        }else{
            return "O VALOR DO SEGURO E DE R$ 100 POR MES";
        }
    }

    @Override
    public realizarManutencao() {
        return "A vistoria nos parabrisas foram realizadas com sucesso!";
    }
}
