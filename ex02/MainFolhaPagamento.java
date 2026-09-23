public class MainFolhaPagamento {
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[3];
        funcionarios[0] = new Funcionario("Ana", 2500.0);
        funcionarios[1] = new Gerente("Bruno", 4000.0, 1200.0);
        funcionarios[2] = new Vendedor("Carla", 1800.0, 10000.0, 5.0);

        for (Funcionario f : funcionarios) {
            System.out.println(f.getNome() + " - Salário: " + f.calcularSalario());
        }
    }
}
