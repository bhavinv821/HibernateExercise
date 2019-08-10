package com.mycompany.demoonetomany;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

/**
 *
 * @author bhavin
 */
public class ProposalDao {

    private static final Logger LOG = Logger.getLogger(ProposalDao.class.getName());

    private EntityManager entityManager;
    private EntityTransaction entityTransaction;

    public ProposalDao() {
        entityManager = EntityManagerUtil.getEntityManagerFactory().createEntityManager();
        entityTransaction = entityManager.getTransaction();
    }

    public void save() {

        entityTransaction.begin();
        List<Personnel> plist = new ArrayList<>();
        byte[] att = "Image".getBytes();
        plist.add(new Personnel("Bhavin", QualificationLevel.Intermediate, "9997854622"));
        List<Attachment> alist = new ArrayList<>();
        alist.add(new Attachment("demo", "100", LocalDateTime.MAX, att));
        Proposal proposal = new Proposal("New proposal", "new comment", plist, alist);
        entityManager.persist(proposal);
        LOG.info("\nProposanal Saved");
        entityManager.getTransaction().commit();
    }

    public void update(Long Id, String Comment) {

        entityTransaction.begin();
        Proposal proposal = entityManager.find(Proposal.class, Id);
        proposal.setComment(Comment);
        entityManager.persist(proposal);
        entityManager.getTransaction().commit();
        LOG.info("\n" + Id + "Proposanal Comment Updated");

    }

    public void delete(Proposal p) {
        entityTransaction.begin();
        Proposal proposal = entityManager.find(Proposal.class, p.getId());
        entityManager.remove(proposal);
        entityTransaction.commit();
        LOG.info("\n" + p.getId() + "Proposanal Deleted");
    }

    public Proposal findById(Long Id) {
        entityTransaction.begin();
        Proposal proposal = entityManager.find(Proposal.class, Id);
        entityTransaction.commit();
        LOG.info("\nProposal" + proposal);
        return proposal;
    }

}
