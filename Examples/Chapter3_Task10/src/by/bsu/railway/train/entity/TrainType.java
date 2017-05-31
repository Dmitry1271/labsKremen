package by.bsu.railway.train.entity;

/**
 * Created by mrbro on 07-Apr-17.
 */
public enum TrainType {
    GENERAL(54),
    COUPE(36),
    BERTH(54),
    LUX(12);

    private final int maxseats;

    TrainType(int maxseats) {
        this.maxseats = maxseats;
    }

    public int getMaxseats() {
        return maxseats;
    }
}
