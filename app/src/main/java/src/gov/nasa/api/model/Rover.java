package src.gov.nasa.api.model;

import java.util.Objects;

public class Rover {
    private Integer id;
    private String name;
    private String landing_date;
    private String launch_date;
    private String status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLanding_date() {
        return landing_date;
    }

    public void setLanding_date(String landing_date) {
        this.landing_date = landing_date;
    }

    public String getLaunch_date() {
        return launch_date;
    }

    public void setLaunch_date(String launch_date) {
        this.launch_date = launch_date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Rover)) return false;
        Rover rover = (Rover) o;
        return Objects.equals(id, rover.id) && Objects.equals(name, rover.name) && Objects.equals(landing_date, rover.landing_date) && Objects.equals(launch_date, rover.launch_date) && Objects.equals(status, rover.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, landing_date, launch_date, status);
    }
}
