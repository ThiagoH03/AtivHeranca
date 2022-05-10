public class Operario extends Empregado {
    private double valorProducao;
    private double comissao;

    public double getValorProducao() {
        return valorProducao;
    }
    public void setValorProducao(double valorProducao) {
        this.valorProducao = valorProducao;
    }
    public double getComissao() {
        return comissao;
    }
    public void setComissao(double comissao) {
        this.comissao = comissao;
    }

    public double calcularComissão(){
        double valorComissao = (valorProducao/100)*this.comissao;
        return valorComissao;
    }
    public double calcularSalario(){
        double salarioOperario = calcularSalario() + calcularComissão();
        return salarioOperario;
    }
}
