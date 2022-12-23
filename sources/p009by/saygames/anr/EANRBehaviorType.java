package p009by.saygames.anr;

/* renamed from: by.saygames.anr.EANRBehaviorType */
public enum EANRBehaviorType {
    None(0),
    UnityBackgroundOnly(1),
    NetworksBackgroundOnly(2),
    UnityAndNetworksBackground(3),
    NetworksBackgroundAndForeground(4),
    UnityBackgroundAndNetworksBackgroundAndForeground(5),
    All(6);
    
    private final int value;

    private EANRBehaviorType(int i) {
        this.value = i;
    }

    public int getValue() {
        return this.value;
    }

    public static EANRBehaviorType ConvertIntToEANRBehaviorType(int i) {
        switch (i) {
            case 1:
                return UnityBackgroundOnly;
            case 2:
                return NetworksBackgroundOnly;
            case 3:
                return UnityAndNetworksBackground;
            case 4:
                return NetworksBackgroundAndForeground;
            case 5:
                return UnityBackgroundAndNetworksBackgroundAndForeground;
            case 6:
                return All;
            default:
                return None;
        }
    }
}
