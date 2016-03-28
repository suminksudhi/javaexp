import org.hibernate.*;
import org.hibernate.cfg.*;

public class PersonDAO{
	
	public void save(Person person){
		Configuration cf = new Configuration();
		SessionFactory sf = sf.configure().buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
			session.save(person);
		tx.commit();
		session.close();
		sf.close();
		cfg.close();
	}
	
}