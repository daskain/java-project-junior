import java.util.Scanner;

public class TermTest
{
	public static void main (String[] args) {
	menu();
	}
		
	
	static void menu () {
		System.out.println("���� ��������� iWL25x.\n1) ���� �������;\n2) ���� ��������������.");
		System.out.print("��� ����� - ");
		switch (but()) {
		case 1: menuKass();
		break;
		case 2: menuAdm();
		break;
		default: System.out.print("�� ����� �������� �������. ��������� ����� ��� ��������� ������ y/n? ");
		Scanner en = new Scanner (System.in);
		String ln = en.nextLine();
		switch (ln) {
			case "y": menu();
			break;
			case "n": System.out.println("���������� ������!");
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
		System.out.println("���� �������");
	}
	static void menuAdm () {
		System.out.println("���� ��������������");
	}
		
		
}
	


   

    

    	