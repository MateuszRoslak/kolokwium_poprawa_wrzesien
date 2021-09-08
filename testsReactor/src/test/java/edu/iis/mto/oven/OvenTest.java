package edu.iis.mto.oven;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class OvenTest {

    @Test
    void itCompiles() {
        assertThat(true, equalTo(true));
    }

    @Test
    void shouldCreateOvenObjectWithoutThrowingException() {
        fail("unimplemented");
    }

    @Test
    void shouldThrowHeatingExceptionWhenProblemWithThermalCircuitOccurred() throws HeatingException {
        fail("unimplemented");
    }

    @Test
    void shouldNotInvokeOvenFanWhenBakingWithThermalCircuitOff() {
        fail("unimplemented");
    }

    @Test
    void shouldStartBakingWithCorrectTemperature() {
        fail("unimplemented");
    }

    @Test
    void shouldInvokeHeatMethodWhenBakingWithHeater() {
        fail("unimplemented");
    }

    @Test
    void shouldInvokeGrillMethodWhenBakingWithGrill() {
        fail("unimplemented");
    }
}
