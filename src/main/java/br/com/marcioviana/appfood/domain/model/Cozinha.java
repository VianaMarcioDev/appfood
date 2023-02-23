package br.com.marcioviana.appfood.domain.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name = "tab_cozinhas")
public class Cozinha {

    @Id
    private Long id;

    @Column(name = "nome_cozinha")
    private String nome;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Cozinha cozinha)) return false;
        return getId().equals(cozinha.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
