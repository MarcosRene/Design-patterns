package abstractfactory;

public class FactoryProduce {
	 public static AbstractFactory getForma(boolean bool){   
	      if(bool){
	         return new FormaFactory();
	      }
		return null;
	 }
}
