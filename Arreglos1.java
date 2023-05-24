import javax.swing.*;
public class Arreglos1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String [] ciudades = {"pereira","cali","bogota","armenia"};
		
		String [] ciudades = new String[4];
		
		for(int j =0;j<4;j++){
			
			ciudades[j] = JOptionPane.showInputDialog("ingrese la ciudad");
		}
		
		
		
		for(String j:ciudades){
			System.out.println(j);
			
		}
		
		

	}

}
