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
public class GestionnaireServices {

    // Ici injection de code : on n'initialise pas. L'entity manager sera créé  
    // à partir du contenu de persistence.xml  
    @PersistenceContext
    private EntityManager em;

    public void creerServices() {
        ArrayList<Service> services = new ArrayList<>();
        creeService(1, "Jardinier", "3 mois", "200€", "je suis gentil");
    }

    public Service creeService(int id, String nom, String duree,
            String tarif, String description) {
        Service s = new Service(id, nom, duree,tarif, description);
        em.persist(s);
        return s;
    }

    public Collection<Utilisateur> getAllUsers() {
        // Exécution d'une requête équivalente à un select *  
        Query q = em.createQuery("select s from Service s");
        return q.getResultList();
    }
    // Add business logic below. (Right-click in editor and choose  
    // "Insert Code > Add Business Method")  
}
