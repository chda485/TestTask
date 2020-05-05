
public class MyClass {

/*static void equal (String s1, String s2)
{
	if (equals(s1,s2))
		System.out.println("Equals");
	else
		System.out.println("Not");
}*/
	public static void main(String[] args) {
		//new
		for (int i = 3; i < 100; i++)
		{
			int chet = 0;
			for(int j = 2; j < 100; j++ )
			{
				if ((i%j) == 0 && i != j)
					break;
				else chet = j;
			}
			if (chet==99)
				System.out.println(i);
		}
	}
}


