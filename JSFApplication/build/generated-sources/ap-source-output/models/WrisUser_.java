package models;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import models.TaskOrders;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2016-01-12T02:13:35")
@StaticMetamodel(WrisUser.class)
public class WrisUser_ { 

    public static volatile SingularAttribute<WrisUser, Integer> iduser;
    public static volatile SingularAttribute<WrisUser, String> auid;
    public static volatile SingularAttribute<WrisUser, String> firstname;
    public static volatile SingularAttribute<WrisUser, String> lastname;
    public static volatile SingularAttribute<WrisUser, TaskOrders> taskorderIds;

}