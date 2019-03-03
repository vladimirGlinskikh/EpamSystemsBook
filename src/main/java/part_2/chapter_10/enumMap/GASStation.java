package part_2.chapter_10.enumMap;

public enum GASStation {
    DT(50), A80(30), A92(30), A95(50), GAS(40);
    private Integer maxVolume;

    GASStation(Integer maxVolume) {
        this.maxVolume = maxVolume;
    }

    public Integer getMaxVolume() {
        return maxVolume;
    }
}
