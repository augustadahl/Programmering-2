package Miniräknare;

public class CalcEngine {

	static Double PreviousNr = 0.0;
	static Double CurrentNr = 0.0;
	static String InputString = "";
	static String CalcMethod = "";
	
	public static void input(String in) {
		
		switch (in) {
		case "AC":
			PreviousNr = 0.0;
			CurrentNr = 0.0;
			InputString = "";
			MainCalc.settext(CurrentNr);
			
			break;
		case "=":
			execute();
			break;
		case "+":
			calculate(in);
			break;
		case "-":
			calculate(in);
			break;
		case "x":
			calculate(in);
			break;
		case "/":
			calculate(in);
			break;
		default:
			InputString = InputString + in;
			CurrentNr = Double.parseDouble(InputString);
			MainCalc.settext(CurrentNr);
			break;
		}
	}
	
	public static void calculate(String in) {
		if (CurrentNr != 0.0) {
			PreviousNr = CurrentNr;
			CurrentNr = 0.0;
			InputString = "";
			MainCalc.settext(CurrentNr);
			CalcMethod = in;
		}
	}
	
	public static void execute() {
		switch (CalcMethod) {
		case "+":
			
			break;
		case "-":
		
			break;
		case "x":
			
			break;
		case "/":
			
			break;
		default:
			break;
		}
	}
}
