package mx.edu.utez.practica_1_16062023.models.user;

import mx.edu.utez.practica_1_16062023.models.crud.DaoRespository;
import mx.edu.utez.practica_1_16062023.utils.MySQL_conection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DaoUser implements DaoRespository {
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;

    @Override
    public List <User> findAll() {
        try {
            List<User> users = ArrayList<>();
            conn = new MySQL_conection().connect();
            String query = "SELECT * from usuarios";
            pstm = conn.prepareStatement(query);
            rs = pstm.executeQuery();
            while (rs.next()){
                User = user = new User();
                user.setId(rs.getLong("Id"));
            }
        }catch (SQLException e){

        }

        return null;
    }

    @Override
    public Object findOne(long id) {
        return null;
    }

    @Override
    public boolean save(Object object) {
        return false;
    }

    @Override
    public boolean update(Object object) {
        return false;
    }

    @Override
    public boolean delete(Long id) {
        return false;
    }
}
