import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {

            System.out.print("Qual conversão deseja realizar? ");
            
            System.out.println("\n1 - Decimal para binario");
            System.out.println("2 - Binario para decimal");
            System.out.println("3 - Decimal para hexadecimal");
            System.out.println("4 - Hexadecimal para decimal");
            System.out.println("5 - Binario para hexadecimal");
            System.out.println("6 - Hexadecimal para binario");
            System.out.println("Qualquer Tecla - Sair");

            String input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.print("Digite o numero decimal: ");
                int decimal = Integer.parseInt(scanner.nextLine());
                String binario = Integer.toBinaryString(decimal);
                System.out.println("O numero em binario é: " + binario);

            } else if (input.equals("2")) {
                System.out.print("Digite o numero binario: ");
                String binario = scanner.nextLine();
                int decimal = Integer.parseInt(binario, 2);
                System.out.println("O numero em decimal é: " + decimal);

            } else if (input.equals("3")) {
                System.out.print("Digite o numero decimal: ");
                int decimal = Integer.parseInt(scanner.nextLine());
                String hexadecimal = Integer.toHexString(decimal);
                System.out.println("O numero em hexadecimal é: " + hexadecimal);

            } else if (input.equals("4")) {
                System.out.print("Digite o numero hexadecimal: ");
                String hexadecimal = scanner.nextLine();
                int decimal = Integer.parseInt(hexadecimal, 16);
                System.out.println("O numero em decimal é: " + decimal);

            } else if (input.equals("5")) {
                System.out.print("Digite o numero binario: ");
                String binario = scanner.nextLine();
                int decimal = Integer.parseInt(binario, 2);
                String hexadecimal = Integer.toHexString(decimal);
                System.out.println("O numero em hexadecimal é: " + hexadecimal);

            } else if (input.equals("6")) {
                System.out.print("Digite o numero hexadecimal: ");
                String hexadecimal = scanner.nextLine();
                int decimal = Integer.parseInt(hexadecimal, 16);
                String binario = Integer.toBinaryString(decimal);
                System.out.println("O numero em binario é: " + binario);

            } else {
                System.out.println("Saindo...");
                break;
            }
        }
    }
}
