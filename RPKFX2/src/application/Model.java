package application;

public class Model {
	public float process(float num1,float num2, String op){
		switch(op){
		case "*":{
			return num1 * num2;
			
			}
		case "/":{
			return num1 / num2;
		}
		case "-":{
			return num1 - num2;
		}
		case "+":{
			return num1 + num2;
		}
		default : break;
		}
		return 0;
	}

}
