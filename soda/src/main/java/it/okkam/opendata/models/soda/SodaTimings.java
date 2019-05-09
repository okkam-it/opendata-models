package it.okkam.opendata.models.soda;

public class SodaTimings {

  long serviceMillis;
  long[] searchMillis;

  public long getServiceMillis() {
    return serviceMillis;
  }

  public void setServiceMillis(long serviceMillis) {
    this.serviceMillis = serviceMillis;
  }

  public long[] getSearchMillis() {
    return searchMillis;
  }

  public void setSearchMillis(long[] searchMillis) {
    this.searchMillis = searchMillis;
  }

}
