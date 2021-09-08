package edu.iis.mto.oven;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.junit.jupiter.api.Assertions.fail;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.doThrow;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

@ExtendWith(MockitoExtension.class)
class OvenTest {

    @Mock
    HeatingModule heatingModule;

    @Mock
    Fan fan;

    Oven oven;

    BakingProgram bakingProgram;

    List<ProgramStage> programStages = List.of(
            ProgramStage.builder()
                    .withStageTime(180)
                    .withHeat(HeatType.THERMO_CIRCULATION)
                    .withTargetTemp(220)
                    .build(),
            ProgramStage.builder()
                    .withStageTime(30)
                    .withHeat(HeatType.GRILL)
                    .withTargetTemp(220)
                    .build()
    );

    @BeforeEach
    void setUp() {
        oven = new Oven(heatingModule, fan);
        bakingProgram = BakingProgram.builder()
                .withInitialTemp(100)
                .withStages(programStages)
                .build();
    }

    @Test
    void itCompiles() {
        assertThat(true, equalTo(true));
    }

    @Test
    void shouldCreateOvenObjectWithoutThrowingException() {
        Assertions.assertNotNull(oven);
    }

    @Test
    void shouldThrowHeatingExceptionWhenProblemWithThermalCircuitOccurred() throws HeatingException {
        doThrow(HeatingException.class).when(heatingModule).termalCircuit(any(HeatingSettings.class));
        Assertions.assertThrows(OvenException.class, () -> oven.runProgram(bakingProgram));
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
