package com.cavetour.repositories;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cavetour.model.Pessoa;

/*O REPOSTORIO É EQUIVALENTE AO DAO*/

@Repository
public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

}
