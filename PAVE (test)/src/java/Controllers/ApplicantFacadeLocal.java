/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Applicant;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author deecm22
 */
@Local
public interface ApplicantFacadeLocal {

    void create(Applicant applicant);

    void edit(Applicant applicant);

    void remove(Applicant applicant);

    Applicant find(Object id);

    List<Applicant> findAll();

    List<Applicant> findRange(int[] range);

    int count();
    
}
