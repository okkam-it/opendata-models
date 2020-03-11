package it.okkam.opendata.models.soda;

public class SodaResult {
  SodaResource resource;
  SodaClassification classification;
  SodaMetadata metadata;
  String permalink;
  String link;
  String preview_image_url;
  SodaOwner owner;

  public SodaResource getResource() {
    return resource;
  }

  public void setResource(SodaResource resource) {
    this.resource = resource;
  }

  public SodaClassification getClassification() {
    return classification;
  }

  public void setClassification(SodaClassification classification) {
    this.classification = classification;
  }

  public SodaMetadata getMetadata() {
    return metadata;
  }

  public void setMetadata(SodaMetadata metadata) {
    this.metadata = metadata;
  }

  public String getPermalink() {
    return permalink;
  }

  public void setPermalink(String permalink) {
    this.permalink = permalink;
  }

  public String getLink() {
    return link;
  }

  public void setLink(String link) {
    this.link = link;
  }

  public SodaOwner getOwner() {
    return owner;
  }

  public void setOwner(SodaOwner owner) {
    this.owner = owner;
  }

  public String getPreview_image_url() {
    return preview_image_url;
  }

  public void setPreview_image_url(String preview_image_url) {
    this.preview_image_url = preview_image_url;
  }

}
