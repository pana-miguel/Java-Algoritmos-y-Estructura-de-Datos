import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class clase_2 {
    public static void main(String[] args) throws IOException{
        // Estrutura

        // While .- esta estructura nos permite ejecuar una porcion de codigo, solo si se cumple la condicion, condicion is equals true
        int indice_1 = 0;
        while (indice_1 < 8){
            System.out.println("Numero : "+ indice_1);
            indice_1 ++;
        }
        // Do - While .- la estructa repetitiva que se ejecuta por lo menoz una vez, para despues verificar si la concion sea verdadera
        int indice_2 = 5;
        do {
            System.out.println("Numero : "+ indice_2);
        }while(indice_2 <3);
        // For .- Esta estructura repetitiva, tienes parametros inicializacion de variable, limitante y (decremente o adcioon a la variable iniciada)
        // en cada iteracion se verifica la condicion y se ejecuta el decremneto o la adicion

        for (int e = 0; e< 12; e++){
            System.out.println("Numero : "+ indice_1);
        }

        // Foreach

    }
}
