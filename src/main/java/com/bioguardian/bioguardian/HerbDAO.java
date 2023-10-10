package com.bioguardian.bioguardian;

import com.bioguardian.bioguardian.util.R;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class HerbDAO {
    //Creamos una nueva conexión con la BBDD
    private Connection conexion;
    //Con esta función cogemos los datos de database.properties y los usamos para
    //generar la conexión sin tener que andar haciendolo a mano
    public void conectar() throws ClassNotFoundException, SQLException, IOException {
        Properties configuration = new Properties();
        configuration.load(R.getProperties("database.properties"));
        String host = configuration.getProperty("host");
        String port = configuration.getProperty("port");
        String name = configuration.getProperty("name");
        String username = configuration.getProperty("username");
        String password = configuration.getProperty("password");

        Class.forName("com.mysql.cj.jdbc.Driver");
        conexion = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + name + "?serverTimezone=UTC",
                username, password);
    }
    //Y esta nos sirve para desconectar la BBDD una vez ya tenemos los cambios
    //hechos
    public void desconectar() throws SQLException {
        conexion.close();
    }

    //public void guardarPlanta(Planta planta) throws SQLException {}
    //public void modificarPlanta(Planta plantaPocha, PlantaNueva) throws SQLException {}
    //public List<Planta> listaPlantas() throws SQLException {}
    //public boolean existePlanta(String nombre) throws SQLException {}


}
