package tablesType;

import java.util.ArrayList;
import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author Juliette
 */
@Stateless
public class GestionnaireUtilisateurs {

    // Ici injection de code : on n'initialise pas. L'entity manager sera créé  
    // à partir du contenu de persistence.xml  
    @PersistenceContext
    private EntityManager em;

    public void creerUtilisateurs() {
        ArrayList<Service> services = new ArrayList<>();
        creeUtilisateur(1, "Bob", "Marley", "boby", 26, services, "boby", 1, "Blois", "coucou");
    }

    public Utilisateur creeUtilisateur(int id, String firstname, String lastname,
            String login, int age, ArrayList<Service> services, String password,
            int gender, String city, String description) {
        Utilisateur u = new Utilisateur(id, firstname, lastname,login, age, services, 
        password, gender, city, description);
        em.persist(u);
        return u;
    }

    public Collection<Utilisateur> getAllUsers() {
        // Exécution d'une requête équivalente à un select *  
        Query q = em.createQuery("select u from Utilisateur u");
        return q.getResultList();
    }
    // Add business logic below. (Right-click in editor and choose  
    // "Insert Code > Add Business Method")  
}
