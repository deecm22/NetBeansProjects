/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import models.WrisSR;

/**
 *
 * @author deecm22
 */
@Stateless
@Path("models.wrissr")
public class WrisSRFacadeREST extends AbstractFacade<WrisSR> {

    @PersistenceContext(unitName = "WebApplication1PU")
    private EntityManager em;
    
    private wrUtil.SendMail sender = new wrUtil.SendMail();

    public WrisSRFacadeREST() {
        super(WrisSR.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(WrisSR entity) {
        super.create(entity);
        String to="wrRequester@nasa.gov";  //should be user.email
        String from="WRIS@nasa.hq.gov";
        String subject="Work Request "+entity.getSrID()+" Submitted";
        String text="Your Work Request was Scussefully created with the following ID: "+entity.getSrID();
        sender.sendEmail(to,from,subject, text);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, WrisSR entity) {
        super.edit(entity);
        String to="wrRequester@nasa.gov";  //should be user.email
        String from="WRIS@nasa.hq.gov";
        String subject="Work Request "+entity.getSrID() +" Has Been Updated";
        String text="Work Request "+entity.getSrID()+" for which you are a stakeholder has been updated";
        sender.sendEmail(to,from,subject, text);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public WrisSR find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<WrisSR> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<WrisSR> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }
    
}
