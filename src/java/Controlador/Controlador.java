/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package Controlador;

import Modelo.Dashboard;
import Modelo.DashboardDAO;
import Modelo.Orden;
import Modelo.OrdenDAO;
import Modelo.Productos;
import Modelo.ProductosDAO;
import Modelo.ProveedorDAO;
import Modelo.Proveedor;
import Modelo.detalleOrden;
import Utils.GeneOrden;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.Double.parseDouble;
import java.sql.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo
 */
@WebServlet(name = "Controlador", urlPatterns = {"/Controlador"})
public class Controlador extends HttpServlet {

    Proveedor pro = new Proveedor();
    ProveedorDAO acc = new ProveedorDAO();
    Productos p = new Productos();
    ProductosDAO acc1 = new ProductosDAO();
    Dashboard d = new Dashboard();
    DashboardDAO dh1 = new DashboardDAO();
    OrdenDAO odao = new OrdenDAO();
    int idpr;
    int idp;
    detalleOrden det = new detalleOrden();
    Orden o = new Orden();
    List<Orden> lista = new ArrayList();
    Integer item = 0;
    Integer cod;
    String cod2;
    String nom;
    Double prec;
    Double subtotal;
    Integer canti;
    Double total;
    String numse;

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String menu = request.getParameter("menu");
        String accion = request.getParameter("accion");

