package day2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProbabilityTest {
  @Test
  void shouldNotThrowExceptionIfValueIsBetween0And1() {
    assertDoesNotThrow(() -> new Probability(0.1));
  }

  @Test
  void shouldTrowExceptionIfValueIsBelow0() {
    assertThrows(InvalidProbabilityException.class, () -> new Probability(-0.1));
  }

  @Test
  void shouldTrowExceptionIfValueIsAbove1() {
    assertThrows(InvalidProbabilityException.class, () -> new Probability(1.1));
  }

  @Test
  void shouldReturnNotOfGivenProbability() throws InvalidProbabilityException {
    Probability probability = new Probability(0.3D);
    Probability expected = new Probability(0.7D);
    assertEquals(expected, probability.not());
  }

  @Test
  void shouldReturnTheAndOfTwoProbability() throws InvalidProbabilityException {
    Probability probability1 = new Probability(0.3D);
    Probability probability2 = new Probability(0.7D);
    Probability expected = new Probability(0.21D);
    assertEquals(expected, probability1.and(probability2));
  }

  @Test
  void shouldReturnTheOrOfTwoProbability() throws InvalidProbabilityException {
    Probability probability1 = new Probability(0.5D);
    Probability probability2 = new Probability(0.5D);
    Probability expected = new Probability(0.75D);
    assertEquals(expected, probability1.or(probability2));
  }
}