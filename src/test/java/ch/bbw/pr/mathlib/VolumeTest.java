package ch.bbw.pr.mathlib;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Tests fuer {@link Volume}.
 *
 * @author Milo Ruf, 5IA23b
 */
class VolumeTest {

    private final Volume volume = new Volume();
    private static final double DELTA = 1e-9;

    @Test
    void cylinder_computesCorrectVolume() {
        // V = pi * 2^2 * 5 = 20*pi
        assertEquals(20 * Math.PI, volume.cylinder(2, 5), DELTA);
    }

    @Test
    void sphere_computesCorrectVolume() {
        // V = 4/3 * pi * 3^3 = 36*pi
        assertEquals(36 * Math.PI, volume.sphere(3), DELTA);
    }

    @Test
    void cube_computesCorrectVolume() {
        assertEquals(27.0, volume.cube(3), DELTA);
    }
}
