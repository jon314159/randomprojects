public class Prob112
{
	public boolean Increase(int x)
	{
		String tempString1 = new String(x+"");
		int i,j=tempString1.length();
		for(i=1;i<j;i++)
			if(tempString1.charAt(i-1)>tempString1.charAt(i)) return false;
		return true;
	}

	public boolean Decrease(int x)
	{
		String tempString2 = new String(x+"");
		int i,j=tempString2.length();
		for(i=1;i<j;i++)
			if(tempString2.charAt(i-1)<tempString2.charAt(i)) return false;
		return true;
	}

	public Prob112()
	{
		int i,j=0;
		for(i=100;;i++)
		{
			if(Increase(i)==true) continue;
			if(Decrease(i)==true) continue;
			j++;
			if(i*99==j*100) break;
		}
		System.out.println(i);
	}

	public static void main(String args[])
	{
		new Prob112();
	}
}