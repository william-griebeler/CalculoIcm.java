import java.util.Scanner;

public class CalculoImc {

    public static void main(String[] args) {
        // ENTRADA
        Scanner scanner = new Scanner (System.in);
        // 1- pedir para o usuario o seu peso
        System.out.println("Informe os seu peso em quilogramas:");
        double peso = scanner.nextDouble();
   
   
        // 2- pedir para o usuario sua altura  em metros
        System.out.println(" Informe a sua latura em metros: ");
        double altura = scanner.nextDouble();  
   
        // PROCESSAMENTO
        // 3- calcular o imc
        double imc = peso / (altura * altura);
   
        // SAÍDA
        // 4- imprime o resultado IMC  
        System.out.println("seu IMC é: "+ imc);
   
        scanner. close();
    
}

}
