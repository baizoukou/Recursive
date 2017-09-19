import java.util.Stack;
import java.io.*;


public class CalDriver {
	public static void main (String[] args){
		boolean quit = false;
		String input;
		double x , y, z;
		Stack operands = new Stack();
		while (!quit)
		{
			input = getString("RPN> ");
			switch (input.charAt(0))
			{ case 'Q':
				quit = true;
				break;
				
			case '+':
				y = Double.parseDouble((String)operands.peek());
				operands.pop();
				x = Double.parseDouble((String)operands.peek());
				operands.pop();
				z = x + y;
				System.out.println("\t" + x + "+" + y + "=" + z);
				operands.push(new Double (z).toString());
				break;
				
			case '-':
				y = Double.parseDouble((String)operands.peek());
				operands.pop();
				x = Double.parseDouble((String)operands.peek());
				operands.pop();
				z = x - y ;
				System.out.println("\t" + x + "-" + y + " = " + z);
				operands.push(new Double (z).toString());
				break;
				
			case '*':
				y = Double.parseDouble((String)operands.peek());
				operands.pop();
				x = Double.parseDouble((String)operands.peek());
				operands.pop();
				z = x * y;
				System.out.println("\t" + x + "*" + y + "=" + z);
				operands.push(new Double(z).toString());
				break;
				
			case '/' :
				y = Double.parseDouble((String)operands.peek());
				operands.pop();
				x = Double.parseDouble((String)operands.peek());
				operands.pop();
				z = x / y;
				System.out.println("\t" + x + "/" + y + "=" + z);
				operands.push(new Double(z).toString());
				break;
				
				default:
					operands.push(input);
			}
		}
	}
	
	private static String getString(String prompt){
		System.out.println(prompt);
		InputStreamReader iSReader = new InputStreamReader(System.in);
		BufferedReader bReader = new BufferedReader(iSReader);
		String input = "";
		try{input = bReader.readLine();}
		catch (IOException e){System.out.println(e);}
	return input;
	}
}
	/*
	 * infix & postfix
	 * expression
	 * */
	
//	try { Stack stack = new Stack(); 
//	InputStreamReader reader = new InputStreamReader(System.in); 
//	StreamTokenizer tokens = new StreamTokenizer(reader); tokens.ordinaryChar(’/’); // sinon ce serait un commentaire
//	tokens.eolIsSignificant(true); // false est la valeur par défaut
//	int tokenType; System.out.print("Enter an  infix expression : ");
//	while ((tokenType=tokens.nextToken()) != StreamTokenizer.TT_EOL) { char ch = (char)tokenType;
//	if (tokenType==StreamTokenizer.TT_NUMBER) System.out.print(tokens.nval + " ");
//	else if (ch==’+’ || ch==’-’ || ch==’*’ || ch==’/’) stack.push(new Character(ch));
//	else if (ch==’)’) System.out.print((Character)stack.pop()+" "); }
//	while (!stack.empty()) 
//  System.out.print((Character)stack.pop()+" "); } 
//	catch (Exception e) 
// { System.out.println(e); }
//	}
//	}
	//}


