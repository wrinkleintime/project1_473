package facilitymgmt;

import java.math.BigDecimal;

public class FacilityMaintenanceOrder {
    private BigDecimal totalCost;
    private String description;

    public FacilityMaintenanceOrder(BigDecimal totalCost, String description) {
        this.totalCost = totalCost;
        this.description = description;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
