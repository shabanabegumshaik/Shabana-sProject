interface FoodCounsumingNames{
	void breakfast();//public + abstract
	void lunch();
	void dinner();
	
}
public class EatingTime implements FoodCounsumingNames,FastFood{

	public static void main(String[] args) {
		//EatingTime e=new EatingTime();
		FoodCounsumingNames f=new EatingTime();
		
		f.breakfast();
		f.lunch();
		f.dinner();
		FastFood fa=new EatingTime();
		fa.coolDrink();
		fa.cake();
	}

	@Override
	public void breakfast() {
		System.out.println("Idle i like in breakfast");
		
	}

	@Override
	public void lunch() {
		System.out.println("Rice i like in lunch");
		
	}

	@Override
	public void dinner() {
		System.out.println("Chapati i like in dinner");
		
	}

	@Override
	public void coolDrink() {
		System.out.println("juce i like");
		
	}

	@Override
	public void cake() {
		System.out.println("BlackForest i like");		
	}

}
