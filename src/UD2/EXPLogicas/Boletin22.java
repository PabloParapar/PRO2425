package src.UD2.EXPLogicas;

public class Boletin22 {
    public static void main(String[] args) {
        //EJERCICIO 1
        System.out.println("\n\tBoletin 2 2 | Ejercicio 1\n");

        int nota = 2;

        if (nota <= 10 && nota >= 0) {
            System.out.println("La nota " + nota + " es correcta");
        } else {
            System.out.println("La nota " + nota + " es incorrecta");
        }

        nota = -5;
        if (nota <= 10 && nota >= 0) {
            System.out.println("La nota " + nota + " es correcta");
        } else {
            System.out.println("La nota " + nota + " es incorrecta");
        }

        nota = 12;
        if (nota <= 10 && nota >= 0) {
            System.out.println("La nota " + nota + " es correcta");
        } else {
            System.out.println("La nota " + nota + " es incorrecta");
        }

        //EJERCICIO 2
        System.out.println("\n\tBoletin 2 2 | Ejercicio 2\n");

        nota = 6;
        if (nota <= 10 && nota >= 0) {
            System.out.println("La nota " + nota + " es correcta");
            if (nota >= 5) {
                System.out.println("Usted está aprobado");
            } else {
                System.out.println("Usted está suspenso");
            }
        } else {
            System.out.println("La nota " + nota + " es incorrecta");
        }
        nota = 3;
        if (nota <= 10 && nota >= 0) {
            System.out.println("La nota " + nota + " es correcta");
            if (nota >= 5) {
                System.out.println("Usted está aprobado");
            } else {
                System.out.println("Usted está suspenso");
            }
        } else {
            System.out.println("La nota " + nota + " es incorrecta");
        }

        //EJERCICIO 3
        System.out.println("\n\tBoletin 2 2 | Ejercicio 3\n");

        int numeroEntero = 1;

        if (numeroEntero != 0) {
            if (numeroEntero % 2 == 0) {
                System.out.println("El número " + numeroEntero + " es par");
            } else {
                System.out.println("El número " + numeroEntero + " es impar");
            }
        } else {
            System.out.println("Su número es cero");
        }
        numeroEntero = 1254;
        if (numeroEntero != 0) {
            if (numeroEntero % 2 == 0) {
                System.out.println("El número " + numeroEntero + " es par");
            } else {
                System.out.println("El número " + numeroEntero + " es impar");
            }
        } else {
            System.out.println("Su número es cero");
        }
        numeroEntero = 0;
        if (numeroEntero != 0) {
            if (numeroEntero % 2 == 0) {
                System.out.println("El número " + numeroEntero + " es par");
            } else {
                System.out.println("El número " + numeroEntero + " es impar");
            }
        } else {
            System.out.println("Su número es cero");
        }

        //EJERCICIO 4
        System.out.println("\n\tBoletin 2 2 | Ejercicio 4\n");

        double precioUnidad = 100;
        int cantidadCompra = 102;
        double precioFinal = precioUnidad * cantidadCompra;
        System.out.println("Precio real: " + precioFinal + "€");
        if (cantidadCompra <= 24) {
            if (cantidadCompra < 10) {
                // < 10 | sin descuento
                System.out.println("Sin Descuento");
                precioFinal *= 1;
            } else {
                //[10,24] | descuento del 10%
                System.out.println("Descuento del 10%");
                precioFinal *= 0.9;
            }
        } else {
            if (cantidadCompra <= 100) {
                //[25,100] | descuento del 20%
                System.out.println("Descuento del 20%");
                precioFinal *= 0.8;
            } else {
                // >100 | descuento del 40%
                System.out.println("Descuento del 40%");
                precioFinal *= 0.6;
            }
        }
        System.out.println("Precio con descuento: " + precioFinal + "€");

        //EJERCICIO 5
        System.out.println("\n\tBoletin 2 2 | Ejercicio 5\n");

        int numeroHijos = 5;
        double salarioBruto = 1800, salarioNeto;

        if (numeroHijos <= 7) {
            if (numeroHijos <= 2) {
                //20%
                salarioNeto = salarioBruto*0.8;
            } else if (numeroHijos <= 5) {
                //15%
                salarioNeto = salarioBruto*0.85;
            } else {
                //10%
                salarioNeto = salarioBruto*0.9;
            }
        } else if (numeroHijos < 10) {
            //5%
            salarioNeto = salarioBruto*0.95;
        } else {
            //0%
            salarioNeto = salarioBruto;
        }
        System.out.println("Con "+numeroHijos+" hijos mi salario de "+salarioBruto+"€ pasa a ser "+salarioNeto+"€");

        //EJERCICIO 6
        System.out.println("\n\tBoletin 2 2 | Ejercicio 6\n");

        int insertarHora, insertarMinuto;
        insertarHora = 15;
        insertarMinuto = 20;
        if(insertarHora > 12){
            System.out.println((insertarHora-12)+":"+insertarMinuto+" PM");
        }else {
            System.out.println(insertarHora+":"+insertarMinuto+" AM");
        }
        insertarHora = 5;
        if(insertarHora > 12){
            System.out.println((insertarHora-12)+":"+insertarMinuto+" PM");
        }else {
            System.out.println(insertarHora+":"+insertarMinuto+" AM");
        }

        //EJERCICIO 7
        System.out.println("\n\tBoletin 2 2 | Ejercicio 7\n");

        int a, b, c, d;
        a = 1; b= 2; c = 6; d = 4;
        int enteroN = a*1000+b*100+c*10+d;
        int redondeoN;
        if (c >= 5){
            redondeoN = a*1000+ ++b*100;
        } else {
            redondeoN = a*1000 + b*100;
        }

        System.out.println(enteroN+" se redondea a "+redondeoN);

        //EJERCICIO 8
        System.out.println("\n\tBoletin 2 2 | Ejercicio 8\n");

        int mes = 3;
        switch (mes){
            case 2: //Febrero
                System.out.println("28 días");
                break;
            case 1: //Enero
            case 3: //Marzo
            case 5: //Mayo
            case 7: //Julio
            case 8: //Agosto
            case 10: //Octubre
            case 12: //Diciembre
                System.out.println("31 días");
                break;
            case 4: //Abril
            case 6: //Junio
            case 9: //Septiembre
            case 11: //Noviembre
                System.out.println("30 días");
                break;
        }

        //EJERCICIO 9
        System.out.println("\n\tBoletin 2 2 | Ejercicio 9\n");

        

        //EJERCICIO 10
        System.out.println("\n\tBoletin 2 2 | Ejercicio 10\n");
        //EJERCICIO 11
        System.out.println("\n\tBoletin 2 2 | Ejercicio 11\n");
        //EJERCICIO 12
        System.out.println("\n\tBoletin 2 2 | Ejercicio 12\n");
        //EJERCICIO 13
        System.out.println("\n\tBoletin 2 2 | Ejercicio 13\n");
        //EJERCICIO 14
        System.out.println("\n\tBoletin 2 2 | Ejercicio 14\n");
        //EJERCICIO 15
        System.out.println("\n\tBoletin 2 2 | Ejercicio 15\n");
        //EJERCICIO 16
        System.out.println("\n\tBoletin 2 2 | Ejercicio 16\n");
        //EJERCICIO 17
        System.out.println("\n\tBoletin 2 2 | Ejercicio 17\n");
        //EJERCICIO 18
        System.out.println("\n\tBoletin 2 2 | Ejercicio 18\n");
        //EJERCICIO 19
        System.out.println("\n\tBoletin 2 2 | Ejercicio 19\n");

    }
}
