package patronesdediseño.AbstractFactory;

public class Toyota implements IMarca {

    @Override
    public IAuto crearAuto() {
        return new AutoToyota();
    }

    @Override
    public IMoto crearMoto() {
        return new MotoToyota();
    }

    @Override
    public IBus crearBus() {
        return new BusToyota();
    }

    @Override
    public ICamion crearCamion() {
        return new CamionToyota();
    }

}
