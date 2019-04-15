package strategy;

public class YellowDuck extends Duck {
	public YellowDuck() {
		fly = new FlyWithWings();
		quack = new QuackGa();
		isAlive = true;
	}
}
