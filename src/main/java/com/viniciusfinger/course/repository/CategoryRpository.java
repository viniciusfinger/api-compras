package com.viniciusfinger.course.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.viniciusfinger.course.entities.Category;


@Repository
public interface CategoryRpository extends JpaRepository<Category, Long> { }