package ru.netology.sql_dao.repository;

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
    private String getContentOfScript;
    private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

    public DataBaseRepository(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
        this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
        getContentOfScript = read("requestScript.sql");
    }

    public List<String> getProductName(String name) {
        List<String> result;
       /* result = namedParameterJdbcTemplate.query(getContentOfScript, Map.of("name", name), new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getString("product_name");
            }
        });*/
        result = namedParameterJdbcTemplate.queryForList(getContentOfScript, Map.of("name", name), String.class);

        return result;
    }

    private static String read(String scriptFileName) {
        try (InputStream is = new ClassPathResource(scriptFileName).getInputStream();
             BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(is))) {
            return bufferedReader.lines().collect(Collectors.joining("\n"));

        } catch (IOException e) {
            throw new RuntimeException();

        }
    }


}
