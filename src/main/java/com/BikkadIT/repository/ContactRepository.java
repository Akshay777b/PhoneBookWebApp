package com.BikkadIT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.BikkadIT.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer> {

}
