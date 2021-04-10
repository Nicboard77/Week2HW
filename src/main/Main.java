package main;

public class Main {

	public static void main(String[] args) {
		boolean isHotOutside = true;
		boolean isWeekday = false;
		boolean hasMoneyInPocket = true;
		//These are the boolean values which determine the base values
		double costOfMilk = 2.99;
		double moneyInWallet = 36.74;
		int thirstLevel = 4;
		//These are the values which I will use to create my third set of variables
		boolean shouldBuyIceCream = isHotOutside && hasMoneyInPocket;
		boolean willGoSwimming = isHotOutside && !isWeekday;
		boolean isAGoodDay = isHotOutside && hasMoneyInPocket && !isWeekday;
		boolean willBuyMilk = isHotOutside && thirstLevel >= 3 && moneyInWallet >= costOfMilk*2;
		//These boolean variables use the previous ones to determine different situations
		System.out.println(shouldBuyIceCream);
		System.out.println(willGoSwimming);
		System.out.println(isAGoodDay);
		System.out.println(willBuyMilk);
		//These print lines print all of the variables previously created

	}

}
