package qa;

public class CommandArguments {

	public static void main(String[] args) {
		
		// 3). Write Java program to print the command line arguments?
		if(args.length > 0) {
			System.out.println("The command line arguments are:" );
			
			for(String val : args) {
				System.out.println(val);
			}
		} else {
			System.out.println("No command line arguments found");
		}
	}
	}


