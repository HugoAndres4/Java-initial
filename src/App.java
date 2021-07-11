public class App public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        // Tipos de Datos y Operadores
        int resultado = 15 + 32;
        String res = "Hola";
        double resultado2 = 25 / 3;
        int resultado3 = 25 - 3;
        float resultado4 = 58 * 21;
        int resultado5 = 21 % 9;

        // Operadores Unarios (permiten cambiar el valor de una variable)
        resultado++;  //sumarle 1 resultado = resultado + 1
        resultado--;  //restarle 1 resultado = resultado - 1
        resultado = -resultado;
        resultado = +resultado;

        // Operadores Logícos
        boolean respuesta = true;
        respuesta = 5 > 8;
        respuesta = 5 < 8;
        respuesta = 5 >= 8;
        respuesta = 5 <= 8;
        respuesta = 5 != 8; //diferente
        respuesta = 5 == 8; //igual
        respuesta = 12 < 5 && 4 > 1; // && = and en python
        respuesta = 14 < 25 || 1 > 5; // || = or en python

        //Operadores bit a bit
        //&
        //^
        //|

        //Estructuras de Control
        if (respuesta) {
            //Bloque de código
            
        }

    }
 }
