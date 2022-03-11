package src.gov.nasa.api.model;

import java.util.Objects;

public class Camera {
    private Integer id;
    private String name;
    private Integer rover_id;
    private String full_name;

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

    public Integer getRover_id() {
        return rover_id;
    }

    public void setRover_id(Integer rover_id) {
        this.rover_id = rover_id;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Camera)) return false;
        Camera camera = (Camera) o;
        return Objects.equals(id, camera.id) && Objects.equals(name, camera.name) && Objects.equals(rover_id, camera.rover_id) && Objects.equals(full_name, camera.full_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, rover_id, full_name);
    }
}
