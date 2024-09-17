import java.util.Scanner;

public class principal {

    public static void main(String[] args) {
        String nombre;
        int valor;

        try (Scanner sc = new Scanner (System.in)) {
            System.out.println("Ingrese el tamaño de la matriz: ");
            int tam = sc.nextInt();
            matriz[][] mat= new matriz[tam][tam];

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    System.out.println("Por favor, Dijite su nombre: ");
                    nombre = sc.next();
                    System.out.println("Digite el precio que pago por su entrada: ");
                    valor = sc.nextInt();

                    matriz datos = new matriz(nombre, valor);
                    mat[i][j] = datos;
                }
            }

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    for (int j2 = 0; j2 < mat.length; j2++) {
                        for (int k = 0; k < mat.length; k++) {
                            if (mat[i][j].getValor()>=mat[j2][k].getValor()) {
                                mat[i][j] = mat[i][j];

                            }else{
                                matriz temp=mat[i][j];
                                mat[j2][k]=mat[i][j];
                                mat[i][j]=temp;

                                System.out.println(temp);
                            }
                        }
                    }
                    
                }
                
            }

            System.out.println("----------------------------------------------------------------------");

            for (int i = 0; i < mat.length; i++) {
                for (int j = 0; j < mat.length; j++) {
                    int k = i+1;
                    int z = j+1;
                    System.out.println("Su numero de fila es: "+ k +" y su numero de columna es: "+ z);
                    System.out.println("Nombre: "+ mat[i][j].getNombre());
                    System.out.println("Valor: "+ mat[i][j].getValor());
                    

                }
            }
        }
    }

}