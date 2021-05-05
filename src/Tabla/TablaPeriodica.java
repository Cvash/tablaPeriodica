package Tabla;

import Tabla.Conexion.ConexionDB;
import Tabla.JFrame.Tabla;
import javax.swing.table.DefaultTableModel;

public class TablaPeriodica extends ConexionDB {

    public static void main(String[] args) {

        /* Instanciamos el formulario para que se inicie desde la principal */
        Tabla tabla = new Tabla();
        tabla.setVisible(true);

        /* Iniciamos la base de datos */
        ConexionDB conexion_db = new ConexionDB();
        conexion_db.conectar();

    }

}
