import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        double peso, excesso, multa;
        
        System.out.print("Informe o peso (em quilos) dos peixes pescados: ");
        peso = entrada.nextDouble();
        
        excesso = peso - 50.0;
        multa = excesso > 0 ? excesso * 4.0 : 0.0;
 
        System.out.println("Peso dos peixes: " + peso + " kg");
        if (excesso > 0) {
            System.out.println("Peso em Excesso: " + excesso + " kg");
            System.out.println("Valor devido a Multa: R$ " + String.format("%.2f", multa));
        } else {
            System.out.println("Não houve excesso de peso. Não a Multa.");
        }
        entrada.close();
    }
}