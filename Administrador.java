public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalarioADM(){
        double salarioLiquido = calcularSalario();
        double salarioAdmin = ajudaDeCusto + salarioLiquido;
        return salarioAdmin;
    }
    public void Exibir(){
        System.out.println("Nome: " + this.getNome());
        System.out.println("Telefone: " + this.getTelefone());
        System.out.println("Endereço: " + this.getEndereco());
        System.out.println("Sálario Base: " + this.getSalarioBase());
        System.out.println("Imposto: " + this.getImposto());
        System.out.println("Ajuda de Custo:" + this.getAjudaDeCusto());
        System.out.println("Sálario ADM: " + calcularSalarioADM());
    }
}
