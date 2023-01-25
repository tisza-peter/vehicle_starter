package com.example.vehicle_starter;

import com.example.vehicle_core.VehicleStorage;
import com.example.vehicle_core.VehicleCoreApplication;
import com.example.vehicle_cui.UI_Controller;
import com.example.vehicle_cui.UI_Presenter_Implementation;
import com.example.vehicle_filedirectory_store.Store_Repository_Implementation;

public class VehicleStarterApplication {
    public static void main(String[] args) {
        VehicleCoreApplication vehicleCore = new VehicleCoreApplication();
        VehicleStorage vehicleRepository = new Store_Repository_Implementation();
        vehicleCore.SetStore(vehicleRepository);

        UI_Presenter_Implementation vehiclePresenter = new UI_Presenter_Implementation();
        vehicleCore.SetUI(vehiclePresenter);
        UI_Controller vehicleUIController = new UI_Controller();

        vehicleUIController.SetCore(vehicleCore);
        vehicleUIController.Start();
    }
}
