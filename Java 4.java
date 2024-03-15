import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("Cadastre o produto: ");
        String produto = teclado.nextLine();
        
        System.out.printf("Digite a quantidade: ");
        int quantidade = teclado.nextInt();
        
        System.out.printf("Digite o preço do produto: ");
        float preco = teclado.nextFloat();
        
        teclado.close();
        
        float valor = preco * quantidade;
        
        System.out.printf("\n\nNome do produto: %s\n", produto);
        System.out.printf("Quantidade do produto: %d\n", quantidade);
        System.out.printf("Preço do produto: %.2f\n", preco);
        System.out.printf("Valor total: %.2f", valor);
    }
}