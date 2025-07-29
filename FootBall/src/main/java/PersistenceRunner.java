import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class PersistenceRunner {

    public static void main(String[] args) {

       EntityManagerFactory emf= Persistence.createEntityManagerFactory("myPersistenceUnit");

       if(emf!=null){
           System.out.println("EMF is not null");
       }
    }
}
