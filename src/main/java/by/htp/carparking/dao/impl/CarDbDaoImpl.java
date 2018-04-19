package by.htp.carparking.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import by.htp.carparking.dao.BaseDao;
import by.htp.carparking.dao.util.DBConnectionHelper;
import by.htp.carparking.domain.Car;

public class CarDbDaoImpl implements BaseDao<Car> {

	@Override
	public void create(Car entity) {

		String sql = "INSERT INTO cars (brand, model) VALUES (?, ?);";
		Connection cn = DBConnectionHelper.connect();

		try {
			PreparedStatement st = cn.prepareStatement(sql);
			st.setString(1, entity.getBrand());
			st.setString(2, entity.getModel());
			st.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionHelper.disconnect(cn);
		}

	}

	@Override
	public Car read(int id) {

		String sql = "SELECT * FROM cars WHERE id=" + String.valueOf(id) + ";";
		Connection cn = DBConnectionHelper.connect();

		Car car = null;

		try {
			Statement statement = cn.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			if (rs.next()) {
				car = new Car(rs.getInt("id"), rs.getString("model"), rs.getString("brand"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionHelper.disconnect(cn);
		}

		return car;

	}

	@Override
	public void update(Car entity) {

		String sql = "UPDATE cars SET brand=?, model=? WHERE ID=?;";
		Connection cn = DBConnectionHelper.connect();

		PreparedStatement st = null;
		try {
			st = cn.prepareStatement(sql);
			st.setString(1, entity.getBrand());
			st.setString(2, entity.getModel());
			st.setInt(3, entity.getId());
			st.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionHelper.disconnect(cn);
			if (st != null) {
				try {
					st.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}

			}
		}

	}

	@Override
	public void delete(int id) {

		String sql = "DELETE FROM cars WHERE id=?;";
		Connection cn = DBConnectionHelper.connect();

		try {
			PreparedStatement statement = cn.prepareStatement(sql);
			statement.setInt(1, id);
			statement.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionHelper.disconnect(cn);
		}

	}

	@Override
	public List<Car> readAll() {

		Connection cn = DBConnectionHelper.connect();

		List<Car> cars = new ArrayList<Car>();

		try {
			Statement st = cn.createStatement();
			ResultSet rs = st.executeQuery("SELECT * FROM cars");
			while (rs.next()) {
				cars.add(new Car(rs.getInt(1), rs.getString(3), rs.getString(2)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			DBConnectionHelper.disconnect(cn);
		}

		return cars;
	}

}
