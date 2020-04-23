import java.util.HashMap;

public class MethodsTested {
    public boolean validateLength(String text) {
        return text.length() >= 1 && text.length() <= 30;
    }

    public int maxValueOf(int a, int b) {
        return Math.max(a, b);
    }

    public String findBy(int postnummer) {
        HashMap<Integer, String> byer = new HashMap<>();
        byer.put(4700, "Næstved");
        byer.put(4760, "Vordingborg");
        byer.put(4100, "Ringsted");
        byer.put(4000, "Roskilde");

        return byer.getOrDefault(postnummer, null);
    }
}
