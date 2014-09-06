import java.util.Random;
public class CartasAleatorias {
			public static int j=0;
		public static int k=0;
		public static int d=0;
		public static int a=0;

		public static void cartas(){ 
			Random rnd = new Random();
			//Random escogera aleatoriamente las cartas que hemos guardado en los vectores.
			do{
				CartasAleatorias.j= (int) (Math.random() * 15) + 0;
				CartasAleatorias.k= (int) (Math.random() * 15) + 0;	
			}while(CartasAleatorias.j==CartasAleatorias.k);
			
			do{
				CartasAleatorias.d= (int) (Math.random() * 15) + 0;
				CartasAleatorias.a= (int) (Math.random() * 15) + 0;	
			}while(CartasAleatorias.d==CartasAleatorias.a);

		}		
}
