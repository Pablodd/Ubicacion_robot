//El siguiente codigo calcula la posicion de un robot, que parte en un eje de coordenadas en el punto 0,0
// Siempre empieza en el eje Y, si es negativo el dato retrocede 
// y cada vez que termina un dato gira 90º en sentido contrario a las agujas del reloj.
// 
// 

import java.util.ArrayList;
import java.util.Scanner;

public class Ubicacion_robot {

  public static void main(String[] args) {

        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion, puntos, x,y,i;
        ArrayList<Integer> datos = new ArrayList<Integer>();

        System.out.println("Introduce el primer valor");
        puntos = sn.nextInt();

        datos.add(puntos);
 
        do{
            System.out.println("Quieres más datos?: 1-Si, 2-No");
            opcion = sn.nextInt();
            switch(opcion){

                case 1:
                    System.out.println("Introduce el valor");
                    puntos = sn.nextInt();
            
                    datos.add(puntos);
                    break;

                case 2:
                    System.out.println(datos);
                    y= datos.get(0);
                    x=0;
                    
                    for(i=1; i< datos.size();i++){
                        if(i%2 == 0){
                            y=y+(datos.get(i)*-1);
                        }else{
                            x=x+(datos.get(i)*-1);
                        }
                    }

                    System.out.println("x "+x+" y "+y);
                    salir = true;
                    break;

            }

        }while(!salir);

    }
    
}
