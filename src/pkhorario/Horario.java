package pkhorario;


public class Horario {
    //variables de horario
    String materia [][] = new String [6][6];

    //metodo contructor
    public Horario (){


        materia[0][0] = ("Horas");
        materia[0][1] = ("Lunes");
        materia[0][2] = ("Martes");
        materia[0][3] = ("Miercoles");
        materia[0][4] = ("Jueves");
        materia[0][5] = ("Viernes");
        materia[1][0] = ("7-9");
        materia[2][0] = ("9-11");
        materia[3][0] = ("11-13");
        materia[4][0] = ("13-14");
        materia[5][0] = ("14-16");


    }

    public void mostrar (){
        for (int i = 0; i <materia.length; i++){
            for (int j = 0; j < materia.length; j++){
                System.out.print(String.format("%.7s",materia [i][j]));
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
