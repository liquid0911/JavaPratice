class Card{													//建立一個卡片類別
	private String[] pokerCard = new String[52];			//建立一個有52個值的陣列用來代表一副牌的張數.
	public String[] createPoker(){
	for (int i = 1; i < pokerCard.length+1; i++)		   	//利用迴圈和if將poker的值放進陣列裡.
	{
		if (i > 0 && i < 14)								//1-13為黑桃spade 簡寫S.
		{
			if(i%13==10){pokerCard[i-1]="S:10";}			//為了排版將餘數為10挑出來,
			else if(i%13==11){pokerCard[i-1]="S: J";}		//若餘數為11則放J,12則放Q,13則放K.
			else if(i%13==12){pokerCard[i-1]="S: Q";}
			else if(i%13==0){pokerCard[i-1]="S: K";}
			else if(i%13==1){pokerCard[i-1]="S: A";}
			else{pokerCard[i-1]="S: "+i;}					//剩下的因沒有改換為字母,就直接放值i.
		}
		else if (i > 13 && i < 27)						    //14-26為紅心heart簡寫H.
		{
			if(i%13==10){pokerCard[i-1]="H:10";}
			else if(i%13==11){pokerCard[i-1]="H: J";}
			else if(i%13==12){pokerCard[i-1]="H: Q";}
			else if(i%13==0){pokerCard[i-1]="H: K";}
			else if(i%13==1){pokerCard[i-1]="H: A";}
			else{pokerCard[i-1]="H: "+(i%13);}			    //為了將數字控制在1-9,所以利用除上13的餘數.
		}
		else if (i > 26 && i < 40)					        //27-39為方塊diamond簡寫為D.
		{
			if(i%13==10){pokerCard[i-1]="D:10";}
			else if(i%13==11){pokerCard[i-1]="D: J";}
			else if(i%13==12){pokerCard[i-1]="D: Q";}
			else if(i%13==0){pokerCard[i-1]="D: K";}
			else if(i%13==1){pokerCard[i-1]="D: A";}
			else{pokerCard[i-1]="D: "+(i%13);}
		}
		else if (i > 39 && i < 53)					        //40-52為梅花club簡寫為C.
		{
			if(i%13==10){pokerCard[i-1]="C:10";}
			else if(i%13==11){pokerCard[i-1]="C: J";}
			else if(i%13==12){pokerCard[i-1]="C: Q";}
			else if(i%13==0){pokerCard[i-1]="C: K";}
			else if(i%13==1){pokerCard[i-1]="C: A";}
			else{pokerCard[i-1]="C: "+(i%13);}
		}
	}
	return pokerCard;
}
	public void Shuffling(){
		String tmp;
		for(int i=pokerCard.length;i>1;i--){				//考慮到洗牌機率問題,必須要讓每張牌更換位置
			int k =(int)(Math.random()*i);				    //的機率都相同,所以i的值是從大到小開始,可以
			tmp=pokerCard[i-1];							    //可以再換過位置後就將該卡排除,也就不會造成結
			pokerCard[i-1]=pokerCard[k];					//果重複偏重的問題,也就是說若將random的值固定為
			pokerCard[k]=tmp;								//52,以結果來說則造成某些結果比較多某些結果比較少
		}												    //這就會造成機率不平均。
	}
	public void call(){
		for(int i=0;i<26;i++){System.out.print(pokerCard[i]+", ");}	//為了排版,一列只印出26張卡就換列.
		System.out.println();
		for(int k=26;k<52;k++){System.out.print(pokerCard[k]+", ");}
	}
}
public class PokerShuffle
{
	 
	public static void main(String[] args)
	{
		Card poker =new Card();							//建立物件poker
		poker.createPoker();							//給予每張卡一個值
		poker.Shuffling();								//呼叫洗牌.
		poker.call();									//將洗牌結果印出來
	}
}
