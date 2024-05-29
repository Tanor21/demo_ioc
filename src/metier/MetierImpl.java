package metier;

import dao.IDao;

//@Component
//@Service
public class MetierImpl implements IMetier {
	
	//@Autowired //Pour faire l'injection avec spring annotation
	private IDao dao;

	@Override
	public double Calcule() {
		double temp = dao.getTemperature();
		double result = temp*12;
		return result;
	}
	

	public IDao getDao() {
		return dao;
	}

	public void setDao(IDao dao) {
		this.dao = dao;
	}
	
	

}
