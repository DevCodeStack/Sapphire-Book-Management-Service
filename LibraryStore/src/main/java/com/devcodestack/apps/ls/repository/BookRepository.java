package com.devcodestack.apps.ls.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devcodestack.apps.ls.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
