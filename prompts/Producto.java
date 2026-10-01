import java.math.BigDecimal;

public class Producto {

    // Atributos privados
    private Long idProducto;
    private String codigoBarras;
    private String nombre;
    private String descripcion;
    private BigDecimal precioCompra;
    private BigDecimal precioVenta;
    private int stockActual;
    private int stockMinimo;
    private String String;
    private String proveedor;
    private boolean activo;

    // Constructor vacío (necesario para frameworks como JPA/Hibernate o serialización)
    public Producto() {
    }

    // Constructor con todos los parámetros
    public Producto(Long idProducto, String codigoBarras, String nombre, String descripcion,
                    BigDecimal precioCompra, BigDecimal precioVenta, int stockActual,
                    int stockMinimo, String String, String proveedor, boolean activo) {
        this.idProducto = idProducto;
        this.codigoBarras = codigoBarras;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precioCompra = precioCompra;
        this.precioVenta = precioVenta;
        this.stockActual = stockActual;
        this.stockMinimo = stockMinimo;
        this.String = String;
        this.String= proveedor;
        this.activo = activo;
    }

    // ==================== GETTERS Y SETTERS ====================

    public Long getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Long idProducto) {
        this.idProducto = idProducto;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public BigDecimal getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(BigDecimal precioCompra) {
        this.precioCompra = precioCompra;
    }

    public BigDecimal getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(BigDecimal precioVenta) {
        this.precioVenta = precioVenta;
    }

    public int getStockActual() {
        return stockActual;
    }

    public void setStockActual(int stockActual) {
        this.stockActual = stockActual;
    }

    public int getStockMinimo() {
        return stockMinimo;
    }

    public void setStockMinimo(int stockMinimo) {
        this.stockMinimo = stockMinimo;
    }

    public String getString() {
        return String;
    }

    public void setString(String String) {
        this.String = String;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.String= proveedor;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
}