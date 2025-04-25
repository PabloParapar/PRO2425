import Ejercicio2.*;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

//Para ejecutar jacoco, teclear en el terminal:  ./gradlew test jacocoTestReport
//Si no se ejecuta jacoco, teclear en el terminal:
//  $env:JAVA_HOME="XXX"
//  Sustituyendo XXX por la ruta de java que aparece en la carpeta "external libraries" del IDE

public class Ejercicio2Test {
    @Test
    public void testExamen() {
        Persona persona1 = new Persona("madre pablo", "parapar", "parapar");
        persona1.setFechaNacimiento(LocalDate.of(1972, 6, 14));
        System.out.println(persona1);
        CentroEducativo iesMuralla = new CentroEducativo();

        Estudiante estudiante1 = new Estudiante(
                "Pablo", "López", "Parapar",
                Madurez.adulto, persona1, iesMuralla, "1-DAM DUAL", Casa.Ravenclaw);

        assertEquals(1, 1);
    }
}
