
package mx.edu.itses.electrisidad.ct.pasaromorir;

import javax.swing.JOptionPane;
 
/**
 *
 * @author cr430
 *///ya se que se ecribe cramer :(
public class grammer {

    public static void main(String[] args) {
   
    JOptionPane.showMessageDialog(null, "Vamos a a chambear");

    // Pedir los coeficientes de la primera ecuación
    String a11Str = JOptionPane.showInputDialog("Primera ecuación:\nIngresa el coeficiente de x:");
    String a12Str = JOptionPane.showInputDialog("Primera ecuación:\nIngresa el coeficiente de y:");
    String a13Str = JOptionPane.showInputDialog("Primera ecuación:\nIngresa el coeficiente de z:");
    String b1Str = JOptionPane.showInputDialog("Primera ecuación:\nIngresa el término independiente:");

    // Pedir los coeficientes de la segunda ecuación
    String a21Str = JOptionPane.showInputDialog("Segunda ecuación:\nIngresa el coeficiente de x:");
    String a22Str = JOptionPane.showInputDialog("Segunda ecuación:\nIngresa el coeficiente de y:");
    String a23Str = JOptionPane.showInputDialog("Segunda ecuación:\nIngresa el coeficiente de z:");
    String b2Str = JOptionPane.showInputDialog("Segunda ecuación:\nIngresa el término independiente:");

    // Pedir los coeficientes de la tercera ecuación
    String a31Str = JOptionPane.showInputDialog("Tercera ecuación:\nIngresa el coeficiente de x:");
    String a32Str = JOptionPane.showInputDialog("Tercera ecuación:\nIngresa el coeficiente de y:");
    String a33Str = JOptionPane.showInputDialog("Tercera ecuación:\nIngresa el coeficiente de z:");
    String b3Str = JOptionPane.showInputDialog("Tercera ecuación:\nIngresa el término independiente:");

    // Convertir los Strings a números
    double a11 = Double.parseDouble(a11Str);
    double a12 = Double.parseDouble(a12Str);
    double a13 = Double.parseDouble(a13Str);
    double b1 = Double.parseDouble(b1Str);

    double a21 = Double.parseDouble(a21Str);
    double a22 = Double.parseDouble(a22Str);
    double a23 = Double.parseDouble(a23Str);
    double b2 = Double.parseDouble(b2Str);

    double a31 = Double.parseDouble(a31Str);
    double a32 = Double.parseDouble(a32Str);
    double a33 = Double.parseDouble(a33Str);
    double b3 = Double.parseDouble(b3Str);

    // Calcular el determinante principal D
    double D = (a11 * a22 * a33) + (a12 * a23 * a31) + (a13 * a21 * a32)
            - (a13 * a22 * a31) - (a11 * a23 * a32) - (a12 * a21 * a33);

        // Verificar si tiene solución
        if (D == 0) {
            JOptionPane.showMessageDialog(null, "El sistema no tiene solución. El determinante es cero.");
        } else {
            // Calcular Dx, Dy, Dz
            double Dx = (b1 * a22 * a33) + (a12 * a23 * b3) + (a13 * b2 * a32)
                      - (a13 * a22 * b3) - (b1 * a23 * a32) - (a12 * b2 * a33);

            double Dy = (a11 * b2 * a33) + (b1 * a23 * a31) + (a13 * a21 * b3)
                      - (a13 * b2 * a31) - (a11 * a23 * b3) - (b1 * a21 * a33);

            double Dz = (a11 * a22 * b3) + (a12 * b2 * a31) + (b1 * a21 * a32)
                      - (b1 * a22 * a31) - (a11 * b2 * a32) - (a12 * a21 * b3);

    // Calcular x, y, z
    double x = Dx / D;
    double y = Dy / D;
    double z = Dz / D;

    
    String resultado = "Solución :\n";
    resultado += "x = " + x + "\n";
    resultado += "y = " + y + "\n";
    resultado += "z = " + z + "\n\n";
    resultado += "Determinante D = " + D;

    JOptionPane.showMessageDialog(null, resultado);
        }
    }
}
