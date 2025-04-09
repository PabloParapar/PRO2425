package src.ud4.Boletin4.Vectores;

/**
 * @author lopparpab
 */
public class Ejercicio6 {
    public static void main(String[] args) {
        imprimirMenuBanco();
        imprimirMenuNuevaCuenta();
    }
    public static void imprimirMenuBanco() {
        System.out.println("""
                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                ┃        \033[36mGestionar Banco    \u001b[0m            ┃
                ┠─────┬─────────────────────────────────┨
                ┃  \33[33ma\u001b[0m  │  \33[33mNuevo Cliente\u001b[0m                  ┃
                ┠─────┼─────────────────────────────────┨
                ┃  \33[33mb\u001b[0m  │  \33[33mListar Clientes y sus Cuentas\u001b[0m  ┃
                ┠─────┼─────────────────────────────────┨
                ┃  \33[33mc\u001b[0m  │  \33[33mNueva Cuenta\u001b[0m                   ┃
                ┠─────┼─────────────────────────────────┨
                ┃  \33[33md\u001b[0m  │  \33[33mIngreso en Efectivo\u001b[0m            ┃
                ┠─────┼─────────────────────────────────┨
                ┃  \33[33me\u001b[0m  │  \33[33mRetirar Efectivo\u001b[0m               ┃
                ┠─────┼─────────────────────────────────┨
                ┃  \33[33mf\u001b[0m  │  \33[33mConsultar Saldo\u001b[0m                ┃
                ┠─────┼─────────────────────────────────┨
                ┃  \033[31mg\u001b[0m  │  \033[31mSalir\u001b[0m                          ┃
                ┗━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                """);
    }
    public static void imprimirMenuNuevaCuenta() {
        System.out.println("""
                ┏━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┓
                ┃        \033[36mGestionar Banco    \u001b[0m            ┃
                ┠─────┬─────────────────────────────────┨
                ┃  \33[33ma\u001b[0m  │  \33[33mCuenta Corriente\u001b[0m               ┃
                ┠─────┼─────────────────────────────────┨
                ┃  \33[33mb\u001b[0m  │  \33[33mCuenta Vivienda\u001b[0m                ┃
                ┠─────┼─────────────────────────────────┨
                ┃  \33[33mc\u001b[0m  │  \33[33mFondo de Inversion\u001b[0m             ┃
                ┠─────┼─────────────────────────────────┨
                ┃  \033[31md\u001b[0m  │  \033[31mSalir\u001b[0m                          ┃
                ┗━━━━━┷━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━┛
                """);
    }
}
