package irwwbase;

import java.io.Serializable;


// shupert - Created Primary Key class to support a multi-part JPA primary key for
//           the EJB 3.x persistent timer self-checking statistics bean.


public class PersistentTimerStatsPK implements Serializable {
	/**
	 * Autogenerated UID
	 */
	private static final long serialVersionUID = 4368296103643766521L;

	// The three fields of the primary key:
	//
	// name - is the timer name in the DB table
	// beanCreationTimestamp - is the time when the persistent timer statistics bean was created in memory
	//                   (ie. it is recorded at application start time)
	private String name;
	private long beanCreationTimestamp;	

	//ctors
    public PersistentTimerStatsPK () {}
    
    public PersistentTimerStatsPK (String name, long beanCreationTimestamp) {
    	this.name = name;
    	this.beanCreationTimestamp = beanCreationTimestamp;
    }

    // getter methods
	public String getName() {
		return name;
	}
	
	public long getBeanCreationTimestamp() {
		return beanCreationTimestamp;
	}
	
	
    // methods for primary key compares
	
	public int hashCode () {
		return (name.hashCode() + (int)beanCreationTimestamp);
	}
		
	public boolean equals (Object primaryKey) {
		return ( (primaryKey instanceof PersistentTimerStatsPK)  && 
				  name.equals(((PersistentTimerStatsPK)primaryKey).getName()) &&
				  beanCreationTimestamp == ((PersistentTimerStatsPK)primaryKey).getBeanCreationTimestamp() );
	}		

}
