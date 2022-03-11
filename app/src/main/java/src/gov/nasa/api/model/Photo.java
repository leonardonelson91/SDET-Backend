package src.gov.nasa.api.model;

import java.util.Objects;

public class Photo {
    private String id;
    private Integer sol;
    private String img_src;
    private String earth_date;
    private Rover rover;
    private Camera camera;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Integer getSol() {
        return sol;
    }

    public void setSol(Integer sol) {
        this.sol = sol;
    }

    public String getImg_src() {
        return img_src;
    }

    public void setImg_src(String img_src) {
        this.img_src = img_src;
    }

    public String getEarth_date() {
        return earth_date;
    }

    public void setEarth_date(String earth_date) {
        this.earth_date = earth_date;
    }

    public Rover getRover() {
        return rover;
    }

    public void setRover(Rover rover) {
        this.rover = rover;
    }

    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Photo)) return false;
        Photo photo = (Photo) o;
        return Objects.equals(id, photo.id) && Objects.equals(sol, photo.sol) && Objects.equals(img_src, photo.img_src) && Objects.equals(earth_date, photo.earth_date) && Objects.equals(rover, photo.rover) && Objects.equals(camera, photo.camera);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sol, img_src, earth_date, rover, camera);
    }
}
