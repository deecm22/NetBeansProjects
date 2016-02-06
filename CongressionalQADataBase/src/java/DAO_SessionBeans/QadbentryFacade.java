/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO_SessionBeans;

import Models.Qadbentry;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author deecm22
 */
@Stateless
public class QadbentryFacade extends AbstractFacade<Qadbentry> {
    @PersistenceContext(unitName = "CongressionalQADataBasePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QadbentryFacade() {
        super(Qadbentry.class);
    }
    
}
