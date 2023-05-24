import javax.swing.*;
public class CiclosFor1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		long numero = 1L;
		int num = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
		
		for (int i =1;i<=num;i++){
			
			numero = numero*i;
			
		}
		
		System.out.print("el factorial del numero es"+ numero);
		
		

	}

}
