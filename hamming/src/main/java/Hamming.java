import java.util.stream.IntStream;

public class Hamming {
    String leftStrand;
    String rightStrand;

    public Hamming(String leftStrand, String rightStrand) {
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

        if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        if (!leftStrand.isEmpty() && rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    public int getHammingDistance() {


        return (int) IntStream.range(0, leftStrand.length())
                .filter(i -> leftStrand.charAt(i) != rightStrand.charAt(i))
                .count();
    }
}
