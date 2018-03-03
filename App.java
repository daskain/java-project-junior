package calc;

import java.nio.charset.UnsupportedCharsetException;
import java.util.*;

public class App {

	public static void main (String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Введите первый аргумент"); // input first arg
		String oneValue = scanner.nextLine(); 
		Object one = parseInput(oneValue);
		
		System.out.println("Введите оператор");	// input operator
		String operator = scanner.nextLine();
		
		System.out.println("Введите второй аргумент"); // input second arg
		String secondValue = scanner.nextLine();
		Object second = parseInput(secondValue);
		
		
		
		Object result;
		if (operator.equals("+"))
			result = sum(one, second);
		else
			throw new UnsupportedOperationException("Неизвестный оператор: " +operator); // warning if not +
		System.out.println("Ваше выражение: " + oneValue +" " + operator +" " + secondValue + " = " + result); // echo statemetn
		
	}
	
	private static Object parseInput(String value) {
		return Byte.parseByte(value);
	}
	
	
	
	private static Object sum (Object oneValue, Object secondValue) {
		if (oneValue instanceof Byte && secondValue instanceof Byte)
		return (Byte)oneValue + (Byte)secondValue;
		throw new UnsupportedCharsetException("Не могу выполнить операцию на типами" + oneValue.getClass() + " и " + secondValue.getClass()); //warning if not number
		
	}
	
}
