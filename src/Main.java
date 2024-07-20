import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Informe o salário do funcionário : ");
            double salario = scanner.nextDouble();

            double inss = descontaInss(salario);
            double ir = descontaIr(salario);

            System.out.println("o salário bruto é R$: " + salario);
            System.out.println("O valor de desconto de INSS foi de R$: " + inss);
            System.out.println("O valor de desconto de IR foi de R$: " + ir);
            System.out.println("O valor do salário liquido é de R$: " + (salario - inss - ir));
            System.out.println( " -------------------------------------------- ");
        }
    }


        public static double descontaInss(double salario) {
            double inss = 0;

            if (salario <= 1212.00) {
                inss = salario  * 0.075;
            } else if (1212.00 < salario && salario <= 2427.35) {
                inss = salario * 0.09;
            } else if (2427.35 < salario && salario <= 3641.03) {
                inss = salario * 0.12;
            } else {
                inss = salario * 0.14;
            }
            return inss;
        }

        public static double descontaIr(double salario){
            double ir = 0;

            if (1903.99 < salario && salario <= 2826.65) {
                ir = salario * 0.075;
            } else if (2826.65 > salario && salario <= 3751.05) {
                ir = salario * 0.15;
            } else if (3751.05 > salario && salario <= 4664.68) {
                ir = salario * 0.225;
            } else {
                ir = salario * 0.275;
            }
            return ir;
        }




}
