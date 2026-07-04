void main() {

    String opcion = "0";

    while (!opcion.equals("5")) {

        IO.println("CALCULADORA");
        IO.println("1. Sumar");
        IO.println("2. Restar");
        IO.println("3. Multiplicar");
        IO.println("4. Dividir");
        IO.println("5. Salir");

        opcion = IO.readln("Seleccione una opción: ");

        switch (opcion) {

            case "1": {
                int num1 = Integer.parseInt(IO.readln("Ingrese el primer número: "));
                int num2 = Integer.parseInt(IO.readln("Ingrese el segundo número: "));

                int resultado = num1 + num2;

                IO.println("Resultado: " + resultado);
                break;
            }

            case "2": {
                int num1 = Integer.parseInt(IO.readln("Ingrese el primer número: "));
                int num2 = Integer.parseInt(IO.readln("Ingrese el segundo número: "));

                int resultado = num1 - num2;

                IO.println("Resultado: " + resultado);
                break;
            }

            case "3": {
                int num1 = Integer.parseInt(IO.readln("Ingrese el primer número: "));
                int num2 = Integer.parseInt(IO.readln("Ingrese el segundo número: "));

                int resultado = num1 * num2;

                IO.println("Resultado: " + resultado);
                break;
            }

            case "4": {
                int num1 = Integer.parseInt(IO.readln("Ingrese el primer número: "));
                int num2 = Integer.parseInt(IO.readln("Ingrese el segundo número: "));

                if (num2 == 0) {
                    IO.println("No se puede dividir para cero.");
                } else {
                    int resultado = num1 / num2;
                    IO.println("Resultado: " + resultado);
                }
                break;
            }

            case "5": {
                IO.println("Gracias por usar la calculadora.");
                break;
            }

            default: {
                IO.println("Opción inválida.");
            }
        }

        IO.println("");
    }
}