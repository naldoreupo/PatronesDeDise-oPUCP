package patronesdediseño.AbstractFactory;

public class Kia implements IMarca {

    @Override
    public IAuto crearAuto() {
        return new AutoKia();
    }

    @Override
    public IMoto crearMoto() {
        return new MotoKia();
    }

    @Override
    public IBus crearBus() {
        return new BusKia();
    }

    @Override
    public ICamion crearCamion() {
        return new CamionKia();
    }

}
