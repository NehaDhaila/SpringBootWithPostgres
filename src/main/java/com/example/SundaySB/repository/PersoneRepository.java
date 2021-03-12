package com.example.SundaySB.repository;

import com.example.SundaySB.entities.PersonEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface PersoneRepository extends JpaRepository<PersonEntity,Long> {

    @Modifying
    @Query("update PersonEntity sb set sb.name = ?1, sb.age = ?2, sb.address =?3,sb.mobile_number=?4,sb.adhar_number= ?5 where sb.id = ?6")
    public void updatePerson(String name,String age,String address, String mobile_number,String adhar_number, Long id);

}
