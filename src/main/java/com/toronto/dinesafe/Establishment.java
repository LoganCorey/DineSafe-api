package com.toronto.dinesafe;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entity matching the dinesafe.db and dinesafe.xml structure
 */
@Entity
public class Establishment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "establishment_id")
    private Integer establishmentId;
    @Column(name = "inspection_id")
    private Integer inspectionId;
    @Column(name = "establishment_name")
    private String establishmentName;
    @Column(name = "establishment_type")
    private String establishmentType;
    @Column(name = "establishment_address")
    private String establishmentAddress;
    @Column(name = "latitude")
    private Double latitude;
    @Column(name = "longitude")
    private Double longitude;
    @Column(name = "establishment_status")
    private String establishmentStatus;
    @Column(name = "minimum_inspections_per_year")
    private Integer minimumInspectionsPerYear;
    @Column(name = "infraction_details")
    private String infractionDetails;
    @Column(name = "inspection_date")
    private Date inspectionDate;
    @Column(name = "severity")
    private String severity;
    @Column(name = "action")
    private String action;
    @Column(name = "court_outcome")
    private String courtOutcome;
    @Column(name = "amount_fined")
    private Integer amountFined;

    public Establishment(Long id, Integer establishmentId, Integer inspectionId, String establishmentName,
                         String establishmentType, String establishmentAddress, Double latitude,
                         Double longitude, String establishmentStatus, Integer minimumInspectionsPerYear,
                         String infractionDetails, Date inspectionDate, String severity, String action, String courtOutcome,
                         Integer amountFined) {
        this.id = id;
        this.establishmentId = establishmentId;
        this.inspectionId = inspectionId;
        this.establishmentName = establishmentName;
        this.establishmentType = establishmentType;
        this.establishmentAddress = establishmentAddress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.establishmentStatus = establishmentStatus;
        this.minimumInspectionsPerYear = minimumInspectionsPerYear;
        this.infractionDetails = infractionDetails;
        this.inspectionDate = inspectionDate;
        this.severity = severity;
        this.action = action;
        this.courtOutcome = courtOutcome;
        this.amountFined = amountFined;
    }

    Establishment(){}

    public Long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getEstablishmentId() {
        return establishmentId;
    }

    public void setEstablishmentId(Integer establishmentId) {
        this.establishmentId = establishmentId;
    }

    public Integer getInspectionId() {
        return inspectionId;
    }

    public void setInspectionId(Integer inspectionId) {
        this.inspectionId = inspectionId;
    }

    public String getEstablishmentName() {
        return establishmentName;
    }

    public void setEstablishmentName(String establishmentName) {
        this.establishmentName = establishmentName;
    }

    public String getEstablishmentType() {
        return establishmentType;
    }

    public void setEstablishmentType(String establishmentType) {
        this.establishmentType = establishmentType;
    }

    public String getEstablishmentAddress() {
        return establishmentAddress;
    }

    public void setEstablishmentAddress(String establishmentAddress) {
        this.establishmentAddress = establishmentAddress;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public String getEstablishmentStatus() {
        return establishmentStatus;
    }

    public void setEstablishmentStatus(String establishmentStatus) {
        this.establishmentStatus = establishmentStatus;
    }

    public Integer getMinimumInspectionsPerYear() {
        return minimumInspectionsPerYear;
    }

    public void setMinimumInspectionsPerYear(Integer minimumInspectionsPerYear) {
        this.minimumInspectionsPerYear = minimumInspectionsPerYear;
    }

    public String getInfractionDetailss() {
        return infractionDetails;
    }

    public void setInfractionDetails(String infractionDetails) {
        this.infractionDetails = infractionDetails;
    }

    public Date getInspectionDate() {
        return inspectionDate;
    }

    public void setInspectionDate(Date inspectionDate) {
        this.inspectionDate = inspectionDate;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getCourtOutcome() {
        return courtOutcome;
    }

    public void setCourtOutcome(String courtOutcome) {
        this.courtOutcome = courtOutcome;
    }

    public Integer getAmountFined() {
        return amountFined;
    }

    public void setAmountFined(Integer amountFined) {
        this.amountFined = amountFined;
    }

}
