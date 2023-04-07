package gov.iti.jets.repositories.impls;

import java.util.ArrayList;

import gov.iti.jets.repositories.interfaces.ActorRepo;
import gov.iti.jets.model.entities.Actor;
import gov.iti.jets.utils.EntityManagerSingleton;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.NoResultException;
import jakarta.persistence.Query;

public class ActorRepoImpl implements ActorRepo {

    public ActorRepoImpl() {

    }

    @Override
    public Actor findActorById(int id) {
        return EntityManagerSingleton.getEntityManager().find(Actor.class, id);

    }

    @Override
    public ArrayList<Actor> findAllActors() {
        Query query = EntityManagerSingleton.getEntityManager().createQuery("select a from Actor a");
        return (ArrayList<Actor>) query.getResultList();

    }

    @Override
    public Actor findActorByFirstName(String firstName) {
        try {
            Query query = EntityManagerSingleton.getEntityManager()
                    .createQuery("select a from Actor a where a.firstName=:firstName");
            query.setParameter("firstName", firstName);
            return (Actor) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
    }

    @Override
    public Actor createActor(Actor actor) {
       
        EntityTransaction entityTransaction = EntityManagerSingleton.getEntityManager().getTransaction();
        entityTransaction.begin();
        EntityManagerSingleton.getEntityManager().persist(actor);
        entityTransaction.commit();
        return actor;
    }

    @Override
    public Actor updateActorById(int id, String firstName) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'updateActorById'");
    }

}
