/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author yagnapatel
 */
public class Product {

    private String name;
    private int price;
    private int id;
    private ImageIcon productImage;

    private ArrayList<Feature> features;

    private static int count = 0;

    public Product() {
        count++;
        id = count;

        features = new ArrayList<Feature>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public ArrayList<Feature> getFeatures() {
        return features;
    }

    public void setFeatures(ArrayList<Feature> features) {
        this.features = features;
    }

    public Feature addNewFeature(String featureName, Object featureValue) {
        Feature newFeature = new Feature(this, featureName, featureValue);
        features.add(newFeature);
        return newFeature;
    }

    public void removeFeature(int index) {
        if (index >= 0 && index < features.size()) {
            features.remove(index);
        } else {
            throw new IndexOutOfBoundsException("Invalid feature index: " + index);
        }
    }

    public ImageIcon getProductImage() {
        return productImage;
    }

    public void setProductImage(ImageIcon productImage) {
        this.productImage = productImage;
    }

    @Override
    public String toString() {
        return name;
    }

}
