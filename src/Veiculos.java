public abstract class Veiculos {
    public String placa;
    public int ano;

    public Veiculos(String placa, int ano){
        this.placa = placa;
        this.ano = ano;
    }

    public abstract calcularValorSeguro();

    public exibirDetalhes(){
        System.out.println("Placa: " + this.placa);
        System.out.println("Ano: " + this.ano);
    }
}
