package com.abdel.gestiondestock.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.time.Instant;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vente")
public class Ventes extends AbstractEntity{
    @Column(name = "code")
    private String code;
    @Column(name = "identrerise")
    private Integer idEntreprise;
    @Column(name = "datevente")
    private Instant dateVente;
    @Column(name = "commentaire")
    private String commentaire;
    @OneToMany(mappedBy = "vente")
    private List<LigneVente> ligneVente;
}
