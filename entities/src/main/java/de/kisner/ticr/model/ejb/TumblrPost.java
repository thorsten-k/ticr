package de.kisner.ticr.model.ejb;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import net.sf.ahtutils.interfaces.model.behaviour.EjbSaveable;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.with.EjbWithNr;

@Entity
public class TumblrPost implements Serializable,EjbPersistable,EjbSaveable,EjbWithNr
{
	public static final long serialVersionUID=1;
	
	// >>>>>>>>>>>>>>>>>>>>>>>>>>Fields<<<<<<<<<<<<<<<<<<<<
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@Override public long getId() {return id;}
	@Override public void setId(long id) {this.id = id;}

	@NotNull
	@ManyToOne
	private TumblrBlog blog;
	public TumblrBlog getBlog() {return blog;}
	public void setBlog(TumblrBlog blog) {this.blog = blog;}
	
	@NotNull
	private long nr;
	@Override public long getNr() {return nr;}
	@Override public void setNr(long nr) {this.nr = nr;}
		
	// >>>>>>>>>>>>>>>>>>>>Methods<<<<<<<<<<<<<<<
	
	public boolean equals(Object object)
	{
        return (object instanceof TumblrPost) ? id == ((TumblrPost) object).getId() : (object == this);
    }
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		sb.append(" ").append(nr);
		return sb.toString();
	}
}