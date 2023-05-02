package hw.hw_1.support;

/**
 * Тип упаковки (тары)
 * bottle(0.5) - пластиковая бытулка объемом 0,5 л
 * can(0.33) - металлическая банка 0,33 л
 */
public enum Tare {

    bottle(0.5), can(0.33);

    private Double volume; // добавить поле материала тары (пластик, стекло, металл)

    public Double getVolume() {
        return volume;
    }

    Tare(Double volumeTare) {
        this.volume = volumeTare;
    }
}
