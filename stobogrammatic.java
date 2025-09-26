
public class stobogrammatic {
	public static void main(String args[]) {
		
		System.out.println("Enter your number:- ");
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		
		boolean ans=is_stobogrammatic(n);
		if(ans==true)
		
			System.out.print("it is stobogrammatic number:"+n);
		else
			
			System.out.print("it is not a stobogrammatic number:"+n);
			
			
		
	}


public static boolean is_stobogrammatic(String n){
	if(n==null||n.length()==0) {
		return true;
	}
	HashMap<Character,Character>map=new HashMap<Character,Character>();
	map.put('0', '0');
	map.put('1', '1');
	map.put('8', '8');
	map.put('6', '9');
	map.put('9', '6');
	int left=0;
	int right =n.length()-1;
	while(left<=right) {
		if(!map.containsKey(n.charAt(right))||n.charAt(left)!=map.get(n.charAt(right))){
			return false;
		}
		left++;
		right--;
			
		}
		return true;
	}

}
