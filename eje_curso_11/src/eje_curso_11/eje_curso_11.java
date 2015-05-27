
package eje_curso_11;

/**
 *
 * @author davidmriverog
 */
public class eje_curso_11 {
    
    public static void main(String[] args) {
        
        Personas persona = new Personas();
        // Cargamos Datos
        persona.inicializar();
        // Mostramos Información
        persona.imprimir();
        // Validamos la Edad de la Persona
        persona.validateEdad();
    }
    
}
