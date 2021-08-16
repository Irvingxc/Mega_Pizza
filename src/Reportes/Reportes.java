/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reportes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.HashMap;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperPrintManager;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;
import org.apache.commons.collections.map.HashedMap;

/**
 *
 * @author espin
 */
public class Reportes {
    public void ReportePlanilla(HashMap datos) throws SQLException, JRException{
        Connection a;
   a=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=PROYECTO_MP", "sa", "123");
   JasperReport reporte=null;
   reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Planilla.jasper");   
   JasperPrint print=JasperFillManager.fillReport(reporte, datos, a);
   JasperViewer ver=new JasperViewer(print, false);
   ver.setTitle("Planilla");
   ver.setVisible(true);
    }
    
    
    public void ReporteVenta(HashMap datos) throws SQLException, JRException{
        Connection a;
   a=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=PROYECTO_MP", "sa", "123");
   JasperReport reporte=null;
   reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Venta.jasper");   
   JasperPrint print=JasperFillManager.fillReport(reporte, datos, a);
        JasperPrintManager.printReport(print, false);
//JasperViewer ver=new JasperViewer(print, false);
//   ver.setTitle("Venta");
//   ver.setVisible(true);
    }
    
       public void ReporteVentas(HashMap datos) throws SQLException, JRException{
        Connection a;
   a=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=PROYECTO_MP", "sa", "123");
   JasperReport reporte=null;
   reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Venta.jasper");   
   JasperPrint print=JasperFillManager.fillReport(reporte, datos, a);
        //JasperPrintManager.printReport(print, false);
JasperViewer ver=new JasperViewer(print, false);
   ver.setTitle("Venta");
   ver.setVisible(true);
    }
    
    
    public void ReporteEmpleados() throws SQLException, JRException{
    Connection a;
    a=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=PROYECTO_MP", "sa", "123");
    JasperReport reporte=null;
    reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Empleado.jasper");
    JasperPrint print=JasperFillManager.fillReport(reporte, null, a);
    JasperViewer ver=new JasperViewer(print, false);
    ver.setTitle("Empleados");
    ver.setVisible(true);
   
    }
    
    public void ReporteCargos() throws SQLException, JRException{
    Connection a;
    a=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=PROYECTO_MP", "sa", "123");
    JasperReport reporte=null;
    reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Cargo.jasper");
    JasperPrint print=JasperFillManager.fillReport(reporte, null, a);
    JasperViewer ver=new JasperViewer(print, false);
    ver.setTitle("Cargos");
    ver.setVisible(true);
    }
    
    public void ReporteProveedores() throws SQLException, JRException{
    Connection a;
    a=DriverManager.getConnection("jdbc:sqlserver://192.168.0.11:1433;databaseName=PROYECTO_MP", "Irvingx", "Iopteamop12");
    JasperReport reporte=null;
    reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Proveedor.jasper");
    JasperPrint print=JasperFillManager.fillReport(reporte, null, a);
    JasperViewer ver=new JasperViewer(print, false);
    ver.setTitle("Proveedores");
    ver.setVisible(true);
   
    }
    
    public void ReporteLocal() throws SQLException, JRException{
    Connection a;
    a=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=PROYECTO_MP", "sa", "123");
    JasperReport reporte=null;
    reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Local.jasper");
    JasperPrint print=JasperFillManager.fillReport(reporte, null, a);
    JasperViewer ver=new JasperViewer(print, false);
    ver.setTitle("Local");
    ver.setVisible(true);
    }
    
    public void ReporteClientes() throws SQLException, JRException{
    Connection a;
    a=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=PROYECTO_MP", "sa", "123");
    JasperReport reporte=null;
    reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Cliente.jasper");
    JasperPrint print=JasperFillManager.fillReport(reporte, null, a);
    JasperViewer ver=new JasperViewer(print, false);
    ver.setTitle("Cliente");
    ver.setVisible(true);
    }
    public void ReporteInventarios() throws SQLException, JRException{
    Connection a;
    a=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=PROYECTO_MP", "sa", "123");
    JasperReport reporte=null;
    reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Inventario.jasper");
    JasperPrint print=JasperFillManager.fillReport(reporte, null, a);
    JasperViewer ver=new JasperViewer(print, false);
    ver.setTitle("Inventario");
    ver.setVisible(true);
    }
    public void ReporteUsuarios() throws SQLException, JRException{
    Connection a;
    a=DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=PROYECTO_MP", "sa", "123");
    JasperReport reporte=null;
    reporte=(JasperReport) JRLoader.loadObjectFromFile("C:\\11_MEGAPIZZA\\src\\Reportes\\Usuario.jasper");
    JasperPrint print=JasperFillManager.fillReport(reporte, null, a);
    JasperViewer ver=new JasperViewer(print, false);
    ver.setTitle("Usuario");
    ver.setVisible(true);
    }
    
}
