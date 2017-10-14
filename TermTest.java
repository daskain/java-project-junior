import java.util.Scanner;

public class TermTest
{
	public static void main (String[] args) {
	menu();
	}
		
	
	static void menu () {
		System.out.println("Меню терминала iWL25x.\n1) Меню кассира;\n2) Меню администратора.");
		System.out.print("Ваш выбор - ");
		switch (but()) {
		case 1: menuKass();
		break;
		case 2: menuAdm();
		break;
		default: System.out.print("Вы ввели неверную команду. Вернуться назад или заверишть работу y/n? ");
		Scanner en = new Scanner (System.in);
		String ln = en.nextLine();
		switch (ln) {
			case "y": menu();
			break;
			case "n": System.out.println("Завершение работы!");
			break;
			}
			
		}
	}
	static int but() {
		Scanner in = new Scanner (System.in);
		int but = in.nextInt();
		return (but);
	}
	static void menuKass() {
		System.out.println("Меню кассира");
	}
	static void menuAdm () {
		System.out.println("Меню администратора");
	}
		
		
}
	


   

    

    	