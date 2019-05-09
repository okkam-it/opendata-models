package it.okkam.opendata.models.soda;

public class SodaResourceResponse {

  private SodaResult[] results;
  private int resultSetSize;
  private SodaTimings timings;

  public SodaResourceResponse() {}

  public SodaResult[] getResults() {
    return results;
  }

  public void setResults(SodaResult[] results) {
    this.results = results;
  }

  public int getResultSetSize() {
    return resultSetSize;
  }

  public void setResultSetSize(int resultSetSize) {
    this.resultSetSize = resultSetSize;
  }

  public SodaTimings getTimings() {
    return timings;
  }

  public void setTimings(SodaTimings timings) {
    this.timings = timings;
  }

}
