package practica;

import javax.swing.JOptionPane;

public class texto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto=JOptionPane.showInputDialog(null,"introducir texto, cadena vacia para terminar","introducir texto", JOptionPane.INFORMATION_MESSAGE);

		String resultante="";

		    while(!texto.isEmpty()) {
		    	resultante+=texto;
		    	
		    	texto=JOptionPane.showInputDialog(null,"introducir texto, cadena vacia para terminar","introducir texto", JOptionPane.INFORMATION_MESSAGE);
		    	
		    	
		    	
		    }
				JOptionPane.showMessageDialog(null,resultante,"reslutado",JOptionPane.INFORMATION_MESSAGE);
			}

		

	}

		
		



