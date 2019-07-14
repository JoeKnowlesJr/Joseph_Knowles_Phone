import java.util.Locale;

public class Galaxy extends Phone implements Ringable {
    Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return String.format(Locale.getDefault(),
                "Galaxy %s says %s",
                getVersionNumber(),getRingTone());
    }
    @Override
    public String unlock() {
        return "Unlocking via fingerprint";
    }
    @Override
    public void displayInfo() {
        System.out.println(String.format(Locale.getDefault(),
                "Galaxy %s from %s", getVersionNumber(), getCarrier()));
    }
}
