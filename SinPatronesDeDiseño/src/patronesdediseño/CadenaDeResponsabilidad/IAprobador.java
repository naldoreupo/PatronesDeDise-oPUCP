package patronesdediseño.CadenaDeResponsabilidad;

public interface IAprobador {
    
    public void setNext(IAprobador aprobador);
    public IAprobador getNext();
    public String solicitudPrestamo(int monto);
    
}
