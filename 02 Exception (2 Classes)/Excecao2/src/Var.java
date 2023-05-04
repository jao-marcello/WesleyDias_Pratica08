public class Var {
    public static double dividir(int dividendo, int divisor) throws ArithmeticException {
        if (divisor == 0) {
            throw new ArithmeticException("Não é possível dividir por zero!");
        }
        if (dividendo < 0) {
            throw new ArithmeticException("O dividendo não pode ser menor que zero!");
        }
        return (double) dividendo / divisor;
    }
}