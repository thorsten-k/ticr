package de.kisner.ticr.model.ejb;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import net.sf.ahtutils.interfaces.model.behaviour.EjbSaveable;
import net.sf.ahtutils.interfaces.model.crud.EjbPersistable;
import net.sf.ahtutils.interfaces.model.with.code.EjbWithCode;

@Entity
public class TumblrBlog implements Serializable,EjbWithCode,EjbPersistable,EjbSaveable
{
	public static final long serialVersionUID=1;

	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	public long getId() {return id;}
	public void setId(long id) {this.id = id;}

	@NotNull
	private String code;
	public String getCode(){return code;}
	public void setCode(String code){this.code = code;}

	private String name;
	public String getName() {return name;}
	public void setName(String name) {this.name = name;}
	
	// >>>>>>>>>>>>>>>>>>>>Methods<<<<<<<<<<<<<<<
	
	public boolean equals(Object object)
	{
        return (object instanceof TumblrBlog) ? id == ((TumblrBlog) object).getId() : (object == this);
    }
	
	public String toString()
	{
		StringBuffer sb = new StringBuffer();
		sb.append("[").append(id).append("]");
		sb.append(" ").append(code);
		sb.append(": ").append(name);
		return sb.toString();
	}
}