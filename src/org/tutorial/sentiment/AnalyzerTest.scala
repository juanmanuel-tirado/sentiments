package org.tutorial.sentiment

import org.junit.Test
import org.junit.Assert.assertEquals

class AnalyzerTest{

  @Test
  def testAnalyzer(): Unit={
    val positive = Analyzer.analyzeSentiment("Everything is going well")
    val negative = Analyzer.analyzeSentiment("Everything is going wrong")
    val neutral = Analyzer.analyzeSentiment("Everything is going so so")

    assertEquals("Not correct positive","Positive",positive)
    assertEquals("Not correct negative","Negative",negative)
    assertEquals("Not correct neutral","Neutral",neutral)
  }
}