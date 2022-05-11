package com.blog.pojo;

import org.springframework.stereotype.Component;

@Component
public class Photo {

  private long photoId;
  private String photoAddr;
  private long photoUserId;

  public Photo() {
  }

  public Photo(String photoAddr, long photoUserId) {
    this.photoAddr = photoAddr;
    this.photoUserId = photoUserId;
  }

  public long getPhotoId() {
    return photoId;
  }

  public void setPhotoId(long photoId) {
    this.photoId = photoId;
  }


  public String getPhotoAddr() {
    return photoAddr;
  }

  public void setPhotoAddr(String photoAddr) {
    this.photoAddr = photoAddr;
  }


  public long getPhotoUserId() {
    return photoUserId;
  }

  public void setPhotoUserId(long photoUserId) {
    this.photoUserId = photoUserId;
  }

}
