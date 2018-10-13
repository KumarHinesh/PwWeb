package com.vpt.pw.demo.repository;


import com.vpt.pw.demo.model.FormCrf1.FormCrf1;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormCrf1Repository extends JpaRepository<FormCrf1, Integer> {
  /* @Query("SELECT f FROM FormCrf1 f WHERE f.pregnantWoman.assessmentId = :assistId AND f.formStatus = :status")
    public FormCrf1 findByAssistIdAndStatus(@Param("assistId") String assistId, @Param("status") Integer formStatus);

   @Query("SELECT f FROM FormCrf1  f WHERE  f.pregnantWoman.id = :id ORDER BY f.q02 DESC")
   public List<FormCrf1> searchFormsByPWId(@Param("id") Integer id);*/
}
