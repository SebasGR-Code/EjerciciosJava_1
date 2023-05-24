import java.util.*;
public class Arreglos2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner num = new Scanner(System.in);
		
		System.out.println("ingrese las filas");
		int num1 = num.nextInt();
		System.out.println("ingrese las columnas");
		int num2 = num.nextInt();
		
		int [][] matriz = new int[num1][num2];
		
		for(int i=0;i<num1;i++){
			for(int j=0;j<num2;j++){
				
				int num4 = (int) Math.round((Math.random())*100);
				matriz[i][j]= num4; 
				
			}
				
			
		}
		
		for(int []fila:matriz){
			for(int j:fila){
				
				System.out.print(" "+j);
			}
			System.out.println();
		}
		
	}

}
