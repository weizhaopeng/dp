package strategy;

public class Duck {
	FlyInter fly;
	QuackInter quack;
	boolean  isAlive;

	public void flyPerformance() {
		fly.fly();
	}
	public void quackPerformance() {
		quack.quack();
	}

	public void setFlyBehavior(FlyInter f) {
		fly = f;
	}
	public void setQuackBehavior(QuackInter q) {
		quack = q;
	}
}


