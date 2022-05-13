
public class ejercicio2 {

	public static void main(String[] args) {
		int calificacion = 10;
		if (calificacion <= 3) {
			System.out.println("Failed!");
		}else if (calificacion <= 5) {
			System.out.println("Insufficient!");
		}else if (calificacion <= 9) {
			System.out.println("Good!");
		}else if (calificacion == 10) {
			System.out.println("Excellent!");
		}else {
			System.out.println("Grade outside range supported!");
		}

	}

}
