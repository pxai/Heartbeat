package android.frontend.h.eartbe.at.heartbeat;

import java.util.Date;

/**
 * Created by Asier on 13/10/2016.
 */

public class Beat {
    private Integer id;
    private String message;
    private Date beat_date;
    private Float latitude;
    private Float longitude;
    private Integer idfrom;
    private Integer idto;

    public Beat() {
    }

    public Beat(Integer id, String message, Date beat_date, Float latitude, Float longitude, Integer idfrom, Integer idto) {
        this.id = id;
        this.message = message;
        this.beat_date = beat_date;
        this.latitude = latitude;
        this.longitude = longitude;
        this.idfrom = idfrom;
        this.idto = idto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getBeat_date() {
        return beat_date;
    }

    public void setBeat_date(Date beat_date) {
        this.beat_date = beat_date;
    }

    public Float getLatitude() {
        return latitude;
    }

    public void setLatitude(Float latitude) {
        this.latitude = latitude;
    }

    public Float getLongitude() {
        return longitude;
    }

    public void setLongitude(Float longitude) {
        this.longitude = longitude;
    }

    public Integer getIdfrom() {
        return idfrom;
    }

    public void setIdfrom(Integer idfrom) {
        this.idfrom = idfrom;
    }

    public Integer getIdto() {
        return idto;
    }

    public void setIdto(Integer idto) {
        this.idto = idto;
    }
}
