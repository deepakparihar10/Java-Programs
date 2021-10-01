class stringEqualsIgnoreCase
{
	public static void main(String args[])
	{
		String str1="JAVA ProgramPming";
		String str2="Java ProgramPming";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println("\n\n------------------\n\n");
		Boolean res=str1.equalsIgnoreCase(str2);
		System.out.println(res);
	}
}