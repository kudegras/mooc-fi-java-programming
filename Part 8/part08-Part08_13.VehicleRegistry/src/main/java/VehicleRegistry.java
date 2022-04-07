
import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRegistry {
    private HashMap<LicensePlate, String> liPlateHashMap;

    public VehicleRegistry() {
        this.liPlateHashMap = new HashMap<>();
    }
    
    public boolean add(LicensePlate liPlate, String owner) {
        for (LicensePlate lp : liPlateHashMap.keySet()) {
            if (lp.equals(liPlate)) {
                return false;
            }
        }
        liPlateHashMap.put(liPlate, owner);
        return true;
    }

    public String get(LicensePlate licensePlate) {
        return liPlateHashMap.getOrDefault(licensePlate, null);
    }

    public boolean remove(LicensePlate licensePlate) {
        if (liPlateHashMap.containsKey(licensePlate)) {
            liPlateHashMap.remove(licensePlate);
            return true;
        }
        return false;
    }

    public void printLicensePlates() {
        for (LicensePlate lp : liPlateHashMap.keySet()) {
            System.out.println(lp);
        }
    }

    public void printOwners() {
        ArrayList<String> ownerList = new ArrayList<>();
        for (String owner : liPlateHashMap.values()) {
            if (!ownerList.contains(owner)) {
                ownerList.add(owner);
            }
        }
        for (String owner : ownerList) {
            System.out.println(owner);
        }
    }
}
