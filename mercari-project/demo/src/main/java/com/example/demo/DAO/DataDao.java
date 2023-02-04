
/*
package com.example.demo;

@Repository
public class DataDao {

    private final JdbcTemplate jdbcTemplate;

    @Autowired
    public DataDao(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    public List<Data> getData() {
        return jdbcTemplate.query("SELECT * FROM data_table", new DataRowMapper());
    }

    private static class DataRowMapper implements RowMapper<Data>, com.example.demo.DataRowMapper {

        public Data mapRow(ResultSet resultSet, int i) throws SQLException {
            Data data = new Data();
            data.setId(resultSet.getInt("id"));
            data.setValue1(resultSet.getString("value1"));
            data.setValue2(resultSet.getString("value2"));
            return data;
        }
    }


}

 */
