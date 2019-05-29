package patronesdediseño.AbstractFactory;

public interface IMarca {

    IAuto crearAuto();

    IMoto crearMoto();

    IBus crearBus();

    ICamion crearCamion();
}
