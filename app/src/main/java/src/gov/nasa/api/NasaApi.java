package src.gov.nasa.api;

public abstract class NasaApi {
    public static final String BASE_URL = "https://api.nasa.gov";
    public static final String MARS_ROVERS_ENDPOINT = "/mars-photos/api/v1/rovers";
    public static final String PHOTOS_ENDPOINT = "/photos";
    public static final String CURIOSITY_ENDPOINT = "/curiosity";
    public static final String CURIOSITY_ROVER_ENDPOINT = BASE_URL.concat(MARS_ROVERS_ENDPOINT).concat(CURIOSITY_ENDPOINT);
    public static final String MARS_ROVERS_CURIOSITY_PHOTOS_ENDPOINT = BASE_URL.concat(MARS_ROVERS_ENDPOINT).concat(CURIOSITY_ENDPOINT).concat(PHOTOS_ENDPOINT);
}