        if (menu.equals("index")) {
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }
        if (menu.equals("DashBoard")) {
            switch (accion) {
                case "Listar":
                /*String codpro = request.getParameter("txtCodpro");
                    p.setCod(codpro);
                    Productos p = acc1.buscar(codpro);
                    request.setAttribute("p", p);
                    break;*/
                default:
                    Dashboard d = dh1.ListarCantProv();
                    request.setAttribute("dashboard", d);
                    Dashboard d1 = dh1.ListarCantProductos();
                    request.setAttribute("dashboard_cant_prod", d1);
                    Dashboard d2 = dh1.ListarCantOrdCom();
                    request.setAttribute("dashboard_cant_ordcompra", d2);

                    //Lista Stock Productos 
                    List lista1 = dh1.ListarStock();
                    request.setAttribute("productos", lista1);
                    //request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                //request.getRequestDispatcher("Dashboard.jsp").forward(request, response);

            }
            request.getRequestDispatcher("Dashboard.jsp").forward(request, response);
        }
        if (menu.equals("Movimiento")) {
            switch (accion) {
                case "Listar":

                    List lista1 = odao.listarOr();
                    request.setAttribute("ordenes", lista1);

                    break;
                default:
                    throw new AssertionError();
            }

            request.getRequestDispatcher("Movimiento.jsp").forward(request, response);

        }
        if (menu.equals("SalidaProductos")) {
            switch (accion) {
                case "Buscar":
                    String codpro = request.getParameter("txtCodpro");
                    p.setCod(codpro);
                    Productos p = acc1.buscar(codpro);
                    request.setAttribute("p", p);
                    break;
                default:
                    request.getRequestDispatcher("SalidaProductos.jsp").forward(request, response);

            }
            request.getRequestDispatcher("SalidaProductos.jsp").forward(request, response);
        }
        if (menu.equals("Productos")) {
            switch (accion) {
                case "Listar":
                    List lista1 = acc1.listarP();
                    request.setAttribute("productos", lista1);

                    break;
                case "Agregar":
                    String fecha = request.getParameter("Fecha");
                    String cod = request.getParameter("txtCodpro");
                    String nom = request.getParameter("txtpro");
                    String cat = request.getParameter("select");
                    String mar = request.getParameter("txtmarca");
                    Double pre = Double.valueOf(request.getParameter("pre"));
                    Integer stck = Integer.valueOf(request.getParameter("intnum"));
                    p.setFech(fecha);
                    p.setCod(cod);
                    p.setNom(nom);
                    p.setCat(cat);
                    p.setMar(mar);
                    p.setPre(pre);
                    p.setStck(stck);
                    acc1.Adicionar1(p);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idpr = Integer.valueOf(request.getParameter("id"));
                    Productos prod = acc1.listarId(idpr);
                    request.setAttribute("producto", prod);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String fecha1 = request.getParameter("Fecha");
                    String cod1 = request.getParameter("txtCodpro");
                    String nom1 = request.getParameter("txtpro");
                    String cat1 = request.getParameter("select");
                    String mar1 = request.getParameter("txtmarca");
                    Double pre1 = Double.parseDouble(request.getParameter("pre"));
                    Integer stck1 = Integer.parseInt(request.getParameter("intnum"));
                    p.setFech(fecha1);
                    p.setCod(cod1);
                    p.setNom(nom1);
                    p.setCat(cat1);
                    p.setMar(mar1);
                    p.setPre(pre1);
                    p.setStck(stck1);
                    p.setId(idpr);
                    acc1.Actualizar(p);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                case "Borrar":
                    idpr = Integer.parseInt(request.getParameter("id"));
                    acc1.Eliminar(idpr);
                    request.getRequestDispatcher("Controlador?menu=Productos&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Productos.jsp").forward(request, response);
        }
        if (menu.equals("Proveedor")) {
            switch (accion) {
                case "Listar":
                    List lista = acc.listar();
                    request.setAttribute("proveedores", lista);

                    break;
                case "Agregar":
                    String fecha = request.getParameter("FechRegis");
                    String cod = request.getParameter("txtCodPro");
                    String ruc = request.getParameter("txtRuc");
                    String nom = request.getParameter("txtNomPro");
                    String ape = request.getParameter("txtApePro");
                    String tel = request.getParameter("txtTele");
                    String cel = request.getParameter("txtCel");
                    String correo = request.getParameter("txtCorreo");
                    String empre = request.getParameter("txtEmpre");
                    pro.setFe(fecha);
                    pro.setCod(cod);
                    pro.setRuc(ruc);
                    pro.setNom(nom);
                    pro.setApe(ape);
                    pro.setTel(tel);
                    pro.setCel(cel);
                    pro.setCorreo(correo);
                    pro.setEmpre(empre);
                    acc.Adicionar(pro);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Editar":
                    idp = Integer.parseInt(request.getParameter("id"));
                    Proveedor p = acc.listarCod(idp);
                    request.setAttribute("proveedor", p);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Actualizar":
                    String fecha1 = request.getParameter("FechRegis");
                    String cod1 = request.getParameter("txtCodPro");
                    String ruc1 = request.getParameter("txtRuc");
                    String nom1 = request.getParameter("txtNomPro");
                    String ape1 = request.getParameter("txtApePro");
                    String tel1 = request.getParameter("txtTele");
                    String cel1 = request.getParameter("txtCel");
                    String correo1 = request.getParameter("txtCorreo");
                    String empre1 = request.getParameter("txtEmpre");
                    pro.setFe(fecha1);
                    pro.setCod(cod1);
                    pro.setRuc(ruc1);
                    pro.setNom(nom1);
                    pro.setApe(ape1);
                    pro.setTel(tel1);
                    pro.setCel(cel1);
                    pro.setCorreo(correo1);
                    pro.setEmpre(empre1);
                    pro.setId(idp);
                    acc.Actualizar(pro);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                case "Borrar":
                    idp = Integer.parseInt(request.getParameter("id"));
                    acc.Eliminar(idp);
                    request.getRequestDispatcher("Controlador?menu=Proveedor&accion=Listar").forward(request, response);
                    break;
                default:
                    throw new AssertionError();
            }
            request.getRequestDispatcher("Proveedor.jsp").forward(request, response);

        }
        if (menu.equals("RegOrdenCompra")) {
            switch (accion) {
                case "Buscar":
                    int id = Integer.parseInt(request.getParameter("txtCodpro"));
                    p = acc1.listarId(id);
                    request.setAttribute("p", p);
                    request.setAttribute("lista", lista);
                    request.setAttribute("total", total);
                    request.setAttribute("nord", numse);
                    break;
                case "Adicionar":
                    total = 0.0;
                    item = item + 1;
                    cod = p.getId();
                    cod2 = request.getParameter("txtCodpro");
                    nom = request.getParameter("nompro");
                    prec = Double.parseDouble(request.getParameter("precio"));
                    canti = Integer.parseInt(request.getParameter("cantidad"));
                    subtotal = prec * canti;
                    o = new Orden();
                    o.setItem(item);
                    o.setId(cod);
                    o.setCod(cod2);
                    o.setNomp(nom);
                    o.setPre(prec);
                    o.setCant(canti);
                    o.setSub(subtotal);
                    lista.add(o);
                    for (int i = 0; i < lista.size(); i++) {
                        total = total + lista.get(i).getSub();
                    }
                    request.setAttribute("total", total);
                    request.setAttribute("lista", lista);
                    request.setAttribute("nord", numse);
                    break;
                case "GenerarOrden":
                    //varaibles que creas
                    String fechaO = request.getParameter("fechaO");
                    String fechaE = request.getParameter("fechaE");
                    String fechaP = request.getParameter("fechaP");
                    String dirE = request.getParameter("dirE");
                    String proveedor = request.getParameter("select");
                    String ruc = request.getParameter("ruc");
                    String autorizadoP = request.getParameter("empl");

                    //aea
                    //Double ToT=subtotal+(subtotal*0.18);
                    o.setNumse(numse);
                    o.setFecha1(fechaO);
                    o.setFecha2(fechaE);
                    o.setFecha3(fechaP);
                    o.setDentre(dirE);
                    o.setNomemple(autorizadoP);
                    o.setRuc(ruc);
                    o.setIgv(0.18);
                    o.setSub(total);
                    o.setTota(total + (total * 0.18));
                    odao.GuardarOrden(o);

                    //Guardar Detalle Orden
                    int idv = Integer.parseInt(odao.IdOrde());
                    // int hh=idv+1;
                    for (int i = 0; i < lista.size(); i++) {
                        det = new detalleOrden();
                        Double sub2 = lista.get(i).getCant() * lista.get(i).getPre();
                        Double tott = sub2 + (sub2 * 0.18);
                        det.setCod(lista.get(i).getCod());
                        det.setIdOrd(idv);
                        det.setNomp(lista.get(i).getNomp());
                        det.setCant(lista.get(i).getCant());
                        det.setPre(lista.get(i).getPre());
                        det.setNumse(numse);
                        det.setIgv(0.18);
                        det.setSub(sub2);
                        det.setTota(tott);
                        odao.DetallOrden(det);

                    }
                    //request.getRequestDispatcher("Proveedor.jsp").forward(request, response);
                    break;

                default:
                    o = new Orden();
                    lista = new ArrayList<>();
                    item = 0;
                    total = 0.0;
                    numse = odao.GenerarOr();
                    if (numse == null) {
                        numse = "00000001";
                        request.setAttribute("nord", numse);
                    } else {
                        int incr = Integer.parseInt(numse);
                        GeneOrden go = new GeneOrden();
                        numse = go.NumeroSe(incr);
                        request.setAttribute("nord", numse);
                    }
                    request.getRequestDispatcher("RegOrdenCompra.jsp").forward(request, response);

            }
            request.getRequestDispatcher("RegOrdenCompra.jsp").forward(request, response);
        }

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
