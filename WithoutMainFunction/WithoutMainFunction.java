class WithoutMainFunction
{
	static
	{
		//printing statement!
		System.out.println("We are in the static block!");
		//calling a static function
		endAlert();
		//exit the program
		System.exit(0);
	}
	static void endAlert()
	{
		System.out.println("This is the end alert of the program!");
	}
}
