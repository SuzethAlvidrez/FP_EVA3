/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva3_1_metodos_25550692;

/**
 *
 * @author suzet
 */
public class EVA3_1_METODOS_25550692 {
    
    public static void main(String[] args) {//no tiene return
        // TODO code application logic here
        int val1 =5, val2 =10;
        //1. si nececito guardar el valor de retorno
        int resu = sumarEnteros(val1, val2); //invocamos el método
        System.out.println("Suma de 5 + 10 es:" + resu);
        //2. no nececita guardar el valor , un solo uso
        System.out.println("Suma de 5 + 10 es:" + sumarEnteros(val1, val2));
        
    }
    //Que se puede poner fuera del main? atributos , variables, metodos o otras clases
    //MÉTODO PARA SUMAR ENTEROS
    //llamar a sus métodos usando verbos y escritura camelCase
    //1. modificadores de acceso: publi, protected, private, default
    //2.static: PARA USAR LOS MÉTODOS DENTRO DEL MAIN
    //3. Valor de retorno: cualquier tipo de dato
    //void---> si no quieren regresar un valor
    //4:Nombre del método: mismas reglas que los identificadores
    //5: lista de parametros
    //1       2      3        4              5
     public static int sumarEnteros(int num1, int num2){
         int suma = num1 + num2;
         return suma;
     }
}
