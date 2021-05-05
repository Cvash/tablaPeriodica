package Tabla.JFrame;

import Tabla.Conexion.ConexionDB;
import java.awt.Color;
import java.awt.Font;
import java.sql.*;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Tabla extends javax.swing.JFrame {

    ConexionDB enlace = new ConexionDB();
    Connection conect = enlace.conectar();

    public Tabla() {
        initComponents();
        mostrarPropiedades();
    }

    public void mostrarPropiedades() {
        DefaultTableModel tabla_propiedades = new DefaultTableModel();
        tabla_propiedades.addColumn("ID");
        tabla_propiedades.addColumn("Nombre");
        tabla_propiedades.addColumn("Simbolo");
        tabla_propiedades.addColumn("Masa Atómica");
        tabla_propiedades.addColumn("Punto de Fusión");
        tabla_propiedades.addColumn("Año Descubierto");
        tabla_propiedades.addColumn("Electrones de Valencia");
        tabla_propiedades.addColumn("Configuración Electrónica");
        tablePropiedades.setModel(tabla_propiedades);

        String[] datos = new String[8];

        try {
            Statement leer = conect.createStatement();
            String sql = "SELECT * FROM propiedades";
            ResultSet resultado = leer.executeQuery(sql);

            while (resultado.next()) {
                datos[0] = resultado.getString(1);
                datos[1] = resultado.getString(2);
                datos[2] = resultado.getString(3);
                datos[3] = resultado.getString(4);
                datos[4] = resultado.getString(5);
                datos[5] = resultado.getString(6);
                datos[6] = resultado.getString(7);
                datos[7] = resultado.getString(8);
                tabla_propiedades.addRow(datos);
            }
            tablePropiedades.setModel(tabla_propiedades);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "Error en la consulta");
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        btnArgon = new javax.swing.JButton();
        btnNeon = new javax.swing.JButton();
        btnHelio = new javax.swing.JButton();
        btnTeneso = new javax.swing.JButton();
        btnAstato = new javax.swing.JButton();
        btnYodo = new javax.swing.JButton();
        btnBromo = new javax.swing.JButton();
        btnCloro = new javax.swing.JButton();
        btnFluor = new javax.swing.JButton();
        btnLivermorio = new javax.swing.JButton();
        btnPolonio = new javax.swing.JButton();
        btnTeluro = new javax.swing.JButton();
        btnSelenio = new javax.swing.JButton();
        btnAzufre = new javax.swing.JButton();
        btnOxigeno = new javax.swing.JButton();
        btnMoscovio = new javax.swing.JButton();
        btnBismuto = new javax.swing.JButton();
        btnAntimonio = new javax.swing.JButton();
        btnArsenico = new javax.swing.JButton();
        btnFosforo = new javax.swing.JButton();
        btnNitrogeno = new javax.swing.JButton();
        btnFlerovio = new javax.swing.JButton();
        btnPlomo = new javax.swing.JButton();
        btnEstanio = new javax.swing.JButton();
        btnGermanio = new javax.swing.JButton();
        btnSilicio = new javax.swing.JButton();
        btnCarbono = new javax.swing.JButton();
        btnNihonio = new javax.swing.JButton();
        btnTalio = new javax.swing.JButton();
        btnIndio = new javax.swing.JButton();
        btnGalio = new javax.swing.JButton();
        btnAluminio = new javax.swing.JButton();
        btnBoro = new javax.swing.JButton();
        btnCopernicio = new javax.swing.JButton();
        btnMercurio = new javax.swing.JButton();
        btnCadmio = new javax.swing.JButton();
        btnZinc = new javax.swing.JButton();
        btnRoentgenio = new javax.swing.JButton();
        btnOro = new javax.swing.JButton();
        btnPlata = new javax.swing.JButton();
        btnCobre = new javax.swing.JButton();
        btnDarmstatio = new javax.swing.JButton();
        btnPlatino = new javax.swing.JButton();
        btnPaladio = new javax.swing.JButton();
        btnNiquel = new javax.swing.JButton();
        btnMeitnerio = new javax.swing.JButton();
        btnIridio = new javax.swing.JButton();
        btnRodio = new javax.swing.JButton();
        btnCobalto = new javax.swing.JButton();
        btnHassio = new javax.swing.JButton();
        btnOsmio = new javax.swing.JButton();
        btnRutenio = new javax.swing.JButton();
        btnHierro = new javax.swing.JButton();
        btnBohrio = new javax.swing.JButton();
        btnRenio = new javax.swing.JButton();
        btnTecnecio = new javax.swing.JButton();
        btnManganeso = new javax.swing.JButton();
        btnSeaborgio = new javax.swing.JButton();
        btnWolframio = new javax.swing.JButton();
        btnMolibdeno = new javax.swing.JButton();
        btnCromo = new javax.swing.JButton();
        btnDubnio = new javax.swing.JButton();
        btnTantalio = new javax.swing.JButton();
        btnNiobio = new javax.swing.JButton();
        btnVanadio = new javax.swing.JButton();
        btnRutherfordio = new javax.swing.JButton();
        btnHafnio = new javax.swing.JButton();
        btnZirconio = new javax.swing.JButton();
        btnTitanio = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        btnItrio = new javax.swing.JButton();
        btnEscandio = new javax.swing.JButton();
        btnRadio = new javax.swing.JButton();
        btnBario = new javax.swing.JButton();
        btnEstroncio = new javax.swing.JButton();
        btnCalcio = new javax.swing.JButton();
        btnMagnesio = new javax.swing.JButton();
        btnBerilio = new javax.swing.JButton();
        btnFrancio = new javax.swing.JButton();
        btnCesio = new javax.swing.JButton();
        btnRubidio = new javax.swing.JButton();
        btnPotasio = new javax.swing.JButton();
        btnSodio = new javax.swing.JButton();
        btnLitio = new javax.swing.JButton();
        btnKripton = new javax.swing.JButton();
        btnXenon = new javax.swing.JButton();
        btnRadon = new javax.swing.JButton();
        btnOganeson = new javax.swing.JButton();
        btnLantano = new javax.swing.JButton();
        btnCerio = new javax.swing.JButton();
        btnPraseodimio = new javax.swing.JButton();
        btnNeodimio = new javax.swing.JButton();
        btnPrometio = new javax.swing.JButton();
        btnSamario = new javax.swing.JButton();
        btnEuropio = new javax.swing.JButton();
        btnGadolinio = new javax.swing.JButton();
        btnTerbio = new javax.swing.JButton();
        btnDisprosio = new javax.swing.JButton();
        btnHolmio = new javax.swing.JButton();
        btnErbio = new javax.swing.JButton();
        btnTulio = new javax.swing.JButton();
        btnIterbio = new javax.swing.JButton();
        btnLutecio = new javax.swing.JButton();
        btnActinio = new javax.swing.JButton();
        btnTorio = new javax.swing.JButton();
        btnProtactinio = new javax.swing.JButton();
        btnUranio = new javax.swing.JButton();
        btnNeptunio = new javax.swing.JButton();
        btnPlutonio = new javax.swing.JButton();
        btnAmericio = new javax.swing.JButton();
        btnCurio = new javax.swing.JButton();
        btnBerkelio = new javax.swing.JButton();
        btnCalifornio = new javax.swing.JButton();
        btnEinstenio = new javax.swing.JButton();
        btnFermio = new javax.swing.JButton();
        btnMendelevio = new javax.swing.JButton();
        btnNobelio = new javax.swing.JButton();
        btnLaurencio = new javax.swing.JButton();
        btnHidrogeno = new javax.swing.JButton();
        colmuna1 = new javax.swing.JLabel();
        colmuna2 = new javax.swing.JLabel();
        colmuna3 = new javax.swing.JLabel();
        colmuna4 = new javax.swing.JLabel();
        colmuna5 = new javax.swing.JLabel();
        colmuna6 = new javax.swing.JLabel();
        colmuna7 = new javax.swing.JLabel();
        colmuna8 = new javax.swing.JLabel();
        colmuna9 = new javax.swing.JLabel();
        colmuna10 = new javax.swing.JLabel();
        colmuna11 = new javax.swing.JLabel();
        colmuna12 = new javax.swing.JLabel();
        colmuna13 = new javax.swing.JLabel();
        colmuna14 = new javax.swing.JLabel();
        colmuna15 = new javax.swing.JLabel();
        colmuna16 = new javax.swing.JLabel();
        colmuna17 = new javax.swing.JLabel();
        colmuna18 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        txtNemotecnia = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablePropiedades = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        txtResultado = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnArgon.setBackground(new java.awt.Color(0, 102, 255));
        btnArgon.setForeground(new java.awt.Color(255, 255, 255));
        btnArgon.setText("Ar");
        jPanel2.add(btnArgon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 270, 50, 50));

        btnNeon.setBackground(new java.awt.Color(0, 102, 255));
        btnNeon.setForeground(new java.awt.Color(255, 255, 255));
        btnNeon.setText("Ne");
        jPanel2.add(btnNeon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 210, 50, 50));

        btnHelio.setBackground(new java.awt.Color(0, 102, 255));
        btnHelio.setForeground(new java.awt.Color(255, 255, 255));
        btnHelio.setText("He");
        jPanel2.add(btnHelio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 150, 50, 50));

        btnTeneso.setBackground(new java.awt.Color(102, 102, 255));
        btnTeneso.setForeground(new java.awt.Color(255, 255, 255));
        btnTeneso.setText("Ts");
        jPanel2.add(btnTeneso, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 510, 50, 50));

        btnAstato.setBackground(new java.awt.Color(102, 102, 255));
        btnAstato.setForeground(new java.awt.Color(255, 255, 255));
        btnAstato.setText("At");
        jPanel2.add(btnAstato, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 450, 50, 50));

        btnYodo.setBackground(new java.awt.Color(102, 102, 255));
        btnYodo.setForeground(new java.awt.Color(255, 255, 255));
        btnYodo.setText("I");
        jPanel2.add(btnYodo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 390, 50, 50));

        btnBromo.setBackground(new java.awt.Color(102, 102, 255));
        btnBromo.setForeground(new java.awt.Color(255, 255, 255));
        btnBromo.setText("Br");
        jPanel2.add(btnBromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 330, 50, 50));

        btnCloro.setBackground(new java.awt.Color(102, 102, 255));
        btnCloro.setForeground(new java.awt.Color(255, 255, 255));
        btnCloro.setText("Cl");
        jPanel2.add(btnCloro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 270, 50, 50));

        btnFluor.setBackground(new java.awt.Color(102, 102, 255));
        btnFluor.setForeground(new java.awt.Color(255, 255, 255));
        btnFluor.setText("F");
        jPanel2.add(btnFluor, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 210, 50, 50));

        btnLivermorio.setBackground(new java.awt.Color(0, 153, 0));
        btnLivermorio.setForeground(new java.awt.Color(255, 255, 255));
        btnLivermorio.setText("Lv");
        jPanel2.add(btnLivermorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 510, 50, 50));

        btnPolonio.setBackground(new java.awt.Color(255, 204, 0));
        btnPolonio.setForeground(new java.awt.Color(255, 255, 255));
        btnPolonio.setText("Po");
        jPanel2.add(btnPolonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 450, 50, 50));

        btnTeluro.setBackground(new java.awt.Color(255, 204, 0));
        btnTeluro.setForeground(new java.awt.Color(255, 255, 255));
        btnTeluro.setText("Te");
        jPanel2.add(btnTeluro, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 390, 50, 50));

        btnSelenio.setBackground(new java.awt.Color(0, 153, 153));
        btnSelenio.setForeground(new java.awt.Color(255, 255, 255));
        btnSelenio.setText("Se");
        jPanel2.add(btnSelenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 330, 50, 50));

        btnAzufre.setBackground(new java.awt.Color(0, 153, 153));
        btnAzufre.setForeground(new java.awt.Color(255, 255, 255));
        btnAzufre.setText("S");
        jPanel2.add(btnAzufre, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 270, 50, 50));

        btnOxigeno.setBackground(new java.awt.Color(0, 153, 153));
        btnOxigeno.setForeground(new java.awt.Color(255, 255, 255));
        btnOxigeno.setText("O");
        jPanel2.add(btnOxigeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 210, 50, 50));

        btnMoscovio.setBackground(new java.awt.Color(0, 153, 0));
        btnMoscovio.setForeground(new java.awt.Color(255, 255, 255));
        btnMoscovio.setText("Mc");
        jPanel2.add(btnMoscovio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 50, 50));

        btnBismuto.setBackground(new java.awt.Color(0, 153, 0));
        btnBismuto.setForeground(new java.awt.Color(255, 255, 255));
        btnBismuto.setText("Bi");
        jPanel2.add(btnBismuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 450, 50, 50));

        btnAntimonio.setBackground(new java.awt.Color(255, 204, 0));
        btnAntimonio.setForeground(new java.awt.Color(255, 255, 255));
        btnAntimonio.setText("Sb");
        jPanel2.add(btnAntimonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 390, 50, 50));

        btnArsenico.setBackground(new java.awt.Color(255, 204, 0));
        btnArsenico.setForeground(new java.awt.Color(255, 255, 255));
        btnArsenico.setText("As");
        jPanel2.add(btnArsenico, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 330, 50, 50));

        btnFosforo.setBackground(new java.awt.Color(0, 153, 153));
        btnFosforo.setForeground(new java.awt.Color(255, 255, 255));
        btnFosforo.setText("P");
        jPanel2.add(btnFosforo, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 270, 50, 50));

        btnNitrogeno.setBackground(new java.awt.Color(0, 153, 153));
        btnNitrogeno.setForeground(new java.awt.Color(255, 255, 255));
        btnNitrogeno.setText("N");
        jPanel2.add(btnNitrogeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 210, 50, 50));

        btnFlerovio.setBackground(new java.awt.Color(0, 153, 0));
        btnFlerovio.setForeground(new java.awt.Color(255, 255, 255));
        btnFlerovio.setText("Fi");
        jPanel2.add(btnFlerovio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 510, 50, 50));

        btnPlomo.setBackground(new java.awt.Color(0, 153, 0));
        btnPlomo.setForeground(new java.awt.Color(255, 255, 255));
        btnPlomo.setText("Pb");
        jPanel2.add(btnPlomo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 450, 50, 50));

        btnEstanio.setBackground(new java.awt.Color(0, 153, 0));
        btnEstanio.setForeground(new java.awt.Color(255, 255, 255));
        btnEstanio.setText("Sn");
        jPanel2.add(btnEstanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 50, 50));

        btnGermanio.setBackground(new java.awt.Color(255, 204, 0));
        btnGermanio.setForeground(new java.awt.Color(255, 255, 255));
        btnGermanio.setText("Ge");
        jPanel2.add(btnGermanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 330, 50, 50));

        btnSilicio.setBackground(new java.awt.Color(255, 204, 0));
        btnSilicio.setForeground(new java.awt.Color(255, 255, 255));
        btnSilicio.setText("Si");
        jPanel2.add(btnSilicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 270, 50, 50));

        btnCarbono.setBackground(new java.awt.Color(0, 153, 153));
        btnCarbono.setForeground(new java.awt.Color(255, 255, 255));
        btnCarbono.setText("C");
        jPanel2.add(btnCarbono, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 50, 50));

        btnNihonio.setBackground(new java.awt.Color(0, 153, 0));
        btnNihonio.setForeground(new java.awt.Color(255, 255, 255));
        btnNihonio.setText("Nh");
        jPanel2.add(btnNihonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 510, 50, 50));

        btnTalio.setBackground(new java.awt.Color(0, 153, 0));
        btnTalio.setForeground(new java.awt.Color(255, 255, 255));
        btnTalio.setText("Ti");
        jPanel2.add(btnTalio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 450, 50, 50));

        btnIndio.setBackground(new java.awt.Color(0, 153, 0));
        btnIndio.setForeground(new java.awt.Color(255, 255, 255));
        btnIndio.setText("In");
        jPanel2.add(btnIndio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 390, 50, 50));

        btnGalio.setBackground(new java.awt.Color(0, 153, 0));
        btnGalio.setForeground(new java.awt.Color(255, 255, 255));
        btnGalio.setText("Ga");
        jPanel2.add(btnGalio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 330, 50, 50));

        btnAluminio.setBackground(new java.awt.Color(0, 153, 0));
        btnAluminio.setForeground(new java.awt.Color(255, 255, 255));
        btnAluminio.setText("Al");
        jPanel2.add(btnAluminio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 270, 50, 50));

        btnBoro.setBackground(new java.awt.Color(255, 204, 0));
        btnBoro.setForeground(new java.awt.Color(255, 255, 255));
        btnBoro.setText("B");
        jPanel2.add(btnBoro, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 210, 50, 50));

        btnCopernicio.setBackground(new java.awt.Color(0, 170, 228));
        btnCopernicio.setForeground(new java.awt.Color(255, 255, 255));
        btnCopernicio.setText("Cn");
        jPanel2.add(btnCopernicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 510, 50, 50));

        btnMercurio.setBackground(new java.awt.Color(0, 170, 228));
        btnMercurio.setForeground(new java.awt.Color(255, 255, 255));
        btnMercurio.setText("Hg");
        btnMercurio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMercurioActionPerformed(evt);
            }
        });
        jPanel2.add(btnMercurio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 450, 50, 50));

        btnCadmio.setBackground(new java.awt.Color(0, 170, 228));
        btnCadmio.setForeground(new java.awt.Color(255, 255, 255));
        btnCadmio.setText("Cd");
        btnCadmio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadmioActionPerformed(evt);
            }
        });
        jPanel2.add(btnCadmio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 390, 50, 50));

        btnZinc.setBackground(new java.awt.Color(0, 170, 228));
        btnZinc.setForeground(new java.awt.Color(255, 255, 255));
        btnZinc.setText("Zn");
        jPanel2.add(btnZinc, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 330, 50, 50));

        btnRoentgenio.setBackground(new java.awt.Color(0, 170, 228));
        btnRoentgenio.setForeground(new java.awt.Color(255, 255, 255));
        btnRoentgenio.setText("Rg");
        jPanel2.add(btnRoentgenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 510, 50, 50));

        btnOro.setBackground(new java.awt.Color(0, 170, 228));
        btnOro.setForeground(new java.awt.Color(255, 255, 255));
        btnOro.setText("Au");
        btnOro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOroActionPerformed(evt);
            }
        });
        jPanel2.add(btnOro, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 450, 50, 50));

        btnPlata.setBackground(new java.awt.Color(0, 170, 228));
        btnPlata.setForeground(new java.awt.Color(255, 255, 255));
        btnPlata.setText("Ag");
        jPanel2.add(btnPlata, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 390, 50, 50));

        btnCobre.setBackground(new java.awt.Color(0, 170, 228));
        btnCobre.setForeground(new java.awt.Color(255, 255, 255));
        btnCobre.setText("Cu");
        jPanel2.add(btnCobre, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, 50, 50));

        btnDarmstatio.setBackground(new java.awt.Color(0, 170, 228));
        btnDarmstatio.setForeground(new java.awt.Color(255, 255, 255));
        btnDarmstatio.setText("Ds");
        jPanel2.add(btnDarmstatio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 510, 50, 50));

        btnPlatino.setBackground(new java.awt.Color(0, 170, 228));
        btnPlatino.setForeground(new java.awt.Color(255, 255, 255));
        btnPlatino.setText("Pt");
        jPanel2.add(btnPlatino, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 50, 50));

        btnPaladio.setBackground(new java.awt.Color(0, 170, 228));
        btnPaladio.setForeground(new java.awt.Color(255, 255, 255));
        btnPaladio.setText("Pd");
        jPanel2.add(btnPaladio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 390, 50, 50));

        btnNiquel.setBackground(new java.awt.Color(0, 170, 228));
        btnNiquel.setForeground(new java.awt.Color(255, 255, 255));
        btnNiquel.setText("Ni");
        jPanel2.add(btnNiquel, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 330, 50, 50));

        btnMeitnerio.setBackground(new java.awt.Color(0, 170, 228));
        btnMeitnerio.setForeground(new java.awt.Color(255, 255, 255));
        btnMeitnerio.setText("Mt");
        jPanel2.add(btnMeitnerio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 510, 50, 50));

        btnIridio.setBackground(new java.awt.Color(0, 170, 228));
        btnIridio.setForeground(new java.awt.Color(255, 255, 255));
        btnIridio.setText("Ir");
        jPanel2.add(btnIridio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, 50, 50));

        btnRodio.setBackground(new java.awt.Color(0, 170, 228));
        btnRodio.setForeground(new java.awt.Color(255, 255, 255));
        btnRodio.setText("Rh");
        jPanel2.add(btnRodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 390, 50, 50));

        btnCobalto.setBackground(new java.awt.Color(0, 170, 228));
        btnCobalto.setForeground(new java.awt.Color(255, 255, 255));
        btnCobalto.setText("Co");
        jPanel2.add(btnCobalto, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 330, 50, 50));

        btnHassio.setBackground(new java.awt.Color(0, 170, 228));
        btnHassio.setForeground(new java.awt.Color(255, 255, 255));
        btnHassio.setText("Hs");
        jPanel2.add(btnHassio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 510, 50, 50));

        btnOsmio.setBackground(new java.awt.Color(0, 170, 228));
        btnOsmio.setForeground(new java.awt.Color(255, 255, 255));
        btnOsmio.setText("Os");
        jPanel2.add(btnOsmio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 450, 50, 50));

        btnRutenio.setBackground(new java.awt.Color(0, 170, 228));
        btnRutenio.setForeground(new java.awt.Color(255, 255, 255));
        btnRutenio.setText("Ru");
        jPanel2.add(btnRutenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 390, 50, 50));

        btnHierro.setBackground(new java.awt.Color(0, 170, 228));
        btnHierro.setForeground(new java.awt.Color(255, 255, 255));
        btnHierro.setText("Fe");
        jPanel2.add(btnHierro, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 330, 50, 50));

        btnBohrio.setBackground(new java.awt.Color(0, 170, 228));
        btnBohrio.setForeground(new java.awt.Color(255, 255, 255));
        btnBohrio.setText("Bh");
        jPanel2.add(btnBohrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 510, 50, 50));

        btnRenio.setBackground(new java.awt.Color(0, 170, 228));
        btnRenio.setForeground(new java.awt.Color(255, 255, 255));
        btnRenio.setText("Re");
        jPanel2.add(btnRenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 450, 50, 50));

        btnTecnecio.setBackground(new java.awt.Color(0, 170, 228));
        btnTecnecio.setForeground(new java.awt.Color(255, 255, 255));
        btnTecnecio.setText("Tc");
        jPanel2.add(btnTecnecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 50, 50));

        btnManganeso.setBackground(new java.awt.Color(0, 170, 228));
        btnManganeso.setForeground(new java.awt.Color(255, 255, 255));
        btnManganeso.setText("Mn");
        jPanel2.add(btnManganeso, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 330, 50, 50));

        btnSeaborgio.setBackground(new java.awt.Color(0, 170, 228));
        btnSeaborgio.setForeground(new java.awt.Color(255, 255, 255));
        btnSeaborgio.setText("Sg");
        jPanel2.add(btnSeaborgio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 510, 50, 50));

        btnWolframio.setBackground(new java.awt.Color(0, 170, 228));
        btnWolframio.setForeground(new java.awt.Color(255, 255, 255));
        btnWolframio.setText("W");
        jPanel2.add(btnWolframio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 450, 50, 50));

        btnMolibdeno.setBackground(new java.awt.Color(0, 170, 228));
        btnMolibdeno.setForeground(new java.awt.Color(255, 255, 255));
        btnMolibdeno.setText("Mo");
        jPanel2.add(btnMolibdeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 390, 50, 50));

        btnCromo.setBackground(new java.awt.Color(0, 170, 228));
        btnCromo.setForeground(new java.awt.Color(255, 255, 255));
        btnCromo.setText("Cr");
        jPanel2.add(btnCromo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 330, 50, 50));

        btnDubnio.setBackground(new java.awt.Color(0, 170, 228));
        btnDubnio.setForeground(new java.awt.Color(255, 255, 255));
        btnDubnio.setText("Db");
        jPanel2.add(btnDubnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 510, 50, 50));

        btnTantalio.setBackground(new java.awt.Color(0, 170, 228));
        btnTantalio.setForeground(new java.awt.Color(255, 255, 255));
        btnTantalio.setText("Ta");
        jPanel2.add(btnTantalio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 450, 50, 50));

        btnNiobio.setBackground(new java.awt.Color(0, 170, 228));
        btnNiobio.setForeground(new java.awt.Color(255, 255, 255));
        btnNiobio.setText("Nb");
        jPanel2.add(btnNiobio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 390, 50, 50));

        btnVanadio.setBackground(new java.awt.Color(0, 170, 228));
        btnVanadio.setForeground(new java.awt.Color(255, 255, 255));
        btnVanadio.setText("V");
        jPanel2.add(btnVanadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 330, 50, 50));

        btnRutherfordio.setBackground(new java.awt.Color(0, 170, 228));
        btnRutherfordio.setForeground(new java.awt.Color(255, 255, 255));
        btnRutherfordio.setText("Rf");
        jPanel2.add(btnRutherfordio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 510, 50, 50));

        btnHafnio.setBackground(new java.awt.Color(0, 170, 228));
        btnHafnio.setForeground(new java.awt.Color(255, 255, 255));
        btnHafnio.setText("Hf");
        jPanel2.add(btnHafnio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 450, 50, 50));

        btnZirconio.setBackground(new java.awt.Color(0, 170, 228));
        btnZirconio.setForeground(new java.awt.Color(255, 255, 255));
        btnZirconio.setText("Zr");
        jPanel2.add(btnZirconio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, 50, 50));

        btnTitanio.setBackground(new java.awt.Color(0, 170, 228));
        btnTitanio.setForeground(new java.awt.Color(255, 255, 255));
        btnTitanio.setText("Ti");
        jPanel2.add(btnTitanio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 330, 50, 50));

        jButton16.setBackground(new java.awt.Color(153, 153, 0));
        jPanel2.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 510, 50, 50));

        jButton15.setBackground(new java.awt.Color(255, 153, 255));
        jPanel2.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 450, 50, 50));

        btnItrio.setBackground(new java.awt.Color(0, 170, 228));
        btnItrio.setForeground(new java.awt.Color(255, 255, 255));
        btnItrio.setText("Y");
        jPanel2.add(btnItrio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 390, 50, 50));

        btnEscandio.setBackground(new java.awt.Color(0, 170, 228));
        btnEscandio.setForeground(new java.awt.Color(255, 255, 255));
        btnEscandio.setText("Sc");
        jPanel2.add(btnEscandio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, 50, 50));

        btnRadio.setBackground(new java.awt.Color(255, 153, 0));
        btnRadio.setForeground(new java.awt.Color(255, 255, 255));
        btnRadio.setText("Ra");
        jPanel2.add(btnRadio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 50, 50));

        btnBario.setBackground(new java.awt.Color(255, 153, 0));
        btnBario.setForeground(new java.awt.Color(255, 255, 255));
        btnBario.setText("Ba");
        jPanel2.add(btnBario, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 450, 50, 50));

        btnEstroncio.setBackground(new java.awt.Color(255, 153, 0));
        btnEstroncio.setForeground(new java.awt.Color(255, 255, 255));
        btnEstroncio.setText("Sr");
        jPanel2.add(btnEstroncio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 390, 50, 50));

        btnCalcio.setBackground(new java.awt.Color(255, 153, 0));
        btnCalcio.setForeground(new java.awt.Color(255, 255, 255));
        btnCalcio.setText("Ca");
        jPanel2.add(btnCalcio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, 50, 50));

        btnMagnesio.setBackground(new java.awt.Color(255, 153, 0));
        btnMagnesio.setForeground(new java.awt.Color(255, 255, 255));
        btnMagnesio.setText("Mg");
        jPanel2.add(btnMagnesio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 270, 50, 50));

        btnBerilio.setBackground(new java.awt.Color(255, 153, 0));
        btnBerilio.setForeground(new java.awt.Color(255, 255, 255));
        btnBerilio.setText("Be");
        jPanel2.add(btnBerilio, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 50, 50));

        btnFrancio.setBackground(new java.awt.Color(255, 51, 51));
        btnFrancio.setForeground(new java.awt.Color(255, 255, 255));
        btnFrancio.setText("Fr");
        jPanel2.add(btnFrancio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 510, 50, 50));

        btnCesio.setBackground(new java.awt.Color(255, 51, 51));
        btnCesio.setForeground(new java.awt.Color(255, 255, 255));
        btnCesio.setText("Cs");
        jPanel2.add(btnCesio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, 50, 50));

        btnRubidio.setBackground(new java.awt.Color(255, 51, 51));
        btnRubidio.setForeground(new java.awt.Color(255, 255, 255));
        btnRubidio.setText("Rb");
        jPanel2.add(btnRubidio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, 50, 50));

        btnPotasio.setBackground(new java.awt.Color(255, 51, 51));
        btnPotasio.setForeground(new java.awt.Color(255, 255, 255));
        btnPotasio.setText("K");
        jPanel2.add(btnPotasio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 50, 50));

        btnSodio.setBackground(new java.awt.Color(255, 51, 51));
        btnSodio.setForeground(new java.awt.Color(255, 255, 255));
        btnSodio.setText("Na");
        jPanel2.add(btnSodio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 270, 50, 50));

        btnLitio.setBackground(new java.awt.Color(255, 51, 51));
        btnLitio.setForeground(new java.awt.Color(255, 255, 255));
        btnLitio.setText("Li");
        btnLitio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLitioActionPerformed(evt);
            }
        });
        jPanel2.add(btnLitio, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 50, 50));

        btnKripton.setBackground(new java.awt.Color(0, 102, 255));
        btnKripton.setForeground(new java.awt.Color(255, 255, 255));
        btnKripton.setText("Kr");
        jPanel2.add(btnKripton, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 330, 50, 50));

        btnXenon.setBackground(new java.awt.Color(0, 102, 255));
        btnXenon.setForeground(new java.awt.Color(255, 255, 255));
        btnXenon.setText("Xe");
        jPanel2.add(btnXenon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 390, 50, 50));

        btnRadon.setBackground(new java.awt.Color(0, 102, 255));
        btnRadon.setForeground(new java.awt.Color(255, 255, 255));
        btnRadon.setText("Rn");
        jPanel2.add(btnRadon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 450, 50, 50));

        btnOganeson.setBackground(new java.awt.Color(0, 102, 255));
        btnOganeson.setForeground(new java.awt.Color(255, 255, 255));
        btnOganeson.setText("Og");
        jPanel2.add(btnOganeson, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 510, 50, 50));

        btnLantano.setBackground(new java.awt.Color(255, 153, 255));
        btnLantano.setForeground(new java.awt.Color(255, 255, 255));
        btnLantano.setText("La");
        jPanel2.add(btnLantano, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 610, 50, 50));

        btnCerio.setBackground(new java.awt.Color(255, 153, 255));
        btnCerio.setForeground(new java.awt.Color(255, 255, 255));
        btnCerio.setText("Ce");
        jPanel2.add(btnCerio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 610, 50, 50));

        btnPraseodimio.setBackground(new java.awt.Color(255, 153, 255));
        btnPraseodimio.setForeground(new java.awt.Color(255, 255, 255));
        btnPraseodimio.setText("Pr");
        jPanel2.add(btnPraseodimio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 610, 50, 50));

        btnNeodimio.setBackground(new java.awt.Color(255, 153, 255));
        btnNeodimio.setForeground(new java.awt.Color(255, 255, 255));
        btnNeodimio.setText("Nd");
        jPanel2.add(btnNeodimio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 610, 50, 50));

        btnPrometio.setBackground(new java.awt.Color(255, 153, 255));
        btnPrometio.setForeground(new java.awt.Color(255, 255, 255));
        btnPrometio.setText("Pm");
        jPanel2.add(btnPrometio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 610, 50, 50));

        btnSamario.setBackground(new java.awt.Color(255, 153, 255));
        btnSamario.setForeground(new java.awt.Color(255, 255, 255));
        btnSamario.setText("Sm");
        jPanel2.add(btnSamario, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 610, 50, 50));

        btnEuropio.setBackground(new java.awt.Color(255, 153, 255));
        btnEuropio.setForeground(new java.awt.Color(255, 255, 255));
        btnEuropio.setText("Eu");
        jPanel2.add(btnEuropio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 610, 50, 50));

        btnGadolinio.setBackground(new java.awt.Color(255, 153, 255));
        btnGadolinio.setForeground(new java.awt.Color(255, 255, 255));
        btnGadolinio.setText("Gd");
        jPanel2.add(btnGadolinio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 610, 50, 50));

        btnTerbio.setBackground(new java.awt.Color(255, 153, 255));
        btnTerbio.setForeground(new java.awt.Color(255, 255, 255));
        btnTerbio.setText("Tb");
        jPanel2.add(btnTerbio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 610, 50, 50));

        btnDisprosio.setBackground(new java.awt.Color(255, 153, 255));
        btnDisprosio.setForeground(new java.awt.Color(255, 255, 255));
        btnDisprosio.setText("Dy");
        jPanel2.add(btnDisprosio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 610, 50, 50));

        btnHolmio.setBackground(new java.awt.Color(255, 153, 255));
        btnHolmio.setForeground(new java.awt.Color(255, 255, 255));
        btnHolmio.setText("Ho");
        jPanel2.add(btnHolmio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 610, 50, 50));

        btnErbio.setBackground(new java.awt.Color(255, 153, 255));
        btnErbio.setForeground(new java.awt.Color(255, 255, 255));
        btnErbio.setText("Er");
        jPanel2.add(btnErbio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 610, 50, 50));

        btnTulio.setBackground(new java.awt.Color(255, 153, 255));
        btnTulio.setForeground(new java.awt.Color(255, 255, 255));
        btnTulio.setText("Tm");
        jPanel2.add(btnTulio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 610, 50, 50));

        btnIterbio.setBackground(new java.awt.Color(255, 153, 255));
        btnIterbio.setForeground(new java.awt.Color(255, 255, 255));
        btnIterbio.setText("Yb");
        jPanel2.add(btnIterbio, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 610, 50, 50));

        btnLutecio.setBackground(new java.awt.Color(255, 153, 255));
        btnLutecio.setForeground(new java.awt.Color(255, 255, 255));
        btnLutecio.setText("Lu");
        jPanel2.add(btnLutecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 610, 50, 50));

        btnActinio.setBackground(new java.awt.Color(153, 153, 0));
        btnActinio.setForeground(new java.awt.Color(255, 255, 255));
        btnActinio.setText("Ac");
        jPanel2.add(btnActinio, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 680, 50, 50));

        btnTorio.setBackground(new java.awt.Color(153, 153, 0));
        btnTorio.setForeground(new java.awt.Color(255, 255, 255));
        btnTorio.setText("Th");
        jPanel2.add(btnTorio, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 680, 50, 50));

        btnProtactinio.setBackground(new java.awt.Color(153, 153, 0));
        btnProtactinio.setForeground(new java.awt.Color(255, 255, 255));
        btnProtactinio.setText("Pa");
        jPanel2.add(btnProtactinio, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 680, 50, 50));

        btnUranio.setBackground(new java.awt.Color(153, 153, 0));
        btnUranio.setForeground(new java.awt.Color(255, 255, 255));
        btnUranio.setText("U");
        jPanel2.add(btnUranio, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 680, 50, 50));

        btnNeptunio.setBackground(new java.awt.Color(153, 153, 0));
        btnNeptunio.setForeground(new java.awt.Color(255, 255, 255));
        btnNeptunio.setText("Np");
        jPanel2.add(btnNeptunio, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 680, 50, 50));

        btnPlutonio.setBackground(new java.awt.Color(153, 153, 0));
        btnPlutonio.setForeground(new java.awt.Color(255, 255, 255));
        btnPlutonio.setText("Pu");
        jPanel2.add(btnPlutonio, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 680, 50, 50));

        btnAmericio.setBackground(new java.awt.Color(153, 153, 0));
        btnAmericio.setForeground(new java.awt.Color(255, 255, 255));
        btnAmericio.setText("Am");
        jPanel2.add(btnAmericio, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 680, 50, 50));

        btnCurio.setBackground(new java.awt.Color(153, 153, 0));
        btnCurio.setForeground(new java.awt.Color(255, 255, 255));
        btnCurio.setText("Cm");
        jPanel2.add(btnCurio, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 680, 50, 50));

        btnBerkelio.setBackground(new java.awt.Color(153, 153, 0));
        btnBerkelio.setForeground(new java.awt.Color(255, 255, 255));
        btnBerkelio.setText("Bk");
        jPanel2.add(btnBerkelio, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 680, 50, 50));

        btnCalifornio.setBackground(new java.awt.Color(153, 153, 0));
        btnCalifornio.setForeground(new java.awt.Color(255, 255, 255));
        btnCalifornio.setText("Cf");
        jPanel2.add(btnCalifornio, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 680, 50, 50));

        btnEinstenio.setBackground(new java.awt.Color(153, 153, 0));
        btnEinstenio.setForeground(new java.awt.Color(255, 255, 255));
        btnEinstenio.setText("Es");
        jPanel2.add(btnEinstenio, new org.netbeans.lib.awtextra.AbsoluteConstraints(760, 680, 50, 50));

        btnFermio.setBackground(new java.awt.Color(153, 153, 0));
        btnFermio.setForeground(new java.awt.Color(255, 255, 255));
        btnFermio.setText("Fm");
        jPanel2.add(btnFermio, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 680, 50, 50));

        btnMendelevio.setBackground(new java.awt.Color(153, 153, 0));
        btnMendelevio.setForeground(new java.awt.Color(255, 255, 255));
        btnMendelevio.setText("Md");
        jPanel2.add(btnMendelevio, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 680, 50, 50));

        btnNobelio.setBackground(new java.awt.Color(153, 153, 0));
        btnNobelio.setForeground(new java.awt.Color(255, 255, 255));
        btnNobelio.setText("No");
        jPanel2.add(btnNobelio, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 680, 50, 50));

        btnLaurencio.setBackground(new java.awt.Color(153, 153, 0));
        btnLaurencio.setForeground(new java.awt.Color(255, 255, 255));
        btnLaurencio.setText("Lr");
        jPanel2.add(btnLaurencio, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 680, 50, 50));

        btnHidrogeno.setBackground(new java.awt.Color(0, 153, 153));
        btnHidrogeno.setForeground(new java.awt.Color(255, 255, 255));
        btnHidrogeno.setText("H");
        btnHidrogeno.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnHidrogenoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnHidrogenoMouseExited(evt);
            }
        });
        jPanel2.add(btnHidrogeno, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 50, 50));

        colmuna1.setBackground(new java.awt.Color(255, 255, 255));
        colmuna1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna1.setForeground(new java.awt.Color(255, 255, 255));
        colmuna1.setText("1A");
        colmuna1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                colmuna1MouseExited(evt);
            }
        });
        jPanel2.add(colmuna1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, -1, -1));

        colmuna2.setBackground(new java.awt.Color(255, 255, 255));
        colmuna2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna2.setForeground(new java.awt.Color(255, 255, 255));
        colmuna2.setText("2A");
        colmuna2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                colmuna2MouseExited(evt);
            }
        });
        jPanel2.add(colmuna2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        colmuna3.setBackground(new java.awt.Color(255, 255, 255));
        colmuna3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna3.setForeground(new java.awt.Color(255, 255, 255));
        colmuna3.setText("3B");
        colmuna3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna3MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, -1, -1));

        colmuna4.setBackground(new java.awt.Color(255, 255, 255));
        colmuna4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna4.setForeground(new java.awt.Color(255, 255, 255));
        colmuna4.setText("4B");
        colmuna4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna4MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, -1, -1));

        colmuna5.setBackground(new java.awt.Color(255, 255, 255));
        colmuna5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna5.setForeground(new java.awt.Color(255, 255, 255));
        colmuna5.setText("5B");
        colmuna5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna5MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna5, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 290, -1, -1));

        colmuna6.setBackground(new java.awt.Color(255, 255, 255));
        colmuna6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna6.setForeground(new java.awt.Color(255, 255, 255));
        colmuna6.setText("6B");
        colmuna6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna6MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna6, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, -1, -1));

        colmuna7.setBackground(new java.awt.Color(255, 255, 255));
        colmuna7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna7.setForeground(new java.awt.Color(255, 255, 255));
        colmuna7.setText("7B");
        colmuna7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna7MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 290, -1, -1));

        colmuna8.setBackground(new java.awt.Color(255, 255, 255));
        colmuna8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna8.setForeground(new java.awt.Color(255, 255, 255));
        colmuna8.setText("8B");
        colmuna8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna8MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna8, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 290, -1, -1));

        colmuna9.setBackground(new java.awt.Color(255, 255, 255));
        colmuna9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna9.setForeground(new java.awt.Color(255, 255, 255));
        colmuna9.setText("8B");
        colmuna9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna9MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, -1));

        colmuna10.setBackground(new java.awt.Color(255, 255, 255));
        colmuna10.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna10.setForeground(new java.awt.Color(255, 255, 255));
        colmuna10.setText("8B");
        colmuna10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna10MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna10, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 290, -1, -1));

        colmuna11.setBackground(new java.awt.Color(255, 255, 255));
        colmuna11.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna11.setForeground(new java.awt.Color(255, 255, 255));
        colmuna11.setText("1B");
        colmuna11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna11MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna11, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 290, -1, -1));

        colmuna12.setBackground(new java.awt.Color(255, 255, 255));
        colmuna12.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna12.setForeground(new java.awt.Color(255, 255, 255));
        colmuna12.setText("2B");
        colmuna12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna12MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna12, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 290, -1, -1));

        colmuna13.setBackground(new java.awt.Color(255, 255, 255));
        colmuna13.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna13.setForeground(new java.awt.Color(255, 255, 255));
        colmuna13.setText("3A");
        colmuna13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna13MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna13, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 170, -1, -1));

        colmuna14.setBackground(new java.awt.Color(255, 255, 255));
        colmuna14.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna14.setForeground(new java.awt.Color(255, 255, 255));
        colmuna14.setText("4A");
        colmuna14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna14MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna14, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 170, -1, -1));

        colmuna15.setBackground(new java.awt.Color(255, 255, 255));
        colmuna15.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna15.setForeground(new java.awt.Color(255, 255, 255));
        colmuna15.setText("5A");
        colmuna15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna15MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna15, new org.netbeans.lib.awtextra.AbsoluteConstraints(890, 170, -1, -1));

        colmuna16.setBackground(new java.awt.Color(255, 255, 255));
        colmuna16.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna16.setForeground(new java.awt.Color(255, 255, 255));
        colmuna16.setText("6A");
        colmuna16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna16MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna16, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 170, -1, -1));

        colmuna17.setBackground(new java.awt.Color(255, 255, 255));
        colmuna17.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna17.setForeground(new java.awt.Color(255, 255, 255));
        colmuna17.setText("7A");
        colmuna17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna17MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna17, new org.netbeans.lib.awtextra.AbsoluteConstraints(1010, 170, -1, -1));

        colmuna18.setBackground(new java.awt.Color(255, 255, 255));
        colmuna18.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        colmuna18.setForeground(new java.awt.Color(255, 255, 255));
        colmuna18.setText("8A");
        colmuna18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                colmuna18MouseEntered(evt);
            }
        });
        jPanel2.add(colmuna18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 110, -1, -1));

        jLabel31.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setText("1");
        jPanel2.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel32.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("2");
        jPanel2.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel33.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("3");
        jPanel2.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        jLabel34.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("4");
        jPanel2.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, -1, -1));

        jLabel35.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("5");
        jPanel2.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, -1, -1));

        jLabel36.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setText("6");
        jPanel2.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 460, -1, -1));

        jLabel37.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel37.setForeground(new java.awt.Color(255, 255, 255));
        jLabel37.setText("7");
        jPanel2.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 520, -1, -1));

        jLabel38.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("LANTÁNIDOS");
        jPanel2.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 620, -1, -1));

        jLabel39.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("ACTÍNIDOS");
        jPanel2.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 690, -1, -1));

        txtNemotecnia.setBackground(new java.awt.Color(255, 255, 255));
        txtNemotecnia.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txtNemotecnia.setForeground(new java.awt.Color(0, 204, 51));
        jPanel2.add(txtNemotecnia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 800, 910, 50));

        jPanel3.setBackground(new java.awt.Color(92, 67, 48));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Otros no metales");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Metales alcalinos");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Metales alcalinosterreos");

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Gases nobles");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Metaloides");

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Alogenos");

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Metales de transición");

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Metales de bloque \"p\"");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Lantánidos");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Actinidos");

        jPanel14.setBackground(new java.awt.Color(153, 153, 0));
        jPanel14.setForeground(new java.awt.Color(153, 153, 0));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel13.setBackground(new java.awt.Color(255, 153, 255));
        jPanel13.setForeground(new java.awt.Color(255, 153, 255));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel12.setBackground(new java.awt.Color(102, 102, 255));
        jPanel12.setForeground(new java.awt.Color(102, 102, 255));

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel11.setBackground(new java.awt.Color(0, 170, 228));
        jPanel11.setForeground(new java.awt.Color(0, 170, 228));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel10.setBackground(new java.awt.Color(0, 153, 0));
        jPanel10.setForeground(new java.awt.Color(0, 153, 0));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        jPanel9.setBackground(new java.awt.Color(255, 204, 0));
        jPanel9.setForeground(new java.awt.Color(255, 204, 0));

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel8.setBackground(new java.awt.Color(0, 102, 255));
        jPanel8.setForeground(new java.awt.Color(0, 102, 255));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel7.setBackground(new java.awt.Color(255, 153, 0));
        jPanel7.setForeground(new java.awt.Color(255, 153, 0));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 12, Short.MAX_VALUE)
        );

        jPanel5.setBackground(new java.awt.Color(0, 153, 153));
        jPanel5.setForeground(new java.awt.Color(0, 153, 153));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        jPanel6.setBackground(new java.awt.Color(255, 51, 51));
        jPanel6.setForeground(new java.awt.Color(255, 51, 51));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 10, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 140, Short.MAX_VALUE)
                        .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12))
                .addGap(94, 94, 94))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(jLabel8))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(jLabel9))
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jLabel10))
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jLabel11))
                    .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel7)
                        .addComponent(jLabel12))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 540, 190));

        tablePropiedades.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tablePropiedades);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 740, 1100, 340));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Tabla periodica de los Elementos Químicos");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 0, 1010, 70));

        txtResultado.setBackground(new java.awt.Color(255, 255, 255));
        txtResultado.setForeground(new java.awt.Color(255, 255, 255));
        txtResultado.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder(null, "Propiedades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(0, 204, 204)), "Propiedades", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 12), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.add(txtResultado, new org.netbeans.lib.awtextra.AbsoluteConstraints(1280, 150, 390, 330));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Tabla/Imagenes/tabla2.png"))); // NOI18N
        jLabel1.setName(""); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1940, 1090));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnHidrogenoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidrogenoMouseEntered

        txtResultado.setText("Hidrogeno");

        mostrarPropiedades();

    }//GEN-LAST:event_btnHidrogenoMouseEntered

    private void btnHidrogenoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnHidrogenoMouseExited

        txtResultado.setText("");

    }//GEN-LAST:event_btnHidrogenoMouseExited

    private void btnLitioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLitioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLitioActionPerformed

    private void btnOroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnOroActionPerformed

    private void btnCadmioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadmioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadmioActionPerformed

    private void btnMercurioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMercurioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMercurioActionPerformed

    private void colmuna1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna1MouseEntered
        txtNemotecnia.setText("    IA. Hoy  Linda  Nació   Con     Rubidio    Cesio    y    Francio");
        colmuna1.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna1.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna1MouseEntered

    private void colmuna2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna2MouseEntered
        txtNemotecnia.setText("   IIA. Berilio       Mas      Calcio    Estor-----Ba-------Ra");
        colmuna2.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna2.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna2MouseEntered

    private void colmuna3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna3MouseEntered
        txtNemotecnia.setText("   IIIB. Escandio, Itrio,    Lantano con Actinio (son tierras raras)");
        colmuna3.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna3.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna3MouseEntered

    private void colmuna4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna4MouseEntered
        txtNemotecnia.setText("   IVB. Titán en el  Zirco hace un Hafnio Rutherfordio que es la leche.");
        colmuna4.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna4.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna4MouseEntered

    private void colmuna5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna5MouseEntered
        txtNemotecnia.setText("    VB. El Van--Niobio es un  Tontolio  algo  Dubnio");
        colmuna5.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna5.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna5MouseEntered

    private void colmuna6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna6MouseEntered
        txtNemotecnia.setText("    VB. Con Cromo y Molibdeno se Wolframia el Seat Borgio");
        colmuna6.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna6.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna6MouseEntered

    private void colmuna7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna7MouseEntered
        txtNemotecnia.setText("   VIIB. Manga eso el Técnico italiano  Renio   Bohrio");
        colmuna7.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna7.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna7MouseEntered

    private void colmuna8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna8MouseEntered
        txtNemotecnia.setText("   --- Yerra  el Rutenio Osmio en Hassio ");
        colmuna8.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna8.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna8MouseEntered

    private void colmuna9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna9MouseEntered
        txtNemotecnia.setText("   VIIB. El ciclista Cobalto Rodó con Iridio y Meitnerio");
        colmuna9.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna9.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna9MouseEntered

    private void colmuna10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna10MouseEntered
        txtNemotecnia.setText(" ------- Ni quiero  Paladio ni  Platino  ni   Darmstadio");
        colmuna10.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna10.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna10MouseEntered

    private void colmuna11MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna11MouseEntered
        txtNemotecnia.setText("    IB. Cubre   la    Plata     con   Oro       Roentgenio");
        colmuna11.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna11.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna11MouseEntered

    private void colmuna12MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna12MouseEntered
        txtNemotecnia.setText("   IIB. Zinc      Cambio  por  Mercurio     (es buen cambio)");
        colmuna12.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna12.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna12MouseEntered

    private void colmuna13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna13MouseEntered
        txtNemotecnia.setText(" IIIA. Boro   Al    Galio     Indica     Talio    (Ojo al talio)");
        colmuna13.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna13.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna13MouseEntered

    private void colmuna14MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna14MouseEntered
        txtNemotecnia.setText(" IVA. Ca-----Si  li-----Gero    Sin    Plomo   (Casi volando)");
        colmuna14.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna14.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna14MouseEntered

    private void colmuna15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna15MouseEntered
        txtNemotecnia.setText(" VA. Ni    Fosforo  ni   Arsénico    Antidemonio    Bismuto");
        colmuna15.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna15.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna15MouseEntered

    private void colmuna16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna16MouseEntered
        txtNemotecnia.setText(" VIA. Con   Oxigeno   y  Azufre   Se   Te  Pone   (Y cómo se te pone)");
        colmuna16.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna16.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna16MouseEntered

    private void colmuna17MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna17MouseEntered
        txtNemotecnia.setText(" VIIA. Flúor     Cloro     Bromo     y   Ya      Está");
        colmuna17.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna17.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna17MouseEntered

    private void colmuna18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna18MouseEntered
        txtNemotecnia.setText("  0.-. E------- N    Aragón  todos  Gritones    Se  ha-Rán (Gases nobles)");
        colmuna18.setFont(new Font("Serif", Font.BOLD, 36));
        colmuna18.setForeground(Color.GREEN);
    }//GEN-LAST:event_colmuna18MouseEntered

    private void colmuna1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna1MouseExited
        colmuna1.setFont(new Font("Serif", Font.BOLD, 24));
        colmuna1.setForeground(Color.WHITE);
    }//GEN-LAST:event_colmuna1MouseExited

    private void colmuna2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colmuna2MouseExited
        colmuna2.setFont(new Font("Serif", Font.BOLD, 24));
        colmuna2.setForeground(Color.WHITE);
    }//GEN-LAST:event_colmuna2MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tabla.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tabla().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActinio;
    private javax.swing.JButton btnAluminio;
    private javax.swing.JButton btnAmericio;
    private javax.swing.JButton btnAntimonio;
    private javax.swing.JButton btnArgon;
    private javax.swing.JButton btnArsenico;
    private javax.swing.JButton btnAstato;
    private javax.swing.JButton btnAzufre;
    private javax.swing.JButton btnBario;
    private javax.swing.JButton btnBerilio;
    private javax.swing.JButton btnBerkelio;
    private javax.swing.JButton btnBismuto;
    private javax.swing.JButton btnBohrio;
    private javax.swing.JButton btnBoro;
    private javax.swing.JButton btnBromo;
    private javax.swing.JButton btnCadmio;
    private javax.swing.JButton btnCalcio;
    private javax.swing.JButton btnCalifornio;
    private javax.swing.JButton btnCarbono;
    private javax.swing.JButton btnCerio;
    private javax.swing.JButton btnCesio;
    private javax.swing.JButton btnCloro;
    private javax.swing.JButton btnCobalto;
    private javax.swing.JButton btnCobre;
    private javax.swing.JButton btnCopernicio;
    private javax.swing.JButton btnCromo;
    private javax.swing.JButton btnCurio;
    private javax.swing.JButton btnDarmstatio;
    private javax.swing.JButton btnDisprosio;
    private javax.swing.JButton btnDubnio;
    private javax.swing.JButton btnEinstenio;
    private javax.swing.JButton btnErbio;
    private javax.swing.JButton btnEscandio;
    private javax.swing.JButton btnEstanio;
    private javax.swing.JButton btnEstroncio;
    private javax.swing.JButton btnEuropio;
    private javax.swing.JButton btnFermio;
    private javax.swing.JButton btnFlerovio;
    private javax.swing.JButton btnFluor;
    private javax.swing.JButton btnFosforo;
    private javax.swing.JButton btnFrancio;
    private javax.swing.JButton btnGadolinio;
    private javax.swing.JButton btnGalio;
    private javax.swing.JButton btnGermanio;
    private javax.swing.JButton btnHafnio;
    private javax.swing.JButton btnHassio;
    private javax.swing.JButton btnHelio;
    private javax.swing.JButton btnHidrogeno;
    private javax.swing.JButton btnHierro;
    private javax.swing.JButton btnHolmio;
    private javax.swing.JButton btnIndio;
    private javax.swing.JButton btnIridio;
    private javax.swing.JButton btnIterbio;
    private javax.swing.JButton btnItrio;
    private javax.swing.JButton btnKripton;
    private javax.swing.JButton btnLantano;
    private javax.swing.JButton btnLaurencio;
    private javax.swing.JButton btnLitio;
    private javax.swing.JButton btnLivermorio;
    private javax.swing.JButton btnLutecio;
    private javax.swing.JButton btnMagnesio;
    private javax.swing.JButton btnManganeso;
    private javax.swing.JButton btnMeitnerio;
    private javax.swing.JButton btnMendelevio;
    private javax.swing.JButton btnMercurio;
    private javax.swing.JButton btnMolibdeno;
    private javax.swing.JButton btnMoscovio;
    private javax.swing.JButton btnNeodimio;
    private javax.swing.JButton btnNeon;
    private javax.swing.JButton btnNeptunio;
    private javax.swing.JButton btnNihonio;
    private javax.swing.JButton btnNiobio;
    private javax.swing.JButton btnNiquel;
    private javax.swing.JButton btnNitrogeno;
    private javax.swing.JButton btnNobelio;
    private javax.swing.JButton btnOganeson;
    private javax.swing.JButton btnOro;
    private javax.swing.JButton btnOsmio;
    private javax.swing.JButton btnOxigeno;
    private javax.swing.JButton btnPaladio;
    private javax.swing.JButton btnPlata;
    private javax.swing.JButton btnPlatino;
    private javax.swing.JButton btnPlomo;
    private javax.swing.JButton btnPlutonio;
    private javax.swing.JButton btnPolonio;
    private javax.swing.JButton btnPotasio;
    private javax.swing.JButton btnPraseodimio;
    private javax.swing.JButton btnPrometio;
    private javax.swing.JButton btnProtactinio;
    private javax.swing.JButton btnRadio;
    private javax.swing.JButton btnRadon;
    private javax.swing.JButton btnRenio;
    private javax.swing.JButton btnRodio;
    private javax.swing.JButton btnRoentgenio;
    private javax.swing.JButton btnRubidio;
    private javax.swing.JButton btnRutenio;
    private javax.swing.JButton btnRutherfordio;
    private javax.swing.JButton btnSamario;
    private javax.swing.JButton btnSeaborgio;
    private javax.swing.JButton btnSelenio;
    private javax.swing.JButton btnSilicio;
    private javax.swing.JButton btnSodio;
    private javax.swing.JButton btnTalio;
    private javax.swing.JButton btnTantalio;
    private javax.swing.JButton btnTecnecio;
    private javax.swing.JButton btnTeluro;
    private javax.swing.JButton btnTeneso;
    private javax.swing.JButton btnTerbio;
    private javax.swing.JButton btnTitanio;
    private javax.swing.JButton btnTorio;
    private javax.swing.JButton btnTulio;
    private javax.swing.JButton btnUranio;
    private javax.swing.JButton btnVanadio;
    private javax.swing.JButton btnWolframio;
    private javax.swing.JButton btnXenon;
    private javax.swing.JButton btnYodo;
    private javax.swing.JButton btnZinc;
    private javax.swing.JButton btnZirconio;
    private javax.swing.JLabel colmuna1;
    private javax.swing.JLabel colmuna10;
    private javax.swing.JLabel colmuna11;
    private javax.swing.JLabel colmuna12;
    private javax.swing.JLabel colmuna13;
    private javax.swing.JLabel colmuna14;
    private javax.swing.JLabel colmuna15;
    private javax.swing.JLabel colmuna16;
    private javax.swing.JLabel colmuna17;
    private javax.swing.JLabel colmuna18;
    private javax.swing.JLabel colmuna2;
    private javax.swing.JLabel colmuna3;
    private javax.swing.JLabel colmuna4;
    private javax.swing.JLabel colmuna5;
    private javax.swing.JLabel colmuna6;
    private javax.swing.JLabel colmuna7;
    private javax.swing.JLabel colmuna8;
    private javax.swing.JLabel colmuna9;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablePropiedades;
    private javax.swing.JLabel txtNemotecnia;
    private javax.swing.JLabel txtResultado;
    // End of variables declaration//GEN-END:variables
}
