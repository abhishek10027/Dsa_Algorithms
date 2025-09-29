

class nibble{
 
  
  public static void main(String[] args){	
	    System.out.println("Enter your number:");
	    Scanner sc=new Scanner(System.in);
	    int num=sc.nextInt();
	    int newnum;
	    newnum=(((num&0X0F)<<4)|((num&0XF0)>>4));
	    System.out.println("Before nibble swap:"+num);
	    System.out.println("\nAfter nibble swap:"+newnum);
	    
}
}

 
