

public class Roulette
{

	public String[] value;
	public String[] color;
	public int outcome;

    /*================================================
      Task 1: write the constructor
      ================================================*/
	public Roulette( )
	{ 
		value = new String[38];
		color = new String[38];
		int i;
     
		for (i = 0; i< 37; i++)
			value[i] = Integer.toString(i);
			
		value[37] = "00";
		for (i = 1; i<10; i=i+2)     
			color[i] = "R";
     
		for (i = 2; i<11; i=i+2)     
			color[i] = "B";
     
		for (i = 11; i<18; i=i+2)     
			color[i] = "B";
     
		for (i = 12; i<19; i=i+2)     
			color[i] = "R";
     
		for (i = 20; i<29; i=i+2)     
			color[i] = "B";
     
		for (i = 19; i<28; i=i+2)     
			color[i] = "R";
          
		for (i = 30; i<37; i=i+2)
			color[i] = "R";
     
		for (i = 29; i<36; i=i+2)     
			color[i] = "B";
     
		color[37] = "G";
		color[0] = "G";
	}


	/*================================================
      Task 2: write the spin() method
      ================================================*/
	public void spin()
	{
	   outcome = (int)(Math.random() * (38)); 
	}

	/* ************************************************
       Task 2b: change the instance variable to  

                   private

       and recompile Test1.java and Test2.java

       You should get errors
       ************************************************ */

	/*================================================
      Task 3: write the value() method
      ================================================*/
	public String value()
	{
		String valueoutcome = value[outcome];
		return valueoutcome;
	}

	/*================================================
      Task 4: write the color() method
      ================================================*/
	public String color()
	{
		String color1 = color[outcome];
		return color1;
	}

	/*================================================
      Task 5: write the toString() method
      ================================================*/
	public String toString()   // Write this toString method....
	{
		return value[outcome] + " " + color[outcome];                   
	}
}


