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
    public double calcularSalarioOP(){
        double salarioLiquido = calcularSalario();
        double comissao = calcularComissão();
        double salarioOperario = salarioLiquido + comissao;
        return salarioOperario;
    }
    public void Exibir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Sálario Base: " + this.getSalarioBase());
        System.out.println("Imposto: " + this.getImposto());
        System.out.println("Valor de Produção: " + this.getValorProducao());
        System.out.println("Comissão: " + this.getComissao());
        System.out.println("Salário de Operário: " + calcularSalarioOP());
    }
    
}
