import java.util.*; 

public class Balanced_paranthesis {
	
	public static boolean balanced_paranthesis(String str){
		Stack stack = new Stack();
		char[] charArray= str.toCharArray();
		for(int i=0;i<str.length();i++) {
			char current = charArray[i];
			if(current =='{' || current =='[' || current =='(' ) {
				stack.push(current);
			continue;
			}
			if(stack.isEmpty()) {
				return false;
			}
			
			char popChar;
			switch (current) {
			case')':
				popChar = (char) stack.pop();
				if(popChar == '{' || popChar == '[')
					return false;
			break;
			case '}':
				popChar = (char) stack.pop();
				if(popChar == '(' || popChar == '[')
					return false;
			break;
			case']':
				popChar = (char) stack.pop();
				if(popChar == '(' || popChar == '{')
					return false;
			break;
		}
	}
		return (stack.isEmpty()); 
	}

	public static void main(String[] args) {
		String inputStr;    
        Scanner sc = new Scanner(System.in);   
          
        System.out.println("Enter input string to check:");    
        inputStr = sc.nextLine();   
          
      
        if (balanced_paranthesis(inputStr))   
            System.out.println("Input string "+inputStr+" is balanced.");   
        else   
            System.out.println("Input string "+inputStr+" is not balanced.");   
    }   

}
