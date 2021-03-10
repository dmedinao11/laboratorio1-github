import java.util.Scanner;
public class TablasDeMultiplicar {
    //Se ingresa un número cualquiera y se imprime su tabla de multiplicar hasta el 10.
    public static void main(String[] args) {
        try{
            Scanner scanner = new Scanner(System.in);
            int N = scanner.nextInt();
            scanner.close();
            for (int i=1;i<11;i++){
                int prod = N*i;
                System.out.println(N + "\t x \t " + i + "\t = \t" + prod);
            }
        } catch(Exception e){System.out.print("Ingrese un número válido");}
    }
}
