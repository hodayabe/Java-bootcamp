package bootcamp.oop.exeRunner;

import bootcamp.oop.exercise.Television;

public class Runner {


	public static void main(String[] args) {
		
		
		Television tv1 = new Television("TUSHIBA", 2001,600, 6.7f,"RF");
		tv1.setModel("G45");

		Television tv2 = new Television("Panasonic", 111,600, 1f,"RF");
		tv2.setModel("3333");


		System.out.println(tv1);
		System.out.println(tv2);
		
		int res = tv1.isBigger(tv2);
		String resText = "The Same as";
		if(res==1)
			resText = "Bigger than";
		else if (res == -1)
			resText = "Smaller than";

		resText = "TV1 is "+resText+" Tv2";
		System.out.println(resText);






	}

}