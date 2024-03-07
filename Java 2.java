import java.util.Scanner;

public class Main
{
  public static void main (String[]args)
  {

	Scanner ler = new Scanner (System.in);
	  System.out.printf ("Informe o seu nome: ");
	String nome = ler.nextLine ();

	  System.out.printf ("Informe a 1º: nota: ");
	float nota1 = ler.nextFloat ();

	  System.out.printf ("Informe a 2º: nota: ");
	float nota2 = ler.nextFloat ();

	  System.out.printf ("Informe a 3º: nota: ");
	float nota3 = ler.nextFloat ();

	  System.out.printf ("Informe a 4º: nota: ");
	float nota4 = ler.nextFloat ();

	float media = (nota1 + nota2 + nota3 + nota4) / 4;
	
	System.out.printf("\n\nNome: %s\n", nome);
    System.out.printf("Média: %.2f\n", media);

	if (media >= 7)
	  {
		System.out.printf ("Aluno aprovado!");
	  }
	else
	  {
		System.out.printf ("Aluno reproado!");
	  }
	  
  }

}
