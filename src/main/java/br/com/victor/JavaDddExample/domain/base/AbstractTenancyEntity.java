package br.com.victor.JavaDddExample.domain.base;

import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

import br.com.victor.JavaDddExample.domain.Farmacia;

@MappedSuperclass
public class AbstractTenancyEntity extends AbstractEntity {

    @ManyToOne
    @JoinColumn
    private Farmacia farmacia;

    public Farmacia getFarmacia() {
        return farmacia;
    }

    public void setFarmacia(Farmacia farmacia) {
        this.farmacia = farmacia;
    }
    
}
