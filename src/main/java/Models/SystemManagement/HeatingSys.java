package Models.SystemManagement;

public class HeatingSys extends ManagingSys{

    private double currentTemperature;
    private double setTemperature;

    public double getCurrentTemperature() {
        return currentTemperature;
    }

    public double getSetTemperature() {
        return setTemperature;
    }

    public void setSetTemperature(double setTemperature) {
        this.setTemperature = setTemperature;
    }

    public void setAutoMaintainState(boolean state) {
    }


    @Override
    public void setSysTo() {
        setSetTemperature();
    }

    @Override
    public void raiseSys() {
        setSetTemperature(currentTemperature + 1);
    }

    @Override
    public void lowerSys() {
        setSetTemperature(currentTemperature - 1);
    }

    @Override
    public void OnAuto() {
        setAutoMaintainState(true);
    }

    @Override
    public void OffAuto() {
        setAutoMaintainState(false);
    }
}
