package main.java.ru.asteises.patterns.propertyContainer;

public class Movie extends PropertyContainerImpl {

    private String image;

    public String getImage() {
        if (image == null) {
            return "/image_404";
        }
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
