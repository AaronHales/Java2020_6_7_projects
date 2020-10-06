package aaron.hales.ch5.ls2;

public class CmdParameters {

	public static void main(String[] args) {
		
		int num_args = args.length; // num_args now contains the # of params
		
		if (num_args > 0) { // is args.length greater than zero?
			System.out.println(args[0]);
		}
		
		if (num_args > 1) { // is args.length greater than one?
		System.out.println(args[1]);
		}
		
		if (num_args > 2) {
		System.out.println(args[2]);
		}
		
		if (num_args > 3) {
		System.out.println(args[3]);
		}
		
		if (args[0].equals("help")) {
			System.out.println("this could be your help menu");
		}

	}

}
