package com.mysite.sbb.Repository;

import com.mysite.sbb.Entity.Question;
import org.springframework.data.jpa.repository.JpaRepository;

public interface QuestionRepository extends JpaRepository<Question, Integer> {
}
