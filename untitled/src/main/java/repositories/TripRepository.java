package repositories;

import com.mysql.cj.result.Row;
import model.Trip;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public class TripRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Trip> getFlightsByDetails(String destination) {
        String sql = "SELECT * FROM trip WHERE destination = ?";
        return jdbcTemplate.query(sql, new TripRowMapper(), destination);
    }

    private static class TripRowMapper implements RowMapper<Trip> {

        @Override
        public Trip mapRow(ResultSet rs, int rowNum) throws SQLException {
            Trip trip = new Trip();
            trip.setId(rs.getInt("id"));
            trip.setCheckIn(rs.getDate("checkIn"));
            trip.setCheckOut(rs.getDate("checkOut"));
            trip.setDestination(rs.getString("destination"));
            trip.setSeats(rs.getInt("seats"));
            trip.setCategory(rs.getInt("class"));
            return trip;
        }
    }
}
