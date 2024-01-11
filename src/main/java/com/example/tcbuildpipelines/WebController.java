package com.example.tcbuildpipelines;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.util.Map;

@RestController
public class WebController {

    @Autowired
    private DataSource dataSource;

    @GetMapping("/")
    public Map<String, Object> info() throws SQLException {
        try (final Connection connection = dataSource.getConnection()) {
            final DatabaseMetaData metadata = connection.getMetaData();
            return Map.of("database", metadata.getDatabaseProductName(), "version", metadata.getDatabaseMajorVersion());
        }
    }
}
