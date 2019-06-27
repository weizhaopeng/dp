import adapter.InformationAdapter;
import adapter.InformationFormat;
import adapter.InformationSubmit;
import command.commands.Command;
import command.commands.ComputerCommand;
import command.commands.LightCommand;
import command.controler.Controler;
import command.device.Computer;
import command.device.Device;
import command.device.Light;
import decorate.beverage.*;
import decorate.capiaity.*;
import decorate.condiment.*;
import facade.hotel.Hotel;
import facade.hotel.RujiaHotelfacade;
import factory.material_factory.MaterialFactory;
import factory.material_factory.NYMaterialFactory;
import factory.pizza.Pizza;
import factory.pizza_store.NYPizzaStore;
import factory.pizza_store.PizzaStore;
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
        User u = new User();
        //在d中的ArrayList中进行注册
        d.addObserver(u);

        d.setChange(1, 2, 3);
        d.setChange(12, 33, 44);

        //装饰模式
		Beverage coffee = new BigCap(new YeGuo(new Coffee()));
		System.out.println(coffee.getDescription());
		System.out.println(coffee.cost());

		//工厂模式
		MaterialFactory mf = new NYMaterialFactory();
		PizzaStore ps = new NYPizzaStore(mf);
		Pizza pizzaOrdered = ps.orderPizza(2);
		pizzaOrdered.printDetail();

		//命令模式
        Device light = new Light(),
                computer = new Computer();
        Command lightCommand = new LightCommand(light),
                computerCommand = new ComputerCommand(computer);
        Controler controler = new Controler(lightCommand, computerCommand);

        controler.lightOn();
        controler.lightOff();
        controler.computerOff();
        controler.computerOn();
        controler.computerStandBy();

        controler.undo();
        //适配器模式
        InformationSubmit infoS = new InformationSubmit(
                "weizhaopeng",
                "123456",
                24,
                "江苏省南京市江宁区",
                "18851755120");

        InformationFormat infoF = new InformationAdapter(infoS);
        System.out.println("用户数据：\n"+infoF.getInformation());

        //外观模式
        Hotel h = new RujiaHotelfacade();

        if (h.orderRoom())
            System.out.println("预定成功\n");
        else
            System.out.println("预定失败\n");
    }
}


