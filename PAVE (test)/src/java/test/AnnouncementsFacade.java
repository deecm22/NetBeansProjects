/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Models.Announcements;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author deecm22
 */
@Stateless
public class AnnouncementsFacade extends AbstractFacade<Announcements> {
    @PersistenceContext(unitName = "PAVE__test_PU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AnnouncementsFacade() {
        super(Announcements.class);
    }
    
}
