package com.phnbk.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phnbk.Entity.ContactEntity;

public interface ContactDtlsRepository extends JpaRepository<ContactEntity, Serializable>{

}
