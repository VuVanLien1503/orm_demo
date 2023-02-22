package com.example.orm_demo.repository;

import com.example.orm_demo.model.Classroom;
import com.example.orm_demo.repository.extend.IClassroomRepository;
import com.example.orm_demo.service.service_interface.ICrud;
import com.example.orm_demo.service.service_interface.ISearch;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Transactional
@Service
public class ClassroomRepository implements IClassroomRepository {
    @PersistenceContext
    private EntityManager em;

    @Override
    public List<Classroom> findAll() {
        String sql = "select c from Classroom AS c";
        TypedQuery<Classroom> query = em.createQuery(sql, Classroom.class);
        return query.getResultList();
    }

    @Override
    public void save(Classroom classroom) {
        if (classroom.getId() != null) {
            em.merge(classroom);
        } else {
            em.persist(classroom);
        }

    }

    @Override
    public void update(int index, Classroom classroom) {

    }

    @Override
    public void delete(Classroom classroom) {

    }

    @Override
    public Classroom findById(Long id) {
        String sql = "select c from Classroom as c where c.id = :id";
        TypedQuery<Classroom> query = em.createQuery(sql, Classroom.class);
        query.setParameter("id",id);
        return query.getSingleResult();
    }

    @Override
    public List<Classroom> findByName(String value) {
        return null;
    }
}
