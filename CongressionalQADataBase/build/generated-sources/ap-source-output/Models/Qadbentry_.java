package Models;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2015-09-11T03:47:02")
@StaticMetamodel(Qadbentry.class)
public class Qadbentry_ { 

    public static volatile SingularAttribute<Qadbentry, Date> hearingdate;
    public static volatile SingularAttribute<Qadbentry, String> actionstatus;
    public static volatile SingularAttribute<Qadbentry, Integer> entryid;
    public static volatile SingularAttribute<Qadbentry, String> title;
    public static volatile SingularAttribute<Qadbentry, String> assignedorg;
    public static volatile SingularAttribute<Qadbentry, String> answer;
    public static volatile SingularAttribute<Qadbentry, Date> duedate;
    public static volatile SingularAttribute<Qadbentry, String> question;
    public static volatile SingularAttribute<Qadbentry, String> needsaction;
    public static volatile SingularAttribute<Qadbentry, String> commitee;

}