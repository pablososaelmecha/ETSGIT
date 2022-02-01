import java.util.Scanner;

public class ajedre {
	
	
	static void menu(){
		Scanner sc = new Scanner(System.in);
		
		char[][] hori = new char[8][8];
int j;
	for(int i=0;i<hori.length;i++){
			
		for(int k=0;k<hori.length;k++){
			int j=(k+i);
				if(j%2==0){
						hori[i][k]= 'N';
				}else{ 
					hori[i][k]= 'B';}

		System.out.print(hori[i][k]);
	}

	
System.out.println("");
	}


}

	
		
	
	public static void main(String[ ] arg){
		menu();
	}
	

}