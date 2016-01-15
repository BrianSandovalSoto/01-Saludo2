import javax.swing.JOptionPane;
/**
 * 
 * @author Brian David Sandoval Soto
 *
 */
public class Saludo {

	public static void main(String[] args) {
		String nombre ="Brian";
		String edad="21";
		
		//System.out.println("Hola: "+ nombre); 		// no concatenar con +
		//System.out.printf("Hola: %s", nombre);		//concatenar con %s
		
		JOptionPane.showMessageDialog(null, String.format("Hola: %s tu edad es de: %s años de edad", nombre, edad)); //concatenar con JOptionPhane
		
		
	}
}
