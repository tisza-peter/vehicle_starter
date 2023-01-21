package com.example.vehicle_starter;

import com.example.vehicle_core.Store_Repository_Interface;
import com.example.vehicle_core.VehicleCoreApplication;
import com.example.vehicle_cui.UI_Controller;
import com.example.vehicle_cui.UI_Presenter_Implementation;
import com.example.vehicle_store.Store_Repository_Implementation;

public class VehicleStarterApplication {
    public static void main(String[] args) {
        Store_Repository_Interface vehicleRepository = new Store_Repository_Implementation();
        UI_Presenter_Implementation vehiclePresenter = new UI_Presenter_Implementation();
        UI_Controller vehicleUIController = new UI_Controller();
        VehicleCoreApplication vehicleCore = new VehicleCoreApplication();
        vehicleCore.SetStore(vehicleRepository);
        vehicleCore.SetUI(vehiclePresenter);
        vehicleUIController.SetCore(vehicleCore);
        vehicleUIController.Start();
    }
}
