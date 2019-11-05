package Miniräknare;

public class CalcEngine {

	static Double PreviousNr = 0.0;
	static Double CurrentNr = 0.0;
	static String InputString = "";
	static String CalcMethod = "";
	static boolean counted = false;
	
	public static void input(String in) {
		
		switch (in) {
		case "AC":
			PreviousNr = 0.0;
			CurrentNr = 0.0;
			InputString = "";
			CalcMethod = "";
			MainCalc.settext("0");
			counted = false;
			
			break;
		case "=":
			execute();
			break;
		case "+":
			calculate(in);
			break;
		case "-":
			if (counted == true) {
					calculate(in);
					counted = false;
			} else {
				if (InputString.equals("")) {
					InputString = InputString + in;
					MainCalc.settext(InputString);
				} else {
					calculate(in);
				}
			}
			
			break;
		case "x":
			calculate(in);
			break;
		case "/":
			calculate(in);
			break;
		case "0":
			if (!InputString.equals("0")) {
				addnum(in);
			}
			break;
		case ".":
			if (!InputString.equals("")) {
				if (!InputString.contains(".")) {
					addnum(in);
				}
			}
			
			break;
		default:
			addnum(in);
			break;
		}
	}
	
	public static void calculate(String in) {
		CalcMethod = in;
		if (CurrentNr != 0.0) {
			PreviousNr = CurrentNr;
			CurrentNr = 0.0;
			InputString = "";
		}
	}
	
	public static void addnum(String in) {
		InputString = InputString + in;
		CurrentNr = Double.parseDouble(InputString);
		MainCalc.settext(InputString);
	}
	
	public static void execute() {
		counted = true;
		
		switch (CalcMethod) {
		case "+":
			PreviousNr += CurrentNr;
			setexe();
			break;
		case "-":
			PreviousNr -= CurrentNr;
			setexe();
			break;
		case "x":
			PreviousNr *= CurrentNr;
			setexe();
			break;
		case "/":
			PreviousNr /= CurrentNr;
			setexe();
			break;
		default:
			break;
		}
	}
	
	public static void setexe() {
		CurrentNr = 0.0;
		InputString = "";
		CalcMethod = "";
		if (PreviousNr % 1 == 0.0) {
			
			int ans = (int) Math.round(PreviousNr);
			
			MainCalc.settext(Integer.toString(ans));
		} else {
			MainCalc.settext(PreviousNr.toString());
		}
		
		
	}
}
