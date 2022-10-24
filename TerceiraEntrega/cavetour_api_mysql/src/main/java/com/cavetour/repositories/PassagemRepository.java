package com.cavetour.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cavetour.model.Passagem;

/*O REPOSTORIO É EQUIVALENTE AO DAO*/

@Repository
public interface PassagemRepository extends JpaRepository<Passagem, Long>{

}
