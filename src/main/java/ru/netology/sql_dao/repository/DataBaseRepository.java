package ru.netology.sql_dao.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Repository
public class DataBaseRepository {

    @PersistenceContext
    private EntityManager entityManager;



    public List<String> getProductName(String name) {
        Query query = entityManager.createQuery("select o.productName from Order o where lower(o.customer.name) = lower(:name)");
        query.setParameter("name", name);
        return query.getResultList();
    }
}
