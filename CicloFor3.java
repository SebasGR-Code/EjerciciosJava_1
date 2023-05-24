import javax.swing.*;
public class CicloFor3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char variable ='@'; 
		int contador=0;
		char punto = '.';
		int contador1= 0;
		String mail = JOptionPane.showInputDialog("ingrese el correo");
	
		for(int i=0;i<mail.length();i++){
			
			char arroba = mail.charAt(i);
			
			if(variable==arroba){
			contador++;	
			
			}
			if(punto==arroba){
				
				contador1++;
			}
			
		}
		
		if(contador==1){
			if (contador1>=1 && contador1<=3){
				
			
			System.out.println("el correo es valido");
			
			}else{
				System.out.println("el correo no es valido");
			}
			
			
		}
		

	}

}
