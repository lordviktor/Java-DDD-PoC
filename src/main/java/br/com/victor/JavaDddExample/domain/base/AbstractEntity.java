package br.com.victor.JavaDddExample.domain.base;

public abstract class AbstractEntity {
	
	private Long id;
	
	private EntityState state = EntityState.INSERTED;
	
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	public EntityState getState() {
		return state;
	}

	public void modify()
	{
		this.state = state.modified(this);
	}
	
	public void delete()
	{
		this.state = state.deleted(this);
	}
}
