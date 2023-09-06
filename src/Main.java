import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int temperatura;

        System.out.println("Bem vindo ao conversor de temperatura!!!");
        System.out.println("Qual a temperatura, em graus celsius você deseja converter?");

        temperatura = scanner.nextInt();

        int temperaturaFahrenheit = (int) (temperatura * 1.8)+32;

        String mensagem = """
                Olá, você digitou a temperatura %d ºC, e está temperatura
                equivale a %d º Fahrenheit!!!
                """.formatted(temperatura,temperaturaFahrenheit);

        System.out.println(mensagem);

    }
}