package patronesdediseño.AbstractFactory;

public class Mitsubishi implements IMarca {

    @Override
    public IAuto crearAuto() {
        return new AutoMitsubishi();
    }

    @Override
    public IMoto crearMoto() {
        return new MotoMitsubishi();
    }

    @Override
    public IBus crearBus() {
        return new BusMitsubishi();
    }

    @Override
    public ICamion crearCamion() {
        return new CamionMitsubishi();
    }

}
