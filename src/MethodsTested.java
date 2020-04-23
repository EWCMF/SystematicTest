public class MethodsTested {
    public boolean validateLength(String text) {
        return text.length() >= 1 && text.length() <= 30;
    }

    public int maxValueOf(int a, int b) {
        return Math.max(a, b);
    }
}
