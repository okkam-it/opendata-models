package it.okkam.opendata.models.soda;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class SodaColumnFormat {

  @JsonIgnore
  String view;

  @JsonIgnore
  String align;

  @JsonIgnore
  String precisionStyle;

  @JsonIgnore
  String noCommas;

  public String getView() {
    return view;
  }

  public void setView(String view) {
    this.view = view;
  }

  public String getAlign() {
    return align;
  }

  public void setAlign(String align) {
    this.align = align;
  }

  public String getPrecisionStyle() {
    return precisionStyle;
  }

  public void setPrecisionStyle(String precisionStyle) {
    this.precisionStyle = precisionStyle;
  }

  public String getNoCommas() {
    return noCommas;
  }

  public void setNoCommas(String noCommas) {
    this.noCommas = noCommas;
  }

}
