import java.util.Scanner;

public class App{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int dividendo, divisor;
        double resultado;

        try {
            System.out.print("Digite o dividendo: ");
            dividendo = sc.nextInt();
            System.out.print("Digite o divisor: ");
            divisor = sc.nextInt();

            if (divisor == 0) {
                throw new ArithmeticException("Não é possível dividir por zero!");
            }

            resultado = (double) dividendo / divisor;

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