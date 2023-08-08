package JavaProgram.GFG;

public class Cutting_binary_string {
	static int cuts(String s)
    {
        
          char ch[]=s.toCharArray(); int n = s.length();
          int temp[] = new int[n+1];
          temp[0]=0;
          
          for(int i=1; i<=n; i++)
          {
              int a=i-1;
              if(ch[a]=='0') temp[i]=-1;
              else{
                  temp[i]=-1;
                  int curr_ans=Integer.MAX_VALUE;
                  int to_dec=0;
                  for(int j=0; j<i; j++)
                  {
                      if(ch[a-j]=='1')
                      {
                          to_dec += 1<<j;
                          if(pow_of_5(to_dec) && temp[a-j]!=-1)
                          {
                               curr_ans = Math.min(1 + temp[a-j] , curr_ans);
                          }
                      }
                  }
                   if(curr_ans!=Integer.MAX_VALUE)
                    temp[i]=curr_ans;
                 } 
          }
          return temp[n];
        
    }
     static boolean pow_of_5(long n)
    {
        if(n==0)return false;
        if(n==1)return true;
        if(n%5!=0)return false;
        else return pow_of_5(n/5);
    }


	public static void main(String[] args) {
		String s = "101101101";
		System.out.println(cuts(s));

	}

}
