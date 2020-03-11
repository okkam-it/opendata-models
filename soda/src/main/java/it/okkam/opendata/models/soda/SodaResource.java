package it.okkam.opendata.models.soda;

public class SodaResource {

  String name;
  String id;
  String description;
  String attribution;
  String type;
  String updatedAt;
  String createdAt;
  String metadata_updated_at;
  String data_updated_at;
  SodaPageViews page_views;
  String[] columns_field_name;
  String[] columns_name;
  String[] columns_description;
  String[] columns_datatype;
  SodaColumnFormat[] columns_format;
  String[] parent_fxf;
  String provenance;
  long download_count;
  String lens_view_type;
  String blob_mime_type;
  boolean hide_from_data_json;
  String attribution_link;
  String contact_email;
  String publication_date;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String[] getParent_fxf() {
    return parent_fxf;
  }

  public void setParent_fxf(String[] parent_fxf) {
    this.parent_fxf = parent_fxf;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getAttribution() {
    return attribution;
  }

  public void setAttribution(String attribution) {
    this.attribution = attribution;
  }

  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public String getUpdatedAt() {
    return updatedAt;
  }

  public void setUpdatedAt(String updatedAt) {
    this.updatedAt = updatedAt;
  }

  public String getCreatedAt() {
    return createdAt;
  }

  public void setCreatedAt(String createdAt) {
    this.createdAt = createdAt;
  }

  public String getMetadata_updated_at() {
    return metadata_updated_at;
  }

  public void setMetadata_updated_at(String metadata_updated_at) {
    this.metadata_updated_at = metadata_updated_at;
  }

  public String getData_updated_at() {
    return data_updated_at;
  }

  public void setData_updated_at(String data_updated_at) {
    this.data_updated_at = data_updated_at;
  }

  public SodaPageViews getPage_views() {
    return page_views;
  }

  public void setPage_views(SodaPageViews page_views) {
    this.page_views = page_views;
  }

  public String[] getColumns_name() {
    return columns_name;
  }

  public void setColumns_name(String[] columns_name) {
    this.columns_name = columns_name;
  }

  public String[] getColumns_field_name() {
    return columns_field_name;
  }

  public void setColumns_field_name(String[] columns_field_name) {
    this.columns_field_name = columns_field_name;
  }

  public String[] getColumns_datatype() {
    return columns_datatype;
  }

  public void setColumns_datatype(String[] columns_datatype) {
    this.columns_datatype = columns_datatype;
  }

  public String[] getColumns_description() {
    return columns_description;
  }

  public void setColumns_description(String[] columns_description) {
    this.columns_description = columns_description;
  }

  public SodaColumnFormat[] getColumns_format() {
    return columns_format;
  }

  public void setColumns_format(SodaColumnFormat[] columns_format) {
    this.columns_format = columns_format;
  }

  public long getDownload_count() {
    return download_count;
  }

  public void setDownload_count(long download_count) {
    this.download_count = download_count;
  }

  public String getProvenance() {
    return provenance;
  }

  public void setProvenance(String provenance) {
    this.provenance = provenance;
  }

  public String getAttribution_link() {
    return attribution_link;
  }

  public void setAttribution_link(String attribution_link) {
    this.attribution_link = attribution_link;
  }

  public String getContact_email() {
    return contact_email;
  }

  public void setContact_email(String contact_email) {
    this.contact_email = contact_email;
  }

  public String getLens_view_type() {
    return lens_view_type;
  }

  public void setLens_view_type(String lens_view_type) {
    this.lens_view_type = lens_view_type;
  }

  public String getBlob_mime_type() {
    return blob_mime_type;
  }

  public void setBlob_mime_type(String blob_mime_type) {
    this.blob_mime_type = blob_mime_type;
  }

  public boolean isHide_from_data_json() {
    return hide_from_data_json;
  }

  public void setHide_from_data_json(boolean hide_from_data_json) {
    this.hide_from_data_json = hide_from_data_json;
  }

  public String getPublication_date() {
    return publication_date;
  }

  public void setPublication_date(String publication_date) {
    this.publication_date = publication_date;
  }

}
