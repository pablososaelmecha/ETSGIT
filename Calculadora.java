import java.util.Scanner;
public class Calculadora {


        static float suma(int n1, int n2){  // F.suma
            return n1 +n2;
        }
        static float resta (int n1,int n2){ 
            return n1 -n2;
        }


        static void menu(){
            Scanner sc = new Scanner(System.in);
            System.out.println("Introduce primer valor");
            int n1= sc.nextInt();

            System.out.println("Introduce segundo valor");
            int n2= sc.nextInt();

            //Imprimimos e llamamos las funciones
            System.out.println("Suma");
            System.out.println(suma(n1,n2));
            System.out.println("Resta");
            System.out.println(resta(n1,n2));

            System.out.println("Version 2");
        }
        public static void main(String[] arg){    //llamamos el procedimiento menu
            menu();
        }
    }