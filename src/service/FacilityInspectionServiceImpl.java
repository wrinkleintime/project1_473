package service;

import facility.Facility;
import facilitymgmt.FacilityInspection;

import java.util.ArrayList;
import java.util.List;

public class FacilityInspectionServiceImpl implements FacilityInspectionService {
    List<FacilityInspection> inspections = new ArrayList<>();

    @Override
    public List<FacilityInspection> listInspection(long id) {
        Facility f = FacilityInventoryServiceImpl.getInstance().getFacility(id);

        List<FacilityInspection> currInspections = new ArrayList<>();

        if (f != null){
            for (FacilityInspection i: inspections){
                if (i.getFacility().getId() == id){
                    currInspections.add(i);
                }
            }
        }
        return currInspections;
    }

    @Override
    public void addInspection(FacilityInspection inspection) {
        inspections.add(inspection);
    }
}
