package com.mycompany.demoonetomany;

/**
 *
 * @author bhavin
 */
public class MainClass {

    public static void main(String[] args) {
        ProposalDao proposalDao = new ProposalDao();
        proposalDao.save();
        proposalDao.update(1L, "new Comment");
        proposalDao.delete(proposalDao.findById(1L));
    }
}
