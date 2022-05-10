public class Principal{
    public static void main(String[] args) {
        Pessoa pes = new Pessoa();
        Empregado emp = new Empregado();
        Administrador adm = new Administrador();
        Operario op = new Operario();


        System.out.println("");
        //Informações de um operário.
        System.out.println("Informações de um Operário");
        op.setNome("Alexander");
        op.setTelefone("999999999");
        op.setEndereco("Rua Ótima");
        op.setCodigoSetor(123);
        op.setSalarioBase(1200);
        op.setImposto(49.5);
        op.setValorProducao(400);
        op.setComissao(50);
        op.Exibir();

        System.out.println("");
        //Informações de um Administrador.
        System.out.println("Informações de um Admnistrador:");
        adm.setNome("André");
        adm.setTelefone("21929929");
        adm.setEndereco("R. Otaviano");
        adm.setCodigoSetor(1);
        adm.setSalarioBase(4000);
        adm.setImposto(370.5);
        adm.setAjudaDeCusto(1000);
        adm.Exibir();
    }
}