public class Administrador extends Empregado{
    private double ajudaDeCusto;

    public double getAjudaDeCusto() {
        return ajudaDeCusto;
    }

    public void setAjudaDeCusto(double ajudaDeCusto) {
        this.ajudaDeCusto = ajudaDeCusto;
    }

    public double calcularSalario(){
        double salarioAdmin = ajudaDeCusto + calcularSalario();
        return salarioAdmin;
    }
}
