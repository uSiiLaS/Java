/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
  public static void main (String[]args)
  {
	float x = -2;
	float resultadoA;
	float resultadoB;
	float resultadoC;

resultadoA = (2 * x) + (3 * x) - (4 * x);
resultadoB = (3 * x) / (4 * x) + (5 * x) - (7 * x);
resultadoC = (5 * x) + (6 * x) - x + (10 * x); 

	  System.out.printf ("1º Equação: 2x + 3x - 4x = %.0f\n", resultadoA);
	  System.out.printf ("2º Equação: 3x / 4x + 5x - 7x = %.2f\n", resultadoB);
	  System.out.printf ("3º Equação: 5x + 6x - x + 10x = %.0f", resultadoC);
  }
}
