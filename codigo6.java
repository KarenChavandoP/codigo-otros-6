public class codigo6 {
    public static void main(String[] args) {
        int[] n = new int[20];

        for (int i = 0; i < 20; i++) //La sintaxis del bucle for está mal escrita, escribí i++


        System.out.println("\n¿Qué números quiere resaltar? ");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): "); //escribí  System.out.print
        int opcion = Integer.parseInt(System.console().readLine()); //faltaba un parentesis

        int multiplo = (opcion == 1) ? 5 : 7; // está mal escrita, debería ser (opcion == 1) ? 5 : 7

        for (int e : n) { // cambio for (int e : n) en lugar de foreach (char e : n).
            if (e % multiplo == 0) {
                System.out.print("[" + e + "] "); //escribo System.out.println
            } else {
                System.out.print(e + " ");
            } //estaba mal cerrada
        }
    }
}

