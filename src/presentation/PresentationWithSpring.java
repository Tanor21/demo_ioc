package presentation;


import metier.IMetier;

public class PresentationWithSpring {

	public static void main(String[] args) {
		
		// Injection avec fichier de configuration xml
		/*
		 * ApplicationContext context = new
		 * ClassPathXmlApplicationContext("config.xml");
		 * 
		 * IMetier metier = (IMetier) context.getBean("metier");
		 * 
		 * System.out.println(metier.Calcule());
		 */
		
		
		
		// Injection avec spring annotation
		
		/*
		 * ApplicationContext springContext = new
		 * AnnotationConfigApplicationContext("dao", "metier");
		 * 
		 * IMetier metier = (IMetier) springContext.getBean(IMetier.class);
		 * 
		 * System.out.println(metier.Calcule());
		 */
	}

}
