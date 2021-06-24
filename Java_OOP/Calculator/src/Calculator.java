
public class Calculator {
private double num1;
private double num2;
private char op;

public double getNum1() {
	return num1;
}

public void setNum1(double num1) {
	this.num1 = num1;
}

public double getNum2() {
	return num2;
}

public void setNum2(double num2) {
	this.num2 = num2;
}

public char getOp() {
	return op;
}

public void setOp(char op) {
	this.op = op;
}

public double cal ( ) {
	if (op =='+')
	{
		return  num1+num2;
	}
	if (op =='-')
	{
		return  num1-num2;
	}
	
	return 0; 
	
}

}
