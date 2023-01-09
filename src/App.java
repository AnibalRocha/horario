import java.util.WeakHashMap;

import pkhorario.*;
public class App {
    public static void main(String[] args) throws Exception {
       // Deber Horario
    Horario e1= new Horario();
    e1.mostrar();
    cuadrado();
    }
    
    private static void cuadrado() {
        int tanano= 5;

        for (int f = 0; f < tanano; f++) {
            for (int c = 0; c < tanano; c++)
                if (f==0 || c==0 || f == tanano -1 || c==tanano -1 )
                    System.out.print(((c+f)%2==0)?"+ ":"- "); 
                else
                    System.out.print("  "); 
            System.out.println(" "); 
        }
    }
}
