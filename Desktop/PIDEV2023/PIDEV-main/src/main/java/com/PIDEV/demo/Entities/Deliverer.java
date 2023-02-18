package com.PIDEV.demo.Entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.Set;
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Deliverer extends User  {

private Integer dispo;

    @OneToMany(cascade = CascadeType.ALL, mappedBy="deliverer")
    private Set<Delivery> Deliveries;


}
