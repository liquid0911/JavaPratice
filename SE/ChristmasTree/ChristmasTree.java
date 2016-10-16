public class ChristmasTree
{
	public static void main(String[] args)
	{
		for (int i = 0; i < 10; i++)			//最外層的for迴圈代表會有10次的換行
		{

			for (int j = i; j < 4; j++)			//每一次的迴圈都會印出一個空白,初值j=i即i=0,條件為j<4,每跑一次就
			{									//印出一個空白,第一輪總共會印出4個空白,第二輪就會印出3個空白以此類推。
				System.out.print(" ");
			}

			for (int k = 0; k < i; k++)			//k的初值為0,而k必須小於i,不然就不執行這個迴圈,若達成條件則會進入第
			{									//第一個if判斷i是否大於4,這會影響到聖誕樹樹幹的部分,若大於4,則會在第
				if(i>4){						//5行開始印出4個空白,若小於4,則會"*",印出的數量取決於i的值。
					System.out.print("    ");
					break;
				}
				System.out.print("*");
			}
			System.out.print("*");				//這段為最外層的迴圈的直述句,每跑一次就印一顆"*",作用為印出最中間的樹幹部分。
			for (int m = 0; m < i; m++)			//m的初始值為0,條件為m必須小於i,進入迴圈的第一個便需要通過if進行判斷i是否
			{									//大於4,若大於4則直接停止這個迴圈,這是為了做出樹幹右邊的空白部分。
				if(i>4){
					break;
				}
				System.out.print("*");			//當i<4時,每跑一次迴圈便會印出一顆"*"。
			}
			System.out.println();
		}
	}
}
