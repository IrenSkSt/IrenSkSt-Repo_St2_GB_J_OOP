package hw.hw_1.support;

public enum Tare {
    bottle(0.5), can(0.33);

    private Double volume;

    public Double getVolume() {
        return volume;
    }

    Tare(Double volumeTare) {
        this.volume = volumeTare;
    }
}
