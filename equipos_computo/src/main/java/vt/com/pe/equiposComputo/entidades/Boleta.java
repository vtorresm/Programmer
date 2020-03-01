package vt.com.pe.equiposComputo.entidades;

import static vt.com.pe.equiposComputo.Util.Util.CATEGORY_A_PRICE;
import static vt.com.pe.equiposComputo.Util.Util.CATEGORY_B_PRICE;
import static vt.com.pe.equiposComputo.Util.Util.CATEGORY_C_PRICE;

public class Boleta extends Equipo{
    
    private int _numeroBoleta;
    private String _fechaRegistro;
    private String _cliente;
    private int _cantidad;
    private double _monto;

    public Boleta() {
        super();
    }

    public Boleta(String id, String nombre, int stock, double precio, int cantidad, String categoria, String estado) {
        super(id, nombre, stock, precio, cantidad, categoria, estado);
        this._numeroBoleta = _numeroBoleta;
        this._fechaRegistro = _fechaRegistro;
        this._cliente = _cliente;
        this._cantidad = _cantidad;
        this._monto = _monto;
    }

    public int getNumeroBoleta() {
        return _numeroBoleta;
    }

    public void setNumeroBoleta(int _numeroBoleta) {
        this._numeroBoleta = _numeroBoleta;
    }

    public String getFechaRegistro() {
        return _fechaRegistro;
    }

    public void setFechaRegistro(String _fechaRegistro) {
        this._fechaRegistro = _fechaRegistro;
    }

    public String getCliente() {
        return _cliente;
    }

    public void setCliente(String _cliente) {
        this._cliente = _cliente;
    }

    public int getCantidad() {
        return _cantidad;
    }

    public void setCantidad(int _Cliente) {
        this._cantidad = _cantidad;
    }

    public double getMonto() {
        return _monto;
    }

    public void setMonto(double _monto) {
        this._monto = _monto;
    }

    public double getTipoCategoria() {

        switch (categoria) {
            case "A":
                precio = CATEGORY_A_PRICE;
                break;
            case "B":
                precio = CATEGORY_B_PRICE;
                break;
            case "C":
                precio = CATEGORY_C_PRICE;
                break;
            default:
                precio = 0.00;
        }
        return precio;
    }

    public double getCalcularSubTotal() {
        return getTipoCategoria() * _cantidad;
    }

    public double getCalcularDescuento() {
        double subTotal = getCalcularSubTotal();

        if (subTotal <= 150) {
            return 5.0 / 100 * subTotal;
        } else if (subTotal > 150 && subTotal <= 250) {
            return 10.0 / 100 * subTotal;
        } else {
            return 12.5 / 100 * subTotal;
        }
    }

    public double getCalcularNeto() {
        return getCalcularSubTotal() - getCalcularDescuento();
    }

}
