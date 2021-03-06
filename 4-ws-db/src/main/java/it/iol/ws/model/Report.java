package it.iol.ws.model;

import lombok.*;

@Getter
@Setter
@ToString
@EqualsAndHashCode
final public class Report {

    @NonNull
    private String status;

    @NonNull
    private String desc;

    private Report() {
    }

    public Report(@NonNull String status, @NonNull String desc) {
        this.status = status;
        this.desc = desc;
    }
}