package Controllers.AreaControllers;

import Models.SystemManagement.HeatingSys;
import Viewers.AreaViewers.HeatingSysView;

public class HeatingSysControl {
    private HeatingSysView view;
    private HeatingSys model;

    public HeatingSysControl(HeatingSysView view, HeatingSys model) {
        this.view = view;
        this.model = model;
    }

    public void setSysTo() {
        model.setSysTo();
    }

    public void raiseSys() {
        model.raiseSys();
    }

    public void lowerSys() {
        model.lowerSys();
    }

    public void OnAuto() {
        model.OnAuto();
    }

    public void OffAuto() {
        model.OnAuto();
    }
}
