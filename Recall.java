
package app3;

import java.util.Date;


public class Recall {
    String Component;
    String Consequence;
    String Make;
    String Manufacturer;
    String Model;
    int ModelYear;
    String NHTSAActionNumber;
    String NHTSACampaignNumber;
    String Notes;
    String Remedy;
    Date ReportReceivedDate;
    String Summary;
    boolean parkIt;
    boolean parkOutSide;

    public Recall(String Component, String Consequence, String Make, String Manufacturer, String Model, int ModelYear, String NHTSAActionNumber, String NHTSACampaignNumber, String Notes, String Remedy, Date ReportReceivedDate, String Summary, boolean parkIt, boolean parkOutSide) {
        this.Component = Component;
        this.Consequence = Consequence;
        this.Make = Make;
        this.Manufacturer = Manufacturer;
        this.Model = Model;
        this.ModelYear = ModelYear;
        this.NHTSAActionNumber = NHTSAActionNumber;
        this.NHTSACampaignNumber = NHTSACampaignNumber;
        this.Notes = Notes;
        this.Remedy = Remedy;
        this.ReportReceivedDate = ReportReceivedDate;
        this.Summary = Summary;
        this.parkIt = parkIt;
        this.parkOutSide = parkOutSide;
    }
    

    public String getComponent() {
        return Component;
    }

    public void setComponent(String Component) {
        this.Component = Component;
    }

    public String getConsequence() {
        return Consequence;
    }

    public void setConsequence(String Consequence) {
        this.Consequence = Consequence;
    }

    public String getMake() {
        return Make;
    }

    public void setMake(String Make) {
        this.Make = Make;
    }

    public String getManufacturer() {
        return Manufacturer;
    }

    public void setManufacturer(String Manufacturer) {
        this.Manufacturer = Manufacturer;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String Model) {
        this.Model = Model;
    }

    public int getModelYear() {
        return ModelYear;
    }

    public void setModelYear(int ModelYear) {
        this.ModelYear = ModelYear;
    }

    public String getNHTSAActionNumber() {
        return NHTSAActionNumber;
    }

    public void setNHTSAActionNumber(String NHTSAActionNumber) {
        this.NHTSAActionNumber = NHTSAActionNumber;
    }

    public String getNHTSACampaignNumber() {
        return NHTSACampaignNumber;
    }

    public void setNHTSACampaignNumber(String NHTSACampaignNumber) {
        this.NHTSACampaignNumber = NHTSACampaignNumber;
    }

    public String getNotes() {
        return Notes;
    }

    public void setNotes(String Notes) {
        this.Notes = Notes;
    }

    public String getRemedy() {
        return Remedy;
    }

    public void setRemedy(String Remedy) {
        this.Remedy = Remedy;
    }

    public Date getReportReceivedDate() {
        return ReportReceivedDate;
    }

    public void setReportReceivedDate(Date ReportReceivedDate) {
        this.ReportReceivedDate = ReportReceivedDate;
    }

    public String getSummary() {
        return Summary;
    }

    public void setSummary(String Summary) {
        this.Summary = Summary;
    }

    public boolean isParkIt() {
        return parkIt;
    }

    public void setParkIt(boolean parkIt) {
        this.parkIt = parkIt;
    }

    public boolean isParkOutSide() {
        return parkOutSide;
    }

    public void setParkOutSide(boolean parkOutSide) {
        this.parkOutSide = parkOutSide;
    }
    
}
