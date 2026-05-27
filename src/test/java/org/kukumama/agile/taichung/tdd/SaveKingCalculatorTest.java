package org.kukumama.agile.taichung.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SaveKingCalculatorTest {

    @Test
    void one_candidate() {

        SaveKingCalculator sut = new SaveKingCalculator();

        String actual = sut.calculate("Chen");

        Assertions.assertThat(actual).isEqualTo("Chen");

    }
}