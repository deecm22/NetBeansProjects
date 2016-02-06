/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mccoy.customerapp.dao;

import com.mccoy.customerapp.models.Qadbuser;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author deecm22
 */
@Stateless
public class QadbuserFacade extends AbstractFacade<Qadbuser> {

    @PersistenceContext(unitName = "CustomerProfileAppBackEndPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public QadbuserFacade() {
        super(Qadbuser.class);
    }
    
}