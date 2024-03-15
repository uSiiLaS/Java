import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        Scanner teclado = new Scanner(System.in);
        
        System.out.printf("Informe a 1º nota: ");
        float nota1 = teclado.nextFloat();
        
        System.out.printf("Informe a 2º nota: ");
        float nota2 = teclado.nextFloat();
        
        System.out.printf("Informe a 3º nota: ");
        float nota3 = teclado.nextFloat();
        
        float media = (nota1 + nota2 + nota3)/3;
        
        System.out.printf("\n\nMédia: %.2f\n", media);
        
        if (media >= 7){
            System.out.printf("Aprovado!");
        }else if (media >=4){
            System.out.printf("Reprovado, COM direto a recuperação!");
        }else{
            System.out.printf("Reprovado, SEM direto a recuperação!");
        }
    }
}