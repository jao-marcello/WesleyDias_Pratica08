import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Var eq = new Var();
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor;
        double resultado;

        try {
            System.out.print("Digite o dividendo: ");
            dividendo = sc.nextInt();
            System.out.print("Digite o divisor: ");
            divisor = sc.nextInt();

            resultado = eq.dividir(dividendo, divisor);

            System.out.printf("Resultado: %.2f", resultado);

        } catch (ArithmeticException e) {
            System.out.println("Erro: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro: entrada inválida!");
        } finally {
            sc.close();
        }
    }
}