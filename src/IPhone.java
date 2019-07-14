import java.util.Locale;

public class IPhone extends Phone implements Ringable {
    IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return String.format(Locale.getDefault(),
                "iPhone %s says %s",
                getVersionNumber(),getRingTone());
    }
    @Override
    public String unlock() {
        return "Unlocking via facial recognition";
    }
    @Override
    public void displayInfo() {
        System.out.println(String.format(Locale.getDefault(),
                "iPhone %s from %s", getVersionNumber(), getCarrier()));
    }
}
