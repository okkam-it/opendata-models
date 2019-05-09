package it.okkam.opendata.models.soda;

import java.util.Map;

public class SodaClassification {

  String[] categories;
  String[] tags;
  String domain_category;
  String[] domain_tags;
  Map<String, String>[] domain_metadata;

  public String[] getCategories() {
    return categories;
  }

  public void setCategories(String[] categories) {
    this.categories = categories;
  }

  public String[] getTags() {
    return tags;
  }

  public void setTags(String[] tags) {
    this.tags = tags;
  }

  public String getDomain_category() {
    return domain_category;
  }

  public void setDomain_category(String domain_category) {
    this.domain_category = domain_category;
  }

  public String[] getDomain_tags() {
    return domain_tags;
  }

  public void setDomain_tags(String[] domain_tags) {
    this.domain_tags = domain_tags;
  }

  public Map<String, String>[] getDomain_metadata() {
    return domain_metadata;
  }

  public void setDomain_metadata(Map<String, String>[] domain_metadata) {
    this.domain_metadata = domain_metadata;
  }

}
