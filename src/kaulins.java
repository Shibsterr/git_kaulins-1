import java.util.Random;
import java.util.Scanner;

public class kaulins {
	static int mestKaulinu(int reizes){
	int skaitlis=0;
	Random rand = new Random();
	for(int i=0; i<=reizes; i++){
	skaitlis = rand.nextInt(6)+1;
	System.out.println("Uzkrita skaitlis: "+skaitlis);
	}
	return skaitlis;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int izvele,reizes,pedejais = 0;
		do{
			System.out.println("1 - Mest kauliņu || 2 - Apskatīt pedējo uzmesto kauliņu ||3 - Apturēt programmu");
			izvele = scan.nextInt();
			switch(izvele){
			case 1:
				do{
					System.out.println("Cik reizes mest kauliņu?\n");
					reizes = scan.nextInt();
				}while(reizes<1);
				pedejais = mestKaulinu(reizes);
				break;
				
			case 2:
				System.out.println("Pedējais uzmestais skaitlis ir: "+pedejais);
				break;
			case 3:
				System.out.println("Programma ir apturēta");
				break;
			}
		}while(izvele != 3);
		scan.close();
	}
}
