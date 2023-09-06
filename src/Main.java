import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        double  temperatura;
        int temperaturaFahrenheit;

        System.out.println("Bem vindo ao conversor de temperatura!!!");
        System.out.println("Qual a temperatura, em graus celsius você deseja converter?");

        temperatura = scanner.nextDouble();

        temperaturaFahrenheit = (int) (temperatura * 1.8)+32;


        String mensagem = """
                Olá, você digitou a temperatura %.2f ºC, e está temperatura
                equivale a %d º Fahrenheit!!!
                """.formatted(temperatura,temperaturaFahrenheit);

        System.out.println(mensagem);

    }
}