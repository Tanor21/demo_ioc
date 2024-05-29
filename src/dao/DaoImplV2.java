package dao;

public class DaoImplV2 implements IDao {

	@Override
	public double getTemperature() {
		/*
		 * Dans cette version, je me connecte a un web service pour recuperer la temperature.
		 */
		double data = 32;
		return data;
	}

}
