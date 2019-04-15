import decorate.beverage.*;
import decorate.capiaity.*;
import decorate.condiment.*;
import observer.*;
import strategy.*;


public class Demo {
	public static void main(String[] args) {
	    //策略模式
        YanShuiDuck ysd = new YanShuiDuck();
        YanShuiDuck ysd1 = new YanShuiDuck(new CannotFly(), new CannotQuack(), false);
        YellowDuck yd = new YellowDuck();

        System.out.println("我是盐水鸭1");
        ysd.flyPerformance();
        ysd.quackPerformance();

        System.out.println("我是盐水鸭2");
        ysd1.flyPerformance();
        ysd1.quackPerformance();

        System.out.println("我是黄鸭");
        yd.flyPerformance();
        yd.quackPerformance();

        yd.setFlyBehavior(new CannotFly());
        yd.setQuackBehavior(new CannotQuack());

        System.out.println("黄鸭调整后");
        yd.flyPerformance();
        yd.quackPerformance();

        //观察者模式
        Data d = new Data();

        d.setChange(1, 2, 3);
        d.setChange(12, 33, 44);

        //装饰模式
		Beverage coffee = new BigCap(new YeGuo(new Coffee()));
		System.out.println(coffee.getDescription());
		System.out.println(coffee.cost());
	}
}


