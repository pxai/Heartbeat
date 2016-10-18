package android.frontend.h.eartbe.at.heartbeat;

import java.util.Date;

/**
 * Created by Asier on 16/10/2016.
 */

public class Message {
    private String text;
    private Date date;
    private Boolean mio;

    public Message() {
    }

    public Message(String text, Date date, Boolean mio) {
        this.text = text;
        this.date = date;
        this.mio = mio;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getMio() {
        return mio;
    }

    public void setMio(Boolean mio) {
        this.mio = mio;
    }
}
