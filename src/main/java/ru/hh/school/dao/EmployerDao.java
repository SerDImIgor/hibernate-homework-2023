package ru.hh.school.dao;

import org.hibernate.SessionFactory;
import ru.hh.school.entity.Employer;

public class EmployerDao extends GenericDao {

  public EmployerDao(SessionFactory sessionFactory) {
    super(sessionFactory);
  }

  /**
   * TODO: здесь нужен метод, позволяющий сразу загрузить вакасии, связанные с работодателем и в некоторых случаях
   * избежать org.hibernate.LazyInitializationException
   * Также в запрос должен передаваться параметр employerId
   * <p>
   * https://vladmihalcea.com/the-best-way-to-handle-the-lazyinitializationexception/
     * @param employerId
     * @return 
   */
  
  //
  public Employer getEager(int employerId) {
      return getSession().createQuery("select em from Employer as em LEFT JOIN FETCH em.vacancies WHERE em.id = :employerId", Employer.class)
            .setParameter("employerId", employerId)
            .getSingleResult();    
  }
}