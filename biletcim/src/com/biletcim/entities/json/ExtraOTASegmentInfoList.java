package com.biletcim.entities.json;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
/**
 * Awesome Pojo Generator
 * */
public class ExtraOTASegmentInfoList{
  @SerializedName("isAvailable")
  @Expose
  private Boolean isAvailable;
  @SerializedName("isConnected")
  @Expose
  private Boolean isConnected;
  @SerializedName("segmentIndex")
  @Expose
  private Integer segmentIndex;
  @SerializedName("isAnadoluJetSegment")
  @Expose
  private Boolean isAnadoluJetSegment;
  @SerializedName("isDomestic")
  @Expose
  private Boolean isDomestic;
  @SerializedName("isStandBySeat")
  @Expose
  private Boolean isStandBySeat;
  public void setĘsAvailable(Boolean isAvailable){
   this.isAvailable=isAvailable;
  }
  public Boolean getĘsAvailable(){
   return isAvailable;
  }
  public void setĘsConnected(Boolean isConnected){
   this.isConnected=isConnected;
  }
  public Boolean getĘsConnected(){
   return isConnected;
  }
  public void setSegmentIndex(Integer segmentIndex){
   this.segmentIndex=segmentIndex;
  }
  public Integer getSegmentIndex(){
   return segmentIndex;
  }
  public void setĘsAnadoluJetSegment(Boolean isAnadoluJetSegment){
   this.isAnadoluJetSegment=isAnadoluJetSegment;
  }
  public Boolean getĘsAnadoluJetSegment(){
   return isAnadoluJetSegment;
  }
  public void setĘsDomestic(Boolean isDomestic){
   this.isDomestic=isDomestic;
  }
  public Boolean getĘsDomestic(){
   return isDomestic;
  }
  public void setĘsStandBySeat(Boolean isStandBySeat){
   this.isStandBySeat=isStandBySeat;
  }
  public Boolean getĘsStandBySeat(){
   return isStandBySeat;
  }
}