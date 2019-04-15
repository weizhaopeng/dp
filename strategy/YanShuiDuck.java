package strategy;

public class YanShuiDuck extends Duck {
	public YanShuiDuck() {
		fly = new CannotFly();
		quack = new CannotQuack();
		isAlive = false;
	}
	public YanShuiDuck(FlyInter f, QuackInter q, boolean isAliveIn) {
		fly = f;
		quack = q;
		isAlive = isAliveIn;
	}
}
