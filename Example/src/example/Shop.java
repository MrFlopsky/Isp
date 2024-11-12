package example;

import java.util.ArrayList;
import java.util.List;

public class Shop {
    private List<Tablet> tablets;
    private List<Smartphone> smartphones;
    public Shop() {
        this.tablets = new ArrayList<>();
        this.smartphones = new ArrayList<>();
    }
    public void addTablets(List<Tablet> tablets) {
        this.tablets.addAll(tablets);
    }

    public void addSmartphone(List<Smartphone> smartphones) {
        this.smartphones.addAll(smartphones);
    }

    public void removeTablets(List<Tablet> tablets) {
        this.tablets.removeAll(tablets);
    }

    public void removeSmartphones(List<Smartphone> smartphones) {
        this.tablets.removeAll(smartphones);
    }

    public List<Tablet> getTablets() {
        return tablets;
    }

    public List<Smartphone> getSmartphones() {
        return smartphones;
    }
}