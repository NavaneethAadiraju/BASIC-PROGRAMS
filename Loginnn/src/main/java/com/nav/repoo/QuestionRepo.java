package com.nav.repoo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nav.model.Question;
@Repository
public interface QuestionRepo extends JpaRepository<Question, Integer> {

}
