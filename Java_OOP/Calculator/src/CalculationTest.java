
public class CalculationTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		calc.setNum1(3);
		calc.setNum2(3.3);
		calc.setOp('+');
		System.out.println(calc.cal());

	}

}
