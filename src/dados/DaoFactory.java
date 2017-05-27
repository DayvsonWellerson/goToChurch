package dados;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DaoFactory {
	private static final EntityManagerFactory factory;

    static {
    	factory = Persistence.createEntityManagerFactory("gotochurch");
    }
    
    public static DaoArea getDaoArea(){
    	DaoArea da = new DaoArea();
		da.setEntityManager(factory);
		return da;
    }
    
    public static DaoCongregacao getDaoCongregacao(){
    	DaoCongregacao dc = new DaoCongregacao();
		dc.setEntityManager(factory);
		return dc;
    }
    
    public static DaoSetor getDaoSetor(){
    	DaoSetor ds = new DaoSetor();
		ds.setEntityManager(factory);
		return ds;
    }
    
    public static DaoUsuario getDaoUsuario(){
    	DaoUsuario du = new DaoUsuario();
		du.setEntityManager(factory);
		return du;
    }
 
}
