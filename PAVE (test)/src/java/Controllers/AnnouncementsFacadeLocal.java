/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Announcements;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author deecm22
 */
@Local
public interface AnnouncementsFacadeLocal {

    void create(Announcements announcements);

    void edit(Announcements announcements);

    void remove(Announcements announcements);

    Announcements find(Object id);

    List<Announcements> findAll();

    List<Announcements> findRange(int[] range);

    int count();
    
}
